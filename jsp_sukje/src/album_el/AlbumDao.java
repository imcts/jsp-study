package album_el;

import java.sql.*;
import java.util.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class AlbumDao {
	AlbumBean bean;
	ResultSet rs=null;
	Connection con=null;
	DataSource ds=null;
	Context init=null;
	PreparedStatement stmt=null;
	Map menuMap,artistMap;
	
	
	public AlbumDao(AlbumBean bean) throws Exception {
		this.bean=bean;
		this.init=new InitialContext();
		this.ds=(DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
									
		this.input();
		this.artistSettin();
		this.menuSetting();
	}

	private void artistSettin() throws Exception {
		String sql="select * from artist";
		this.con=this.ds.getConnection();
		this.stmt=con.prepareStatement(sql);
		
		this.rs=this.stmt.executeQuery();
		
		while(rs.next()){
			if(rs.getString("menucall").equals("yunmi")){
				this.artistMap.put(rs.getString("menucall"),
						new Artist(rs.getString("name"),rs.getString("jop"),rs.getInt("age")));
			}
			else if(rs.getString("menucall").equals("hyosung")){
				this.artistMap.put(rs.getString("menucall"),
						new Artist(rs.getString("name"),rs.getString("jop"),rs.getInt("age")));
			}
			else if(rs.getString("menucall").equals("yuri")){
				this.artistMap.put(rs.getString("menucall"),
						new Artist(rs.getString("name"),rs.getString("jop"),rs.getInt("age")));
			}
			
		}
		
		this.bean.setArtistMap(this.artistMap);
		
		this.close();
	}

	
	
	private void menuSetting() throws Exception {
		String sql="select * from albummenu";
		this.con=this.ds.getConnection();
		this.stmt=this.con.prepareStatement(sql);
		
		this.rs=this.stmt.executeQuery();
		
		
		while(rs.next()){
			if(rs.getString("menucall").equals("top")){
				((List)menuMap.get("top")).add(new Menu(rs.getString("menukey"),rs.getString("menuview")));
			}
			else if(rs.getString("menucall").equals("info")){
				((List)menuMap.get("info")).add(new Menu(rs.getString("menukey"),rs.getString("menuview")));
			}
			else if(rs.getString("menucall").equals("artist")){
				((List)menuMap.get("artist")).add(new Menu(rs.getString("menukey"),rs.getString("menuview")));
			}
			else{
				((List)menuMap.get("center")).add(new Menu(rs.getString("menukey"),rs.getString("menuview")));
			}
		}
		
		this.bean.setMenuMap(this.menuMap);  
	
	
		this.close();
	
	} 
	

	private void input() {
		this.menuMap=new HashMap();
		this.menuMap.put("top", new ArrayList());
		this.menuMap.put("info", new ArrayList());
		this.menuMap.put("artist", new ArrayList());
		this.menuMap.put("center", new ArrayList());
		
		this.artistMap=new HashMap();
	}
	
	public HashMap getUser() throws Exception{
		HashMap map = new HashMap();
		String sql="select * from person";
		this.con=this.ds.getConnection();
		this.stmt=this.con.prepareStatement(sql);
		
		this.rs=this.stmt.executeQuery();
		
		
		while(rs.next()){
			map.put(rs.getString("id"), rs.getString("pw"));
		}
		
		
		this.close();
		
		return map;
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
