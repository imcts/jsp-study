<%@page import="java.util.Map"%>
<%@page import="sungJuk.Menu"%>
<%@page import="java.util.List"%>
<%@page import="sungJuk.SungJukMap"%>

<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	SungJukMap menuList = new SungJukMap();

	application.setAttribute("menu", menuList.getMenuMap()); 
	application.setAttribute("stud", menuList.getStudMap()); 
	
	
	
	
	String menuItem = ((String)((Menu)((List)((Map)menuList.getMenuMap().get("menu")).get("1")).get(0)).getMenu());
	
	if(request.getParameter("menuItem")!=null){
		menuItem=request.getParameter("menuItem");
	}
	
	
	
	
	String haknyun="1";
	
	if(request.getParameter("haknyun")!=null){
		haknyun=request.getParameter("haknyun");
	}
	
	/* String url="main/hak"+haknyun+"/"+menuItem+".jsp";  */
	
	
	
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3 align="center">학생 성적 조회</h3>

	<table border="1" align="center" width="80%">
		<tr>
			<td colspan="2" align="center">
				<jsp:include page="inc/top.jsp"/>
			</td>
		</tr>
		<tr>
			<td colspan="2" align=""><%=haknyun %>학년 <%=menuItem %>반</td>
		
		</tr>
		
		<tr>
			<td width="10%"><jsp:include page="inc/menu.jsp">
				<jsp:param value="<%=haknyun %>" name="haknyun"/>
			</jsp:include></td>
			<td><jsp:include page="main/hak1/1.jsp">
				<jsp:param value="<%=haknyun %>" name="haknyun"/>
				<jsp:param value="<%=menuItem %>" name="menuItem"/>
			</jsp:include></td>
		</tr>
		<tr>
			<td colspan="2"><jsp:include page="inc/bottom.jsp"></jsp:include></td>
		</tr>
	</table>
</body>
</html>