<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="exam" class="basic.Exam2" scope="request"/>
<jsp:setProperty property="*" name="exam"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center" width="70%">
	<h3 align="center">학생정보 출력</h3>
	
		${exam.cal() }
		<tr>
		<td>이름</td>
			<td>
				${exam.name } 
			</td>
		</tr>
		<tr>
		<td>국어</td>
			<td>
				${exam.kor } 
			</td>
		</tr>
		<tr>
		<td>영어</td>
			<td>
				${exam.eng } 
			</td>
		</tr>
		<tr>
		<td>수학</td>
			<td>
				${exam.mat } 
			</td>
		</tr>
		<tr>
		<td>총점</td>
			<td>
				${exam.sum } 
			</td>
		</tr>
		<tr>
		<td width="50%">평균</td>
			<td>
				${exam.avg } 
			</td>
		</tr>
		
	</table>
</body>
</html>