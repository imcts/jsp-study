<%@page import="basic.movie"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%

	movie mm = new movie(
			request.getParameter("movie"),
			request.getParameter("cnt")
			);

	request.setAttribute("movie", mm);
	
	request.setAttribute("main", "main/movieView.jsp");
	
	
	
%>

<jsp:forward page="../../template.jsp"></jsp:forward>
