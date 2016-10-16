package model;

import java.io.File;
import java.sql.*;
import java.util.ArrayList;

import javax.naming.*;
import javax.sql.*;

public class BoardListDao {
	Connection con; //커넥션풀에서 빌려올 커넥션을 담아둘 커넥션 변수선언.
	ResultSet rs; //결과값을 받아서 저장할 변수선언.
	PreparedStatement stmt; //sql문을 연동시켜줄 변수선언.
	DataSource ds; //커넥션풀의 드라이버 값을 가지고있을 변수 선언.
	Context ini; //외부 xml의 값을 참조하기 위한 context변수선언.
	String sql;//sql문을 작성 하기 위한 변수 선언.
	
	
	public BoardListDao() { //BoardDao생성자.
		try {
			this.ini= new InitialContext();//외부 xml의 값을 가지고 오기 위한 Context생성.
			this.ds = (DataSource) ini.lookup("java:comp/env/jdbc/OracleDB"); //ini가 가지고 있는 xml에 따라 jdbc드라이버로부터 커넥션풀을 구축.
			this.con=this.ds.getConnection(); //커넥션풀로부터 커넥션을 빌려와서, 내가 가지고 있는 커넥션 변수에 커넥션을 빌려옴.
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//아 ... 커넥션풀이라는놈은 DB에 있는 커넥션 객체를 maxActive만큼 가지고 와서 커넥션을 빌려주고, 다시 반납 받는구조였구만; 어쩐지 뭔가 이상하드라 - _- 
		//그래서 maxActive와 maxIdle이 조정될 수 있었던 거네 !! - _- ... 
	}
	
	
	
	
public Object getList(BoardBean bb){//게시판 리스트를 가져올 메소드. 어차피 atrribute에 띄워줄 것이니 Object로 리턴.
		ArrayList list = new ArrayList();//게시판의 리스트를 담아줄 리스트 생성.
		
try {
			
			sql = "select count(*) from notice"; 
			//notice에 현재 몇번째 글까지 있는지를 알기 위한 카운트값을 가져오는 sql쿼리문.
			
			
			stmt=con.prepareStatement(sql);//stmt에 커넥션 경로를 알려줌.
			
			rs = stmt.executeQuery();//sql문장 전송후 resultset에 저장.
			
			rs.next(); //rs에서 꺼냄.
			
			bb.setTotalPage(rs.getInt(1)/bb.getLimit()); //TotalPage는 전체 글 / 내가 제한을 둔 수 만큼이 된다. 
			
			if(rs.getInt(1) % bb.getLimit()>0){//만약  가져온 총 글의 양을 내가 제한으로 둔 값만큼 나누었을시, 그 값이 0보다 크다면,
				bb.totalPage++;//토탈페이지의 수는 +1 해주어야 한다.
			}
			
			
			
			sql = "select * from "+
					" (select rownum rnum, kk.* from "+  
					" (select * from notice order by gid desc, seq) kk)"
					+ " where rnum >= ? and rnum <= ?";
			//sql쿼리문 내용 해석 :
			//1) select * from notice order by gid desc, seq -> notct 테이블에서 oreder by gid기준으로 dec, 그후 seq순으로 
			//기본 정렬시킨 테이블을 하나의 테이블로 보고 , 그 테이블의 이름은 kk로 변칭한다. 
			//2) select rownum rnum, kk.* from -> 1번에서 실행시킨 테이블을 기준으로, rownum함수를 실행, 그 별칭은 alias rnum으로 지칭, 
			//1번테이블에 있는 모든 글들에 rownum 행번호를 부여한다.
			//3)그리고 집계된 테이블을 보는데, 행번호가 내가 지정해놓은 getStart보다 크거나 같아야 하고, 행번호가 내가 지정한 getEnd값보다 작거나 같아야 한다. 
			//그 결과 행 번호를 기준으로 값이 뽑혀 나오게 된다. 즉,테이블을 서브 쿼리 하여 하나의 테이블로 병합하고, 그 결과값을 기준으로, 어디서부터 어디까지 가져올지를
			//정하게 된다. 
			
			
			stmt=con.prepareStatement(sql); //stmt에 커넥션 경로 알려줌.
			stmt.setInt(1, bb.getStart());//어디서부터 가져올것인지 셋팅.
			stmt.setInt(2, bb.getEnd());//어디까지 가져올것인지 셋팅.
			
			rs = stmt.executeQuery();//쿼리문 실행후 resultSet에 결과값 전달.
			
			while(rs.next()){
				BoardBean bean = new BoardBean();//정보들을 저장할 bean클래스 생성.
				bean.setId(rs.getInt("id"));//아이디값 입력
				bean.setGid(rs.getInt("gid"));//gid값 입력
				bean.setSeq(rs.getInt("seq"));//seq값 입력
				bean.setRef(rs.getInt("ref"));//ref값 입력.
				bean.setCnt(rs.getInt("cnt"));//cnt값 입력
				bean.setReg_date(rs.getDate("reg_date"));//날자값 입력
				bean.setPname(rs.getString("pname"));//작성자 입력
				bean.setTitle(rs.getString("title"));//제목 입력
				if(rs.getInt("rnum")%bean.getLimit()==0){//만약 리미트로 잘랐을때 그 페이지의 마지막 글이라면 ~
					bean.setLast(true);//넌 트루해 ~
				}
				list.add(bean); //리스트에 항목 add.
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			this.close();//커넥션풀 종료.
		}
		
		
		return list;//리스트 리턴.
	}
	
	
public int BoardReply(BoardBean bean){ //답글을 작성하기 위한 메소드.
	
	int id=1;//기본 글번호는 1로 둔다. 답글을 작성하려면 무조건 글이 있어야 하기 때문.
	
	
	try {
		
		BoardBean ori = (BoardBean)getDetail(bean.getId()+""); //현재 가지고 있는 getDetail메소드에서 상세 정보를 빼오고, 그 값을 ori로.
		
		sql = "update notice set seq = seq+1 where gid=? and seq > ?";
		//일단 답글을 다는것에 있어서 보편적인 방법은 이렇다. 
		//1) 내가 어떤 글에 답변을 달기 위해 그 글을 눌렀을시, 그 글의 id값이 parameter로 넘어오게 되는데, 그렇다면 그 파라미터 값을 이용, 
		//현재 그 글에 있는 모든 정보값을 가져온다. 그 후, 그 글에 있는 gid , 즉 그룹 id값을 이용하여 글들을 묶어준다. order by gid 
		//그 후 다시 seq 기준으로 내림차순 정렬을 시켜주면 seq순, 즉, 그룹핑된 id값의 글들이 역순정렬되게 되고, 그 후에 seq순으로 gid값을 기준으로 내림정렬된다.
		//그렇다면 중요한건, 내가 어떤 글을 눌렀을때 그 글이 답글이 되었든, 원글이 되었던 그 글의 id값을 이용, 해당 상세 글번호와 seq번호값, gid값을 가져오고
		//그 값을 이용하여, 답글을 달면 되는 아주 간단한 이야기다. 
		//그렇다면 예를들어 내가 답글에 답글을 달게 된다면, 해당 답글의 gid값에 해당하고, seq가 내가 클릭한 글의 seq보다 높은 녀석들은 무조건 +1 시켜버리면, 
		//내가 클릭한 글 바로 밑에 내가 작성한 댓글이 들어가게 된다는 얘기다. 어차피 BoardList.jsp부에서 넘어오는 ref 값을 이용 스페이스바를 치게 만들어놨으므로,
		//여기에서는 내가 어느 위치에 글이 올라가게 만드느냐가 중요해진다. 고로, 내가 클릭한 글의 gid값을 가진놈들 + 그 글의 seq값보다 큰 값을 가지는(댓글들) 
		//글들이라면 무조건 깊이를 +1 시켜버린다.
		
		
		stmt=con.prepareStatement(sql);//커넥션풀에서 빌려온 경로를 stmt에 대입.
		
		stmt.setInt(1, ori.getGid());//gid값을 넣어주고, 
		stmt.setInt(2, ori.getSeq());//seq값을 넣어준다.
		
		stmt.executeUpdate();//쿼리문 실행.
		
		
		
		
		
		
		
		
		sql = "select max(id) from notice";
		//글을 insert하기 위해서는 현재 글번호보다 +1 한녀석의 값이 필요하기때문에 작성되는 쿼리문.
		
		stmt=con.prepareStatement(sql);//커넥션풀로부터 빌려온 경로를 stmt에 대입.
		
		rs = stmt.executeQuery();//쿼리문 실행후 결과값 rs에 저장.
		
		
		if(rs.next()){
			id=rs.getInt(1)+1;//첫번째니께.
		}
		
		
		sql="insert into notice(id,gid,seq,ref,reg_date,cnt,pname,pw,title,content) "
				+ " values(?,?,?,?,sysdate,?,?,?,?,?)";
		//insert를 시키기 위한 쿼리문.
		
		stmt = con.prepareStatement(sql);//커넥션풀로부터 빌려온 경로를 stmt에 대입.
		
		stmt.setInt(1, id);//아이디값 셋팅.
		stmt.setInt(2, ori.getGid());//내가 다는 글이 댓글이므로, 내가 클릭했던 글의 gid값을 가져와서 대입시킨다.
		stmt.setInt(3, ori.getSeq()+1);//내가 다는 글이 댓글이므로, 내가 클릭했던 글의 깊이보다 +1 한 값을 대입시킨다.
		stmt.setInt(4, ori.getRef()+1);//내가 다는 글을 댓글이므로, 내가 클릭했던 글의 레벨보다 +1 한 값을 대입시킨다.
		stmt.setInt(5, -1);//조회수 값 셋팅.
		stmt.setString(6, bean.getPname());//작성자 셋팅.
		stmt.setString(7, bean.getPw());//비밀번호 셋팅.
		stmt.setString(8, bean.getTitle());//제목 셋팅.
		stmt.setString(9, bean.getContent());//내용 셋팅.
		
		stmt.executeUpdate();//쿼리문 실행
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally{
		this.close();//close실행.
	}
	
	
	return id; //id값 리턴.
	
}
	
	public Object getDetail(String id){//클라이언트가 선택한 글의 상세내용을 가져오기 위해 인수로 글의 번호를 받아오는 메소드.
	
		BoardBean bean = new BoardBean();//조회한 글의 정보를 담기 위한 bean클래스.
		
		try {
			this.sql ="update notice set cnt=cnt+1 where id =?"; //조회수를 1 증가 시키기 위한 쿼리문.
			this.stmt=this.con.prepareStatement(sql);//sql문을 전달하기 위한  PrepararedStatement가 DB와 교신하도록 커넥션의 경로를 알려줌.
			this.stmt.setString(1, id);//sql구문의 값을 셋팅.
			
			this.stmt.executeUpdate();//쿼리 업데이트 실행.
			
			
			this.sql="select * from notice where id=?"; //쿼리문을 작성하기 위한 sql구문.
			this.stmt=this.con.prepareStatement(this.sql);//sql문을 전달하기 위한  PrepararedStatement가 DB와 교신하도록 커넥션의 경로를 알려줌.
			this.stmt.setString(1, id); //sql구문의 값을 셋팅. where절의 값을 대입.
			
			this.rs=this.stmt.executeQuery();//결과값을 resultSet에 대입.
			
			
			if(rs.next()){ //가져온 정보가 있다면.
				bean.setTitle(rs.getString("title")); //제목값을 입력.
				bean.setId(rs.getInt("id"));//글번호를 입력
				bean.setGid(rs.getInt("gid"));//gid입력.
				bean.setSeq(rs.getInt("seq"));//seq값을 입력.
				bean.setPname(rs.getString("pname"));//작성자를 입력.
				bean.setReg_date(rs.getDate("reg_date"));//작성일자를 입력.
				bean.setCnt(rs.getInt("cnt"));//조회수를 입력.
				bean.setContent(rs.getString("content"));//글의 내용을 입력.
				bean.setUpfile(rs.getString("upfile"));//파일의 이름을 입력.
				bean.setOrifile(rs.getString("orifile"));
				
			}
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return bean; //정보값을 가지고 있는 bean클래스를 리턴.
	}
	
	
	public int writeContent(BoardBean bean){//글을 입력하기 위한 메소드. 
		int id=1;//현재 작성한 글번호를 받기 위한 int값. 
		
		try {
			this.sql="select max(id) from notice"; //다음번의 글번호를 가져오기 위한 sql문.
			
			this.stmt=this.con.prepareStatement(sql);//sql문을 전달하기 위한  PrepararedStatement가 DB와 교신하도록 커넥션의 경로를 알려줌.
			this.rs=this.stmt.executeQuery();//쿼리문 실행후, 결과값 rs에 대입.
			
			if(rs.next()){ //결과값이 있다면.
				id = rs.getInt(1)+1;//첫번째 값을 가져온 후 그 값에 +1 
			}
			
			
			
			this.sql="insert into notice(id,gid,seq,ref,reg_date,cnt,pname,pw,title,content,upfile,orifile) "
					+ " values(?,?,?,?,sysdate,?,?,?,?,?,?,?)"; //insert를 실행하기 위한 sql문 작성.
			
			this.stmt=this.con.prepareStatement(sql);//sql문을 전달하기 위한  PrepararedStatement가 DB와 교신하도록 커넥션의 경로를 알려줌.
			
			
			stmt.setInt(1, id); //id값 셋팅.
			stmt.setInt(2, id); //gid값 셋팅.
			stmt.setInt(3, 0); //seq셋팅.
			stmt.setInt(4, 0); //ref값 셋팅
			stmt.setInt(5, -1); //cnt의 값 셋팅, 글을 작성하자마자 detail단에서 조회수를 1올려주므로 초기값은 -1 
			stmt.setString(6, bean.getPname());//pname값 셋팅
			stmt.setString(7, bean.getPw());//pw값 셋팅
			stmt.setString(8, bean.getTitle());//title값 셋팅
			stmt.setString(9, bean.getContent());//content값 셋팅
			stmt.setString(10, bean.getUpfile());//upfile값 세싱
			stmt.setString(11, bean.getOrifile());//orifile값 셋팅
			
			
			this.stmt.executeUpdate(); //쿼리문 실행  !! insert 고고씽 ~ 
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.close();//내가 가지고 있는 close메소드 실행 ~ 
		}
		
		return id; //글넘버의 값 리턴 ! 
	}
	
	public boolean PwChk(BoardBean bean){
		boolean result=false;
		try {
			
			this.sql="select * from notice where id=? and pw=?"; //notice의 모든 테이블을 조회하여 가져오게 할 sql구문.
			this.stmt=this.con.prepareStatement(sql); //sql문을 전달하기 위한  PrepararedStatement가 DB와 교신하도록 커넥션의 경로를 알려줌. 
			this.stmt.setInt(1, bean.getId());
			this.stmt.setString(2, bean.getPw());
			
			this.rs=this.stmt.executeQuery(); //stmtfh 데이터베이스와 연동 후, 가져온 값을 ResultSet에 담음. 
		
			result = this.rs.next();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.close();//열려있는 rs와 stmt와 빌려온 커넥션을 반납.
		}
		
		return result;
	}
	
	public void BoardModify(BoardBean bean){
		
		try {
		
			sql="update notice set title=?, content=?, upfile=?, orifile=? where id = ?";
			//수정한 내용을 업데이트 시키기 위한, sql구문.
			stmt = con.prepareStatement(sql); //sql문장 실행.
			
			stmt.setString(1, bean.getTitle());//타이틀 셋팅
			stmt.setString(2, bean.getContent());//내용셋팅
			stmt.setString(3, bean.getUpfile());//시스템파일명셋팅.
			stmt.setString(4, bean.getOrifile());//오리지널파일명셋팅
			stmt.setInt(5, bean.getId());//글번호 입력.
			
			stmt.executeUpdate(); //쿼리문 실행.
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			this.close(); //클로즈.
		}
		
		

	}

	
	
	public void BoardDelete(String str){//글삭제를 위한 메소드
		
		int id = Integer.parseInt(str); //아이디값 파세인트로 저장.
			
			try {
				sql = "delete from notice where id=?"; //글을 삭제 하기 위한 쿼리문 작성.
				
				stmt=con.prepareStatement(sql);//커넥션으로부터 경로 받아옴.
				stmt.setInt(1, id);//글번호 셋팅.
				
				
				stmt.executeUpdate();//쿼리문 실행.
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				this.close();//클로즈.
			}
			
		}
		

	public void FileDelete(String str){
			
		int id = Integer.parseInt(str); //아이디값 파세 인트.
		
			try {
			
					sql="update notice set upfile='',orifile='' where id = ?";
					//수정도중 파일을 지웠을 경우 데이터베이스 파일 이름 초기화를 위한 쿼리문 작성.
					stmt = con.prepareStatement(sql);//커넥션 값 받아옴.
				
					stmt.setInt(1, id);//아이디값 셋팅.
					
					stmt.executeUpdate();//쿼리문 전송
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				this.close();//클로즈.
			}
		}

	
	public void close() {

		try {
			if (this.rs != null) { // rs가 열려있으면
				this.rs.close();// 닫아줌.
			}
			if (this.stmt != null) { // stmt가 열려있으면
				this.stmt.close();// 닫아줌.
			}
			if (this.con != null) { // 커넥션을 빌려왔다면
				this.con.close(); // 반납함.
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
