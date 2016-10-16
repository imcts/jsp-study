<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	File file = new File("C:\\Users\\TaeSan\\Documents\\JspSave\\jsp_sukje\\allFile");
	String fileList[] = file.list();
	
	for(int i=0; i<fileList.length; i++){
	String [] arr = fileList[i].split("\\.");
	System.out.println(arr[1]);
	
	}
	
%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3 align="center">보유중인 파일들</h3>
	<form action="FileProc.jsp" method="post">
	<table border="1" width="15%" align="center" >
	<%for(int i=0; i<fileList.length; i++){ %>
		<tr>
			<td width="5%" align="center"><%=i+1 %></td>
			<td width="10%" align="center"><%=fileList[i] %></td>
		</tr>
	<%} %>
	<tr>
		<td colspan="2" align="center"><input type="submit" value="분류"></td>
	</tr>
	</table>
	</form>
</body>
</html>