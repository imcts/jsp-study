<%@page import="java.util.Iterator"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

	
	HashMap map = new HashMap();
	map.put("aaa", "111");
	map.put("bbb", "222");
	map.put("ccc", "333");
	map.put("ddd", "444");
	map.put("eee", "555");

	Iterator it = map.keySet().iterator();
	String url = "login.jsp";
	int idchk=0;
	while(it.hasNext()){
		String mapid=(String)it.next();
		if(id.equals(mapid)){//들어온 아디와 같다면, 
			if(((String)map.get(mapid)).equals(pw)){
				url="main.jsp?id="+id;
			}
		}
		
	}
	
	
	response.sendRedirect(url);
%>