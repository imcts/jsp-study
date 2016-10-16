<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="per" scope="request" class="basic.Person"></jsp:useBean>
<%
	per.setId("aaa");
	per.setName("전효성");
	
%>

<jsp:forward page="personView.jsp"></jsp:forward>