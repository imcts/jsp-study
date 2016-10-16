<%@page import="dao.LoginDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	LoginDao login = new LoginDao(request);	 
%>

<jsp:forward page="../template.jsp"></jsp:forward>    
    