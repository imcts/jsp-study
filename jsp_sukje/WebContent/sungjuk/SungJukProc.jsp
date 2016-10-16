<%@page import="java.util.Iterator"%>
<%@page import="sungJuk.SungJukCal"%>
<%@page import="java.util.HashMap"%>
<%@page import="sungJuk.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	request.setCharacterEncoding("utf-8");
	

	HashMap map = new HashMap();
	ArrayList arr = new ArrayList();
	
	SungJukCal sung = new SungJukCal();
	
	for(int i=1; i<=5; i++){
		if(!(request.getParameter("name"+i).equals(""))){
			String name=request.getParameter("name"+i);
			String gen=request.getParameter("gen"+i);
			int kor=Integer.parseInt(request.getParameter("kor"+i));
			int eng=Integer.parseInt(request.getParameter("eng"+i));
			int mat=Integer.parseInt(request.getParameter("mat"+i));
			int ban=Integer.parseInt(request.getParameter("ban"+i));
			int num=Integer.parseInt(request.getParameter("num"+i));
			
			map.put(i, new Student(name,ban,gen,kor,eng,mat,num)); 
		}
	}
	
	sung.rank(map); //성적 랭크 정렬 완료.
	
	String index = request.getParameter("view");
	String res="";
	if(index.equals("1")){
		arr = sung.SungSukSun();
		res="등수순 출력";
	}
	else if(index.equals("2")){
		arr=sung.BunHoSun();
		res="번호순 출력";
	}
	else if(index.equals("3")){
		arr=sung.banBunho();
		res="반번호순 출력";
	}
	else if(index.equals("4")){
		arr=sung.GenSungJuk();
		res="성별 등수순 출력";
	}
	/* 
	
	
	
	 */
%>



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3 align="center"><%=res %></h3>
	<table border="1" align="center" width="80%">
	<tr>
		<td width="5%" align="center">이름</td>
		<td width="5%" align="center">성별</td>
		<td width="5%" align="center">국어</td>
		<td width="5%" align="center">영어</td>
		<td width="5%" align="center">수학</td>
		<td width="5%" align="center">반번호</td>
		<td width="5%" align="center">번호</td>
		<td width="5%" align="center">총점</td>
		<td width="5%" align="center">평균</td>
		<td width="5%" align="center">등수</td>
		<td width="5%" align="center">등급</td>
	</tr>
	
	<%for(int i=0; i<arr.size(); i++){ %>
		<tr>
			<td align="center"><%=((Student)arr.get(i)).getName() %></td>
			<td align="center"><%=((Student)arr.get(i)).getGen() %></td>
			<td align="center"><%=((Student)arr.get(i)).getKor() %></td>
			<td align="center"><%=((Student)arr.get(i)).getEng() %></td>
			<td align="center"><%=((Student)arr.get(i)).getMat() %></td>
			<td align="center"><%=((Student)arr.get(i)).getBan() %></td>
			<td align="center"><%=((Student)arr.get(i)).getNum() %></td>
			<td align="center"><%=((Student)arr.get(i)).getSum() %></td>
			<td align="center"><%=((Student)arr.get(i)).getAvg() %></td>
			<td align="center"><%=((Student)arr.get(i)).getRank() %></td>
			<td align="center"><%=((Student)arr.get(i)).getGrade() %></td>

		
		</tr>
	<%} %>
	</table>
</body>
</html>