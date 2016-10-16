<%@page import="cookie.Cookie_c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	Cookie_c cookie = new Cookie_c(request,response);
	request.setAttribute("cookie", cookie);
	

%>

<jsp:forward page="../template.jsp"></jsp:forward>

