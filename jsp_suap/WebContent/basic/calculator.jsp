
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%!
	int add(int a, int b) {
			return a + b;
		}

	int dDay(String myStr){
		int res=0;

		try{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date myDay = sdf.parse(myStr);
		
		Calendar today = Calendar.getInstance();
		Calendar myCalen = Calendar.getInstance();
		
		myCalen.setTime(myDay);
		myCalen.set(Calendar.YEAR, today.get(Calendar.YEAR));
		
		
		if(myCalen.before(today)){
			myCalen.add(Calendar.YEAR, 1);
		}
		
		res = (int)((myCalen.getTimeInMillis() - today.getTimeInMillis())/(1000*60*60*24));
		
		if(myCalen.get(Calendar.DATE)==today.get(Calendar.DATE)){
			res=-1;
		}
		
		}catch(Exception e){}
		
		
		return res+1;
	}




%>
<%
	int a = 10, b=20;
	
	int sum = add(a, b);
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=add(a,b) %><br>
	<%=dDay("1987-07-28")%>
</body>
</html>