<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	Date today = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	out.println(sdf.format(today)+"<br>");
	response.getWriter().println("비 오는 날은 파전에 빠나나 우유<br>"); //출력은 되지만 순서가 뒤죽박죽 되게된다. 
	System.out.println("바닥에다 쓰고 싶어요");
	
%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	이히히히히힣ㅋㅋㅋ<br>
	켈켈켈켈 이반호프 ㅋㅋㅋㅋㅋㅋㅋ<br>
	<%-- <%=sdf.format(today)%> --%>
</body>
</html>