<%@page import="fowardSung.SungJukMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	SungJukMap ss = new SungJukMap(request);
	
	request.setAttribute("ss", ss);
%>

<jsp:forward page="../tamplate.jsp"></jsp:forward>
