<%@tag import="java.util.ArrayList"%>
<%@tag import="java.util.List"%>
<%@ tag body-content="empty" language="java" pageEncoding="UTF-8"%>
<%@ attribute name="str" required="true" %>
<%
	List list = new ArrayList();
	list.add("jpg");
	list.add("png");
	list.add("gif");
	list.add("bmp");

	
	String res = str;
	
	String ext = str.substring(str.lastIndexOf(".")+1);
	
	if(list.contains(ext)){
		res="<img src='"+str+"'>";
	}
%>
<%= res %>

