<%@page import="basic.Exam"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	HttpSession se = session;
	se = request.getSession();
	se = pageContext.getSession();
	se.setMaxInactiveInterval(5);
	
	
	se.setAttribute("id", "주현아 모해");
	se.setAttribute("id", "주현아 더듬지마.");
	se.setAttribute("pw", "비밀번호.");
	
	session.setAttribute("exam", new Exam("최태산","90","90","100"));
	%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>세션 수정.</title>
</head>
<body>

</body>
</html>