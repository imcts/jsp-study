<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="var" required="true" %>
<%=	var.replaceAll("\n", "<br>")%><!--받아온 String 문장중에 \n이 있으면 <br>로 변경 -->
