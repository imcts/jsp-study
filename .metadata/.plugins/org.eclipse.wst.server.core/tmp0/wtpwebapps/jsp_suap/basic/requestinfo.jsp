<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=request.getRemoteAddr() %><br>
	<%=request.getContentLength() %><br>
	<%=request.getCharacterEncoding() %><br>
	<%=request.getContentType() %><br>
	<%=request.getProtocol() %><br>
	<%=request.getRequestURI() %><br>
	<%=request.getMethod() %><br>
	<%=request.getContextPath() %><br>
	<%=request.getServerName() %><br>
	<%=request.getServerPort() %><br>
	
	
	
	
	
	
</body>
</html>