package album;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class AlbumDao {
	
	AlbumBean bean;
	Connection con = null;
	PreparedStatement stmt = null;
	ResultSet rs=null;
	DataSource ds=null;
	Context init=null;
	HashMap menuMap, userMap;
	
	
	
	public AlbumDao(AlbumBean bean) {
		this.bean=bean;
		try {			
			init = new InitialContext();
			ds= (DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
			} catch (Exception e) {
				e.printStackTrace();
			}
		this.input();
		this.menuSeting();
	
	}
	
	
	private void input() {
		this.menuMap=new HashMap<>();
		this.menuMap.put("top", new ArrayList());
		this.menuMap.put("info", new ArrayList());
		this.menuMap.put("center", new ArrayList());
		this.menuMap.put("artist", new ArrayList());
		this.userMap=new HashMap<>();
	}


	public HashMap userSeting() {
		String sql="select * from person";
		try {
			
			con = ds.getConnection();
			stmt=con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()){
				userMap.put(rs.getString("id"), rs.getString("pw"));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			this.close();
		}
		
		return this.userMap;
	}


	

	public void menuSeting(){
		String sql="select * from ALBUMMENU";
		try {
			
			con = ds.getConnection();
			stmt=con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()){
				if(rs.getString("menucall").equals("top")){
					((List)menuMap.get("top")).add(new Menu(rs.getString("menukey"),rs.getString("menuview")));
				}
				else if(rs.getString("menucall").equals("info")){
					((List)menuMap.get("info")).add(new Menu(rs.getString("menukey"),rs.getString("menuview")));
				}
				else if(rs.getString("menucall").equals("center")){
					((List)menuMap.get("center")).add(new Menu(rs.getString("menukey"),rs.getString("menuview")));
				}
				else{
					((List)menuMap.get("artist")).add(new Menu(rs.getString("menukey"),rs.getString("menuview")));
				}
				
			}
			
			this.bean.setMenuMap(this.menuMap);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			this.close();
		}
	}
	
	void close() {

		if (rs != null) {
			try {

				rs.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}

		if (stmt != null) {
			try {
				stmt.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}

		if (con != null) {
			try {
				con.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
	
}
