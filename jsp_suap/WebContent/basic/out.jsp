<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	out.println("아 의미없다.<br>");
	for(int i=0; i<10; i++){
		out.println("땡 탈락 마이너스"+i+"점 <br>");
	}
	
	String id;
	HttpServletRequest httpRequest=request;//(HttpServletRequest)pageContext.getRequest();
	id = httpRequest.getParameter("id"); 
	
	pageContext.getOut().println("id"+id+"<br>");
	
	
%>
	버퍼크기: <%=out.getBufferSize()%><br>
	남은크기: <%=out.getRemaining()%><br>
	
	<%=id %><br>
	
	서버정보 :<%=application.getServerInfo() %><br>
	서버메이져 : <%=application.getMajorVersion() %><br>
	서버마이너 : <%=application.getMinorVersion() %><br>
	
	
</body>
</html>