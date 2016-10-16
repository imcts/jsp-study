<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="length" type="java.lang.Integer" %>
<%@ attribute name="tail" %>

<jsp:doBody var="con"/>

<%
	String con = (String)jspContext.getAttribute("con");
	con = con.trim();
	
	con=con.replaceAll("<(/)?([a-zA-Z]*)(\\s[a-zA-Z]*=[^>]*)?>", "");
	
	if(length!=null && length<con.length()){
		con = con.substring(0,length);
	}
			
	if(tail!=null){
		con+=tail;
	}
			
%>

<%=con%>