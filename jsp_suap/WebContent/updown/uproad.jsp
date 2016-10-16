<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="uploadReg.jsp" method="post" enctype="multipart/form-data">
		<table border="1">
			<tr>
				<td>작성자</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="title" /></td>
			</tr>
			<tr>
				<td>파일1</td>
				<td><input type="file" name="file1" /></td>
			</tr>
			<tr>
				<td>파일2</td>
				<td><input type="file" name="file2" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="작성">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>