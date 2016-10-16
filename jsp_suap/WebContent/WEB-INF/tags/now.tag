<%@tag import="java.text.SimpleDateFormat"%>
<%@ tag import="java.util.Date"%>
<%@ tag body-content="empty" language="java" pageEncoding="UTF-8"%>
<%
	Date now = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

%>
<%=sdf.format(now) %>

