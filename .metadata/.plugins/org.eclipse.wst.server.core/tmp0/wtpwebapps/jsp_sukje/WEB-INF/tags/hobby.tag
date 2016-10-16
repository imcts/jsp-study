<%@tag import="java.util.ArrayList"%>
<%@ tag body-content="empty" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="var" required="false" %>
<%
	ArrayList hobby = new ArrayList();
	hobby.add("여행");
	hobby.add("독서");
	hobby.add("컴퓨터");
	hobby.add("공부");
	hobby.add("운동");
	
	
	String res="";
	
	String [] list = new String[hobby.size()];
	String [] var1;
	
	
	if(var!=null){
		
		var1=var.split(",");	
		for(int i=0; i<list.length; i++){
			if(i<var1.length){
				list[i]=var1[i];
			}else{
				list[i]="";
			}
			
		}
		
		//여기까지 된 것 : list에다가 넘어온 값 집어넣었음. 이제 해야할 것 : 리스트의 0번째방에 있는것과 하비의 전체값 비교 있다면 체크드 없다면 
		
		for(int i=0; i<list.length;i++){
			if(hobby.contains(list[i])){
				res+="<input type='checkbox' name='hobby' value='"+hobby.get(i)+"' checked='checked' >"+hobby.get(i);	
			}else{
				res+="<input type='checkbox' name='hobby' value='"+hobby.get(i)+"' >"+hobby.get(i);	
			}
		}
	}else{
		for(int i=0; i<hobby.size(); i++){
			res+="<input type='checkbox' name='hobby' value='"+hobby.get(i)+"' >"+hobby.get(i);	
		}
	} 
	
%>


<%=res %>


