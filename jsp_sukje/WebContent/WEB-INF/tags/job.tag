<%@tag import="java.util.ArrayList"%>
<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="var" required="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	ArrayList job = new ArrayList();
	job.add("컴퓨터");
	job.add("의학");
	job.add("문학");
	job.add("건설학");
	job.add("철학");
	
	String check="";
	String res="<select name='job'>";
	if(var!=null){
		check=var;
	}
	
	
	for(int i=0; i<job.size(); i++){
		if(job.get(i).equals(check)){
			res+="<option value='"+job.get(i)+"' selected='selected' >"+job.get(i);
		}else{
			res+="<option value='"+job.get(i)+"' >"+job.get(i);
		}
	}
	
	res+="</select>";
%>
<%=res%>