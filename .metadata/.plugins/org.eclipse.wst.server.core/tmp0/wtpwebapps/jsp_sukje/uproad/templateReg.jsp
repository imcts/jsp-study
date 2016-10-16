<%@page import="gaip.GaipResult"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	GaipResult gaip = new GaipResult(request); 
//
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<form name="form">
	<input type="hidden" name="name" value="<%=gaip.getName()%>">
	<input type="hidden" name="id" value="<%=gaip.getId()%>">
	<input type="hidden" name="pw" value="<%=gaip.getPw()%>">
	<input type="hidden" name="photo" value="<%=gaip.getPhotoSys()%>">
	<input type="hidden" name="tel" value="<%=gaip.getTel()%>">
	<input type="hidden" name="mail1" value="<%=gaip.getMail1()%>">
	<input type="hidden" name="mail2" value="<%=gaip.getMail2()%>">
	<input type="hidden" name="job" value="<%=gaip.getJob()%>">
	<input type="hidden" name="hobby" value="<%=gaip.getHobbyList()%>">
	<input type="hidden" name="iryuksys" value="<%=gaip.getIryukSys()%>">
	<input type="hidden" name="iryukori" value="<%=gaip.getIryukOri()%>">
	
</form>
<script type="text/javascript">
	if(<%=gaip.getFileChk()%>==0){
		var fo = document.form;
		fo.action="template.jsp";
		alert('사진은 이미지 파일만, 이력서는 문서파일만 업로드 가능합니다.');
		fo.submit();
	}else{
		var fo = document.form;
		fo.action="templateView.jsp";
		fo.submit();
	}
	
	
</script>
</body>
</html>

