<%@page import="java.util.LinkedHashMap"%>
<%@page import="java.util.HashMap"%>
<%@page import="basic.Exam"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	request.setCharacterEncoding("utf-8");
	
	LinkedHashMap map = new LinkedHashMap();
	
	String [] name = request.getParameterValues("name");
	String [] kor = request.getParameterValues("kor");
	String [] eng = request.getParameterValues("eng");
	String [] mat = request.getParameterValues("mat");
	
	for(int i=1; i<=name.length; i++){
		Exam ex =  new Exam(name[i-1],kor[i-1],eng[i-1],mat[i-1]);
		
		map.put(""+i, ex);
	}
	
	application.setAttribute("exam", map);
%>



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	입력완료<br>
	<a href="examVew.jsp">확인</a>
</body>
</html>