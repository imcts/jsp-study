<%@page import="java.util.*"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ct" tagdir="/WEB-INF/tags"  %>

<%
	String [] arr = {"스","트","링","입","니","다"};
	int [] brr = {1,2,3,4,5,2,3,2,3,2,1,2,3,3,3,6,7,7};
	char [] crr = {'캐','릭','터','입','니','다'};
	List drr = new ArrayList();
	drr.add("어");
	drr.add("레");
	drr.add("이");
	drr.add("리");
	drr.add("스");
	drr.add("트");
	drr.add("입");
	drr.add("니");
	drr.add("다");
	
	Set err = new LinkedHashSet();
	err.add("링");
	err.add("크");
	err.add("드");
	err.add("해");
	err.add("쉬");
	err.add("셋");
	err.add("입");
	err.add("니");
	err.add("다");
	
	
	Map frr = new LinkedHashMap();
	frr.put("해", "해");
	frr.put("쉬", "쉬");
	frr.put("맵", "맵");
	frr.put("입", "입");
	frr.put("니", "니");
	frr.put("다", "다");
	frr.put("key", "value");
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ct:forEach begin="${0 }" end="${10 }" /> - 일반포문
	<br>
	<ct:forEach begin="${0 }" end="${10 }" step="${2 }"/> - 스탭 2로 설정
	<br>
	<ct:forEach items="<%=arr %>"/> - 스트링 배열 입력시.
	<br>
	<ct:forEach items="<%=brr %>"/>- 인트배열 입력시.
	<br>
	<ct:forEach items="<%=crr %>"/>- 캐릭터배열 입력시.
	<br>
	<ct:forEach items="<%=drr %>"/>- 어레이리스트 입력시.
	<br>
	<ct:forEach items="<%=err %>"/>- 해쉬셋 입력시.
	<br>
	<ct:forEach items="<%=frr %>"/>- Map 입력시. 
	<br>
</body>
</html>