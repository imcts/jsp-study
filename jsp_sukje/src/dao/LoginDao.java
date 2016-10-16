package dao;

import java.sql.*;
import java.util.ArrayList;

import javax.servlet.http.*;



public class LoginDao {
	HttpServletRequest request;
	HttpSession session;
	Connection con=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	Person per = new Person();


	String mainurl,driver,url,did,dpw,id,pw,detailInfo="",image,loginid,outid,newid,newpw,newtel,newname;
	int loginchk=0,newage;
	
	

	public LoginDao(HttpServletRequest request) throws Exception {
		this.request=request;
		this.session=request.getSession();
		this.mainurl="inc/loginform.jsp";
		this.driver="oracle.jdbc.driver.OracleDriver";
		this.url="jdbc:oracle:thin:@localhost:1521:xe";
		this.did="hr";
		this.dpw="hr";
		
		Class.forName(driver);
		
		select();
		
	}





	private void select() {

		if(session.getAttribute("login")!=null){
			this.loginchk=((LoginDao)session.getAttribute("login")).getLoginchk();
			this.loginid=((LoginDao)session.getAttribute("login")).getLoginid();
		}
	
		
		if(this.loginchk==0 && request.getParameter("id")!=null 
				|| request.getParameter("password")!=null){
			this.id=request.getParameter("id");
			this.pw=request.getParameter("password");			
			this.loginChk();
		}
		
		
		this.userInfo();
		
		if(request.getParameter("detailInfo")!=null){
			this.detailInfo=request.getParameter("detailInfo");
			this.imageChoice();
			this.detailInfo();
		}
		
		if(request.getParameter("memberOut")!=null){
			this.outid=request.getParameter("outid");
			System.out.println(outid);
			this.memberOut();
		}
		
		if(request.getParameter("join")!=null){
			this.mainurl="inc/join.jsp";
		}
		
		if(request.getParameter("newid")!=null){
			this.newid=request.getParameter("newid");
			this.newpw=request.getParameter("newpassword");
			this.newname=request.getParameter("newname");
			this.newtel=request.getParameter("newtel");
			this.newage=Integer.parseInt(request.getParameter("newtel"));
			this.newMember();
		}
		
		this.session.setAttribute("login", this);
		
	}





	private void newMember() {
		String sql="insert into person(id, pw, name, tel, age) values(?,?,?,?,?)";
		int res=-1;
		try {
			con=DriverManager.getConnection(url,did,dpw);
			stmt=con.prepareStatement(sql);
			stmt.setString(1, this.newid);
			stmt.setString(2, this.newpw);
			stmt.setString(3, this.newname);
			stmt.setString(4, this.newtel);
			stmt.setInt(5, this.newage);
			
			res=stmt.executeUpdate();
			
		
		if(res!=-1){
			System.out.println("인서트 성공.");
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.close();
		}
		
		
	}





	private void memberOut() {
		String sql="delete from person where id=?";
		int res=-1;
		try {
			con=DriverManager.getConnection(url,did,dpw);
			
			stmt=con.prepareStatement(sql);
			
			stmt.setString(1, this.outid);
			
			res=stmt.executeUpdate();
			
			
			if(res!=-1){
				this.loginid="";
				this.loginchk=0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.close();
		}
		
	}





	private void imageChoice() {
		if(this.detailInfo.equals("aaa")){
			this.image="yunmi.jpg";
		}
		else if(this.detailInfo.equals("bbb")){
			this.image="hyusung.jpg";
		}
		else if(this.detailInfo.equals("ccc")){
			this.image="gaeun.jpg";
		}
		else if(this.detailInfo.equals("ddd")){
			this.image="upton.jpg";
		}
		else if(this.detailInfo.equals("eee")){
			this.image="yuri.jpg";
		}
	}


	public Person detailInfo() {
		String sql = "select * from person where id=?";
		
		try {
			this.con=DriverManager.getConnection(url,did,dpw);
			stmt=con.prepareStatement(sql);
			
			stmt.setString(1, this.detailInfo);
			
			rs=stmt.executeQuery();
			
			while(rs.next()){
				per.setId(rs.getString("id"));
				per.setName(rs.getString("name"));
				per.setPw(rs.getString("pw"));
				per.setTel(rs.getString("tel"));
				per.setAge(rs.getInt("age"));
				this.mainurl="inc/detailInfo.jsp";
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return per;
		
	}


	public void loginChk(){

		
		String sql = "select * from person where id=? and pw=?";
		
		
		try {
			this.con=DriverManager.getConnection(url,did,dpw);
			this.stmt=con.prepareStatement(sql);

			this.stmt.setString(1, this.id);
			this.stmt.setString(2, this.pw);
			
			
			rs=stmt.executeQuery();
			
			
			while(rs.next()){
				this.loginchk=1;
				this.loginid=this.id;
				this.mainurl="inc/userInfo.jsp";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			this.close();
		}
	}
	
	
	public ArrayList userInfo(){
		ArrayList arr = new ArrayList();
		
		String sql="select * from person";
		
		try {
			this.con=DriverManager.getConnection(url,did,dpw);
			stmt=con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()){
				Person per = new Person();
				
				per.setId(rs.getString("id"));
				per.setName(rs.getString("name"));
				per.setPw(rs.getString("pw"));
				per.setTel(rs.getString("tel"));
				per.setAge(rs.getInt("age"));
				
				arr.add(per);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.close();
		}
		
	
		return arr;
	} 



	private void close() {
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(stmt!=null){
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	
	
	public Person getPer() {
		return per;
	}


	public String getMainurl() {
		return mainurl;
	}
	
	public int getLoginchk() {
		return loginchk;
	}

	public void setLoginchk(int loginchk) {
		this.loginchk = loginchk;
	}
	
	
	public String getImage() {
		return image;
	}
	public String getLoginid() {
		return loginid;
	}

}
