<%@ tag import="java.util.ArrayList"%>
<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="var" required="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	ArrayList mail = new ArrayList();
	mail.add("naver.com");
	mail.add("nate.com");
	mail.add("gmail.com");
	mail.add("daum.net");
	String check="";
	String res="<select name='mail2'>";
	if(var!=null){
		check=var;
	}
	
	
	for(int i=0; i<mail.size();i++){
		if(mail.get(i).equals(check)){
			res+="<option value='"+mail.get(i)+"' selected='selected' >"+mail.get(i);
		}else{
			res+="<option value='"+mail.get(i)+"'>"+mail.get(i);
		}
	}
	res+="</select>";
	
%>

<%=res%>