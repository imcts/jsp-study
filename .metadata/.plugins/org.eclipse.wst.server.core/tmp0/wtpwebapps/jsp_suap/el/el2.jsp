<%@page import="basic.Exam2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="exam" class="basic.Exam2" scope="request"/>
<jsp:setProperty property="*" name="exam"/>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setAttribute("jum", 88);
	//request.setAttribute("exam", new Exam("허윤미","90","80","70")); 
%>
${id }
<br>${param.id }
<br>${jum>80 }
<br>${param.id>=80 }
<br>${exam.cal() }
<br>${exam.avg }

</body>
</html>