<%@page import="java.text.NumberFormat"%>
<%@page import="java.text.Format"%>
<%@page import="java.util.logging.SimpleFormatter"%>
<%@page import="movie.Menu"%>
<%@page import="java.util.List"%>
<%@page import="movie.Movie"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	
<%
	request.setCharacterEncoding("utf-8");
	Movie movie = (Movie)request.getAttribute("movie");
	String adult="",student="",kids="",choice="";
	int adultM=0,studentM=0,kidsM=0,sum=0;
	
	
	
	if(movie.getAdult()!=0){
		adult="성인"+movie.getAdult()+"명";
		adultM=movie.getAdult()*10000;
	}
	if(movie.getStudent()!=0){
		student="학생"+movie.getStudent()+"명";
		studentM=movie.getStudent()*7000;
	}
	if(movie.getKids()!=0){
		kids="아동"+movie.getKids()+"명";
		kidsM=movie.getKids()*5000;
	}
	
	for(int i=0; i<((List)movie.getMainmap().get("romance")).size(); i++){
		if(((String)((Menu)((List)movie.getMainmap().get("romance")).get(i)).getKey()).equals(movie.getChoicemovie())){
			choice = ((String)((Menu)((List)movie.getMainmap().get("romance")).get(i)).getValue());	
		}
		else if(((String)((Menu)((List)movie.getMainmap().get("action")).get(i)).getKey()).equals(movie.getChoicemovie())){
			choice = ((String)((Menu)((List)movie.getMainmap().get("action")).get(i)).getValue());	
		}
	}
	
	sum = adultM+studentM+kidsM;
	
	NumberFormat nf = NumberFormat.getNumberInstance();
	
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="">
	<table width="100%" align="center">
	<br>
	<h3 align="center">이용해 주셔서 감사합니다.</h3><br>
	<tr>
		<td align="center">예매하신 영화명 : '<%= choice %>'</td>
	</tr>
		<tr>
			<td align="center"><%=adult %><%=student %><%=kids %> 예매하셨습니다.</td>
		</tr>
		<tr>
			<td align="center">결제하신 금액은 <%=nf.format(sum) %> 원 입니다.</td>
		</tr>
		
	</table>
</form>
</body>
</html>