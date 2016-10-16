<%@page import="java.util.regex.Matcher"%>
<%@page import="java.util.regex.Pattern"%>
<%@page import="basic.StudformList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%request.setCharacterEncoding("utf-8"); //포스트방식으로 보낼 경우 인코딩을 걸어주어야 한다 %>

<%

	StudformList sf1 = new StudformList();
%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" cellpadding="1" cellspacing="1">
		<tr>
			<td>학번</td>
			<td><%=request.getParameter("id") %></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><%=request.getParameter("password") %></td>
		</tr>
		<tr>
			<td>성명</td>
			<td><%=request.getParameter("name") %></td>
		</tr>
		<tr>
			<td>성별</td>
			<td>
			<%=sf1.getStr(request.getParameter("gender"), "gender") %>
			</td>
		</tr>
		<tr>
			<td>취미</td>
			 <td>
			 <%
			 String hoStr = "";
			 String arr [] = request.getParameterValues("hobby"); 
			 for(String ho : arr){
				 hoStr+=sf1.getStr(ho,"hobby")+" ";
			 }
			 
			
			 %>
			<%=hoStr %>
			</td>
		</tr>
		<tr>
			<td>전화</td>
			 <td>
			 
			 <%
			 String tel2=request.getParameter("tel2");
			 Pattern p = Pattern.compile("[0-9]{4}"); 
			 Matcher m = p.matcher(tel2);
			 if(m.matches()==false){
				 tel2="형식에 맞지 않습니다.";
			 }
			
			 String tel3 = request.getParameter("tel3");
			 Pattern p1 = Pattern.compile("[0-9]{4}"); 
			 Matcher m2 = p.matcher(tel3);
			 if(m2.matches()==false){
				 tel3="형식에 맞지 않습니다.";
			 }
			 
			 
			 %>
			 
			<%=request.getParameter("tel1") %>
			
			-&nbsp;<%=tel2 %>
			-&nbsp;<%=tel3 %>
			
			</td>
		</tr>
		
		<tr>
			<td>이메일</td>
			<td>
			<%=request.getParameter("email1") %> @ 
			
			<%=request.getParameter("email2") %>
			
			</td>
		</tr>
		<tr>
		<td>하고픈 말</td>
			<td>
			<%String content = request.getParameter("content").replaceAll("\r\n", "<br>"); %> 
				<%=content %>
			</td>
		</tr>
		
		
	</table>
</body>
</html>