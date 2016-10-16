<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	Cookie coo1 = new Cookie("coo1","aaa");
	coo1.setPath("/jsp_suap/cookie/path1");
	response.addCookie(coo1);
	
	Cookie coo2 = new Cookie("coo2","bbbb");
	coo2.setPath("/jsp_suap/cookie/path2");
	response.addCookie(coo2);
	
	Cookie coo3 = new Cookie("coo3","ccc");
	coo3.setPath("/");
	response.addCookie(coo3);
	
	Cookie coo4 = new Cookie("coo4","ddd");
	response.addCookie(coo4);
	
	
	
	
%>	


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>쿠키생성</title>
</head>
<body>

</body>
</html>