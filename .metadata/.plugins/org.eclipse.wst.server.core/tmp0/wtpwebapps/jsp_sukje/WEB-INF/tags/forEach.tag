<%@tag import="java.util.Map"%>
<%@tag import="java.util.Set"%>
<%@tag import="java.util.Iterator"%>
<%@tag import="java.util.List"%>
<%@ tag body-content="empty" language="java" pageEncoding="UTF-8"%>
<%@ attribute name="begin" required="false" %>
<%@ attribute name="var" required="false" %>
<%@ attribute name="end" required="false" %>
<%@ attribute name="step" required="false" %>
<%@ attribute name="items" required="false" type="java.lang.Object" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	


<%
	//진짜 for문을 만들려면 변수값을 이용해서 실시간으로 던져줘야 되는거 아닌가 ? 음...음..... 확장포라면 출력기능이 주기능이니 가능하다쳐도 
	//아니 잠깐, 확장포문도 오브젝트값을 사용자한테 던져줘야 하는데 ..... 그걸 태그를 이용해서 던져준다 해도 그 코드가 실행될뿐 그걸 이용할 순 없잖.. 
	//그게 시스템단을 건드리지 않고 여기서 만들어지나 - _-;;? 아 ㅅㅂ 몰라 일단 출력먼저 시켜보고.

	int begin1,end1,step1;
	String varStatus1="",var1="";
	Object items1=null;
	String res="";
	
	
	if(items!=null){
		items1=items;
	}
	
	if(var!=null){
		var1=var;
	}
	
	if(begin!=null){
		begin1=Integer.parseInt(begin);
	}else{
		begin1=0;
	}
	
	if(end!=null){
		end1=Integer.parseInt(end);
	}else{
		end1=0;
	}

	if(step!=null){
		step1=Integer.parseInt(step);
	}else{
		step1=1;
	}


	if(items==null){//확장포문이 아니라면, 
		for(int i=begin1; i<=end1; i+=step1){
			res+="<td>"+i+"</td>";
		}
	}
	
	else if(items!=null){//확장 포문이라면, 
		if(items1 instanceof String[]){
			String [] arr = (String[])items1;
			for(int i=0; i<arr.length; i++){
				res+="<td>"+arr[i]+"</td>";
			}
		}
		else if(items1 instanceof int[]){
			int [] arr = (int[])items1;
			for(int i=0; i<arr.length; i++){
				res+="<td>"+arr[i]+"</td>";
			}
		}
		else if(items1 instanceof char[]){
			char [] arr = (char[])items1;
			for(int i=0; i<arr.length; i++){
				res+="<td>"+arr[i]+"</td>";
			}
		}
		else if(items1 instanceof List){
			List arr = (List)items1;
			for(int i=0; i<arr.size(); i++){
				res+="<td>"+arr.get(i)+"</td>";
			}
		}
		else if(items1 instanceof Set){
			Set arr = (Set)items1;
			Iterator it = arr.iterator();
			for(int i=0; i<arr.size(); i++){
				res+="<td>"+it.next()+"</td>";
			}
		}
		else if(items1 instanceof Map){
			Map arr = (Map)items1;
			Iterator it = arr.keySet().iterator();
			for(int i=0; i<arr.size(); i++){
				res+="<td>"+it.next()+"</td>";
			} 
			res+="<br>";
			Iterator it1 = arr.keySet().iterator();
			for(int i=0; i<arr.size(); i++){
				res+="<td>"+arr.get(it1.next())+"</td>";
			}
			
			
		}
}
	
	
%>
<%=res %>

