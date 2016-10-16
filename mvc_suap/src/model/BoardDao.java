package model;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.sun.org.apache.xml.internal.security.Init;

public class BoardDao {
	Connection con;
	PreparedStatement stmt;
	ResultSet rs;
	String sql;
	
	public BoardDao() {
		try {
			Context init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
			this.con=ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Object BoardList(BoardBean bb){
		
	
		List<BoardBean> list = new ArrayList();  
		
		try {
			
			sql = "select count(*) from notice";
			
			stmt=con.prepareStatement(sql);
			
			rs = stmt.executeQuery();
			
			rs.next(); 
			
			bb.setTotalPage(rs.getInt(1)/bb.getLimit());
			
			if(rs.getInt(1)%bb.getLimit()>0){
				bb.totalPage++;
			}
			
			
			
			sql = "select * from "+
					" (select rownum rnum, kk.* from "+  
					" (select * from notice order by gid desc, seq) kk)"
					+ " where rnum >= ? and rnum <= ?";
			
			
			stmt=con.prepareStatement(sql);
			stmt.setInt(1, bb.getStart());
			stmt.setInt(2, bb.getEnd());
			
			rs = stmt.executeQuery();
			
			while(rs.next()){
				BoardBean bean = new BoardBean();
				
				bean.setId(rs.getInt("id"));
				bean.setGid(rs.getInt("gid"));
				bean.setRef(rs.getInt("ref"));
				bean.setCnt(rs.getInt("cnt"));
				bean.setReg_date(rs.getDate("reg_date"));
				bean.setPname(rs.getString("pname"));
				bean.setTitle(rs.getString("title"));
				
				list.add(bean);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			this.close();
		}
		
		
		return list;
	}
	

	
	
	

	public void addCount(String id){
		
		try {
			sql = "update notice set cnt=cnt+1 where id=?";
			
			stmt=con.prepareStatement(sql);
			stmt.setInt(1, Integer.parseInt(id));
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
 	
	
	public Object BoardDetail(String id){
		sql = "select * from notice where id=?";
		
		BoardBean bean=null;
		
		try {
			stmt=con.prepareStatement(sql);
			stmt.setInt(1, Integer.parseInt(id));
			rs = stmt.executeQuery();
			
			if(rs.next()){
				bean = new BoardBean();
				bean.setId(rs.getInt("id"));
				bean.setGid(rs.getInt("gid"));
				bean.setSeq(rs.getInt("seq"));
				bean.setRef(rs.getInt("ref"));
				bean.setCnt(rs.getInt("cnt"));
				bean.setReg_date(rs.getDate("reg_date"));
				bean.setPname(rs.getString("pname"));
				bean.setTitle(rs.getString("title"));
				bean.setContent(rs.getString("content"));
				bean.setUpfile(rs.getString("upfile"));
				
			
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return bean;
	}
	
	public boolean PwChk(BoardBean bean){
		sql = "select * from notice where id=? and pw=?";
		
		
		try {
			stmt=con.prepareStatement(sql);
			stmt.setInt(1, bean.getId());
			stmt.setString(2, bean.getPw());
			rs = stmt.executeQuery();
			
			
			return rs.next();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			this.close();
		}
		
		
		return false;
	}
	
	public int BoardWrite(BoardBean bean){
		
		int id=1;
		
		
		try {
			sql = "select max(id) from notice";
			
			stmt=con.prepareStatement(sql);
			
			rs = stmt.executeQuery();
			
			
			if(rs.next()){
				id=rs.getInt(1)+1;//첫번째니께.
			}
			
			
			sql="insert into notice(id,gid,seq,ref,reg_date,cnt,pname,pw,title,content,upfile) "
					+ " values(?,?,?,?,sysdate,?,?,?,?,?,?)";
			
			stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, id);
			stmt.setInt(2, id);
			stmt.setInt(3, 0);
			stmt.setInt(4, 0);
			stmt.setInt(5, -1);
			stmt.setString(6, bean.getPname());
			stmt.setString(7, bean.getPw());
			stmt.setString(8, bean.getTitle());
			stmt.setString(9, bean.getContent());
			stmt.setString(10, bean.getUpfile());
			
			stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			this.close();
		}
		
		
		return id;
	}
	
	
	
	
public int BoardReply(BoardBean bean){
		
		int id=1;
		
		
		try {
			
			

			BoardBean ori = (BoardBean)BoardDetail(bean.getId()+"");
			
			sql = "update notice set seq = seq+1 where gid=? and seq > ?";
			
			stmt=con.prepareStatement(sql);
			
			stmt.setInt(1, ori.getGid());
			stmt.setInt(2, ori.getSeq());
			
			stmt.executeUpdate();
			
			
			
			
			
			
			
			
			sql = "select max(id) from notice";
			
			stmt=con.prepareStatement(sql);
			
			rs = stmt.executeQuery();
			
			
			if(rs.next()){
				id=rs.getInt(1)+1;//첫번째니께.
			}
			
			
			sql="insert into notice(id,gid,seq,ref,reg_date,cnt,pname,pw,title,content) "
					+ " values(?,?,?,?,sysdate,?,?,?,?,?)";
			
			stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, id);
			stmt.setInt(2, ori.getGid());
			stmt.setInt(3, ori.getSeq()+1);
			stmt.setInt(4, ori.getRef()+1);
			stmt.setInt(5, -1);
			stmt.setString(6, bean.getPname());
			stmt.setString(7, bean.getPw());
			stmt.setString(8, bean.getTitle());
			stmt.setString(9, bean.getContent());
			
			stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			this.close();
		}
		
		
		return id;
		
}
	
	
public void BoardDelete(String str){
		
	int id = Integer.parseInt(str);
	this.FileDelete(str);
		
		try {
			sql = "delete from notice where id=?";
			
			stmt=con.prepareStatement(sql);
			stmt.setInt(1, id);
			
			
			stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			this.close();
		}
		
	}
	

public void FileDelete(String str){
		
	int id = Integer.parseInt(str);
	
		
		try {
			sql = "select * from notice where id=?";
			
			stmt=con.prepareStatement(sql);
			stmt.setInt(1, id);
			
			rs = stmt.executeQuery();
		
			rs.next();
			
			String fileName = rs.getString("upfile");
			
			
			if(fileName!=null && !fileName.equals("") && !fileName.equals("null")){
				System.out.println(fileName);
				File ff = new File("C:\\Users\\TaeSan\\Documents\\JspSave\\mvc_suap\\WebContent\\up\\"+fileName);
				ff.delete();
				
				sql="update notice set upfile='' where id = ?";
				
				stmt = con.prepareStatement(sql);
			
				stmt.setInt(1, id);
				
				stmt.executeUpdate();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

public void BoardModify(BoardBean bean){
	
	try {
	
		sql="update notice set title=?, pname=?, content=?, upfile=? where id = ?";
		
		stmt = con.prepareStatement(sql);
		
		stmt.setString(1, bean.getTitle());
		stmt.setString(2, bean.getPname());
		stmt.setString(3, bean.getContent());
		stmt.setString(4, bean.getUpfile());
		stmt.setInt(5, bean.getId());
		
		stmt.executeUpdate();
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally{
		this.close();
	}
	
	

}


	public void close(){
		
		if(rs!=null){
			try {
				this.rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(stmt!=null){
			try {
				this.stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(con!=null){
			try {
				this.con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
