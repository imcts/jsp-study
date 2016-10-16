<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
	<td width="100">
	<script type="text/javascript">/*페이지를 이동시켜주기 위한 script */
		alert("${bean.msg}");/* PwChk() 클래스에서 넘어온 msg값을 alert으로 출력. */
		location.href("${bean.url}");/* 해당 페이지로 이동. */
	</script>
	</td> 
</tr>
</table>
</body>
</html>