<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%
	Calendar today = Calendar.getInstance();

	today.set(Calendar.DATE, 1);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border="1" cellpadding="2" cellspacing="2">
		<tr>
			<td>
				<table border="1" cellpadding="2" cellspacing="2">
					<tr>
						<td colspan="7" align="center"><%=today.get(Calendar.YEAR)%>
							년 <%=today.get(Calendar.MONTH)%> 월</td>
					</tr>
					<tr>
						<td>일</td>
						<td>월</td>
						<td>화</td>
						<td>수</td>
						<td>목</td>
						<td>금</td>
						<td>토</td>
					</tr>
					<tr>
						<%
							for (int i = 1; i < today.get(Calendar.DAY_OF_WEEK); i++) {
						%>
						<td></td>
						<%
							}

							for (int i = 1; i <= today.getActualMaximum(Calendar.DATE); i++) {
						%>
						<td><%=i%></td>
						<%
							today.set(Calendar.DATE, i);
								if (today.get(Calendar.DAY_OF_WEEK) == 7) {
						%>
					</tr>
					<tr>
						<%  
 }
} 
%>
					</tr>
				</table>
			</td>
			<td width="100"></td>
			<td width="100"></td>
		</tr>
	</table>
</body>
</html>