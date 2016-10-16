<%@page import="java.util.Iterator"%>
<%@page import="movie.Menu"%>
<%@page import="java.util.ArrayList"%>
<%@page import="movie.Movie"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	Movie movie = (Movie)request.getAttribute("movie");
	ArrayList arr = new ArrayList();
	ArrayList key = new ArrayList();
	
	
	Iterator it = ((ArrayList)movie.getMainmap().get("romance")).iterator();
	while(it.hasNext()){
		Menu menu = ((Menu)it.next());
		arr.add(menu.getValue());
		key.add(menu.getKey());
	}
	Iterator it2 = ((ArrayList)movie.getMainmap().get("action")).iterator();
	while(it2.hasNext()){
		Menu menu = ((Menu)it2.next());
		arr.add(menu.getValue());
		key.add(menu.getKey());
	}
	
%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form  method="post">
	<table border="1" width="100%">
		<tr>
			<td align="center" width="20%">예매하실 영화 선택  </td>
			<td align="center" width="30%">
				<select name="choice">
					<%for(int i=0; i<arr.size(); i++){ %>
					<option value="<%=key.get(i)%>"><%=arr.get(i) %></option>					
					<%} %>
				</select>
				<input type="hidden" name="menukey" value="booking"> 
				<input type="hidden" name="menukey" value="booking"> 
			</td>
		</tr>
		
		<tr>
		<td align="center" width="20%"> 성    인  : 10000원</td>
			<td align="center" width="30%">
			<select name="adult">
					<%for(int i=0; i<=10; i++){ %>
					 <option value="<%=i%>"><%=i %>명</option>			 
					<%} %>
			</select>
			</td>
		</tr>
		<td align="center" width="20%"> 학    생 : 7000원</td>
			<td align="center" width="30%">
			<select name="student">
					<%for(int i=0; i<=10; i++){ %>
					 <option value="<%=i%>"><%=i %>명</option>			 
					<%} %>
			</select>
			</td>
		</tr>
		<td align="center" width="20%"> 아    동 : 5000원</td>
			<td align="center" width="30%">
			<select name="kids">
					<%for(int i=0; i<=10; i++){ %>
					 <option value="<%=i%>"><%=i %>명</option>			 
					<%} %>
			</select>
			</td>
		</tr>
		
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="예매하기">
			</td>
		</tr>
		
	</table>
</form>
</body>
</html>