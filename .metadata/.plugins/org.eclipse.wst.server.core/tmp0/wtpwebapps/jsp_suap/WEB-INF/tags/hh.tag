<%@ tag body-content="empty" language="java" pageEncoding="UTF-8"%>
<%@ attribute name="title" required="true" %>
<%@ attribute name="level" type="java.lang.Integer"  %>
<%

	int le = 1;
	if(level!=null){
		le=level;
	}
	String start = "<h"+le+">";
	String end = "</h"+le+">";

%>
<%= start%>${title } <%=end%>