<%@page import="basic.Hobby"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	
    
		HashMap<String,ArrayList<Hobby>> menu = new HashMap();
    

		menu.put("top",new ArrayList<Hobby>());
		menu.put("info",new ArrayList<Hobby>());
		menu.put("gallery",new ArrayList<Hobby>());
		menu.put("center",new ArrayList<Hobby>());
    	
		
		menu.get("top").add(new Hobby("info","회사소개"));
    	menu.get("top").add(new Hobby("gallery","갤러리"));
    	menu.get("top").add(new Hobby("center","고객센터"));
    	
    	
    	menu.get("info").add(new Hobby("hello","인사말"));
    	menu.get("info").add(new Hobby("location","오시는길 "));
    	
    	menu.get("gallery").add(new Hobby("her","허윤미"));
    	menu.get("gallery").add(new Hobby("jun","전효성"));
    	menu.get("gallery").add(new Hobby("kate","케이트업튼"));
    	
    	menu.get("center").add(new Hobby("notice","공지사항"));
    	menu.get("center").add(new Hobby("fnq","즐겨하는질문"));
    	menu.get("center").add(new Hobby("qna","질문과 답변"));
    	
    	application.setAttribute("menu", menu);
    	
    	String sub = menu.get("top").get(0).getValue();
        
        if(request.getParameter("sub")!=null)
        	sub = request.getParameter("sub");
        
    	String main = menu.get(sub).get(0).getValue();
        
        if(request.getParameter("main")!=null)
        	main = request.getParameter("main");	
	    	
    	
    	String url = "main/"+sub+"/"+main+".jsp";
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" cellpadding="1" cellspacing="1">
		<tr>
			<td colspan="2" align="center"><jsp:include page="inc/top.jsp"></jsp:include>
			</td>
		</tr>
			<td colspan="3" align="right">
				<%=sub %> >> <%=main %>
			</td>
		<tr>
	
		</tr>

		<tr>
			<td width="150" align="center">
				<jsp:include page="inc/menu.jsp">
					<jsp:param value="<%=sub %>" name="sub" />
				</jsp:include>
			</td>
			
			<td width="500" align="center">
				<jsp:include page="<%=url %>"></jsp:include>
			</td>
		</tr>

		<tr>
			<td colspan="2" align="center"><jsp:include
					page="inc/bottom.jsp"></jsp:include></td>
		</tr>
	</table>
</body>
</html>