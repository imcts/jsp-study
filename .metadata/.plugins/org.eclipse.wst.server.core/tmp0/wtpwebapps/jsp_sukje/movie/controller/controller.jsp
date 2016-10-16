<%@page import="movie.Movie"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	Movie movie = new Movie(request,response);    
    
	request.setAttribute("movie", movie);
%>

<jsp:forward page="../template.jsp"></jsp:forward>
