<%@page import="basic.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<br>\${5+7}=${5+7} 
<br>\${5-7}=${5-7} 
<br>\${5*7}=${5*7} 
<br>\${5/7}=${5/7} 
<br>\${5%7}=${5%7} 
<br>
<br>\${5 > 7}=${5 > 7} 
<br>\${5 < 7}=${5 < 7} 
<br>\${5 >= 7}=${5 >= 7} 
<br>\${5 <= 7}=${5 <= 7} 
<br>\${5 == 7}=${5 == 7} 
<br>\${5 != 7}=${5 != 7} 
<br>
<br>\${true && true}=${true && true}
<br>\${false && true}=${false && true}
<br>\${true || true}=${true || true}
<br>\${false || true}=${false || true}
<br>
<br>\${true and true}=${true and true}
<br>\${false and true}=${false and true}
<br>\${true or true}=${true or true}
<br>\${false or true}=${false or true}
<%-- <br>\${true and true}=${true and true} --%> <!-- 얘는 꺼져 -->
<br>
<br>\${5>7 ? "맞아요" : "틀려요"} = ${5>7 ? "맞아요" : "틀려요"}
<br>
<br>\${50 > 90 ? "수" : 
		50>80 ? "우": 
		50>70 ? "미" :
		50>60 ? "양" :
		"가" } = ${50 > 90 ? "수" : 
		50>80 ? "우": 
		50>70 ? "미" :
		50>60 ? "양" :
		"가" }
		
		
<%
	session.setAttribute("id", "aaa");
	request.setAttribute("per", new Person("허윤미","010-1234-5678",25));
	
%>
<br>id : ${id }
<br>per : ${per.name }

<%
	request.setAttribute("id", "ccc");
%>

<br>id : ${id }
<br>sessionScpope.id : ${sessionScope.id }
<br>requestScope.id : ${requestScope.id }
<%
	request.removeAttribute("id");
	
%>
		
</body>
</html>