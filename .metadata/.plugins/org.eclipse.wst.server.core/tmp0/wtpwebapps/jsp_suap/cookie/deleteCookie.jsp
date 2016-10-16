<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	Cookie coo1 = new Cookie("coo1", "");//일단 값이 없음.
	coo1.setPath("/jsp_suap/cookie/path1");
	coo1.setMaxAge(0);//초 단위를 구성해야한다.
	response.addCookie(coo1);

	Cookie coo2 = new Cookie("coo2", "");//일단 값이 없음.
	coo2.setPath("/jsp_suap/cookie/path2");
	coo2.setMaxAge(0);//초 단위를 구성해야한다.
	response.addCookie(coo2);

	Cookie coo3 = new Cookie("coo3", "");//일단 값이 없음.
	coo3.setPath("/");
	coo3.setMaxAge(0);//초 단위를 구성해야한다.
	response.addCookie(coo3);

	Cookie coo4 = new Cookie("coo4", "");//일단 값이 없음.
	
	coo4.setMaxAge(0);//초 단위를 구성해야한다.
	response.addCookie(coo4);
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>쿠키삭제</title>
</head>
<body>

</body>
</html>