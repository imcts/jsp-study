package model;

import java.sql.*;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import basic.Person;

public class PersonDao {

/*	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "hr";
	String pw = "hr";
	String driver = "oracle.jdbc.driver.OracleDriver";*/

	Connection con = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	
	
	public PersonDao() {
		try {
		/*	Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);*/
			
			Context init = new InitialContext();
			DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
			con = ds.getConnection();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public boolean logChk(Person per) {
		
		try {
			
			String sql = "select * from person where id=? and pw=?";
		
			stmt=con.prepareStatement(sql);
			
			stmt.setString(1,per.getId());
			stmt.setString(2,per.getPw());
			
			rs=stmt.executeQuery();
			
			rs.next();
		
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			return rs.getInt(1)>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			close();
		}
		
		return false;
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
