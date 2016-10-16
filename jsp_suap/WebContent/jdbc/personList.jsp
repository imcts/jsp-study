<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="basic.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "hr";
	String pw = "hr";
	String driver = "oracle.jdbc.driver.OracleDriver";

	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;

	ArrayList<Person> arr = new ArrayList();

	try {

		Class.forName(driver);

		con = DriverManager.getConnection(url, id, pw);
		stmt = con.createStatement();

		String sql = "select * from person";

		rs = stmt.executeQuery(sql);

		while (rs.next()) {
			Person per = new Person("","",0);//오ㅗ류나서주석짓.
			per.setId(rs.getString("id"));
			per.setPw(rs.getString("pw"));
			per.setName(rs.getString("name"));
			per.setTel(rs.getString("tel"));
			per.setAge(rs.getInt("age"));

			arr.add(per);

		}

	} catch (Exception e) {
		e.printStackTrace();
	} finally {
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
	
	request.setAttribute("list", arr);
%>

<jsp:forward page="personListView.jsp"></jsp:forward>

