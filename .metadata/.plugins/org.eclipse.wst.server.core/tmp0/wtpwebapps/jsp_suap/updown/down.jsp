<%@page import="java.net.URLEncoder"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String sys= request.getParameter("sys");
	String ori= request.getParameter("ori");
	


	String up = "up\\"+sys;
	
	String path = "C:\\Users\\TaeSan\\Documents\\JspSave\\jsp_suap\\WebContent\\"+up;
	
	FileInputStream fis = new FileInputStream(path);//패스값 설정.
	
	String en = URLEncoder.encode(ori, "utf-8");
	
	
	response.setHeader("Content-Disposition", "attachment;filename="+en);
	//사용자에게 어디에 저장할 것인지를 물어보는 헤더를 열어준다. 
	
	out.clear();
	out = pageContext.pushBody();
	//사용자가 지정해놓은 경로를 
	
	
	ServletOutputStream sos = response.getOutputStream();
	
	int data;
	
	ArrayList<Integer> list = new ArrayList();
	while((data = fis.read())!=-1){
		list.add(data);
	}
	 
	byte [] arr = new byte[list.size()];
	
	
	for(int i=0; i<arr.length; i++){
		arr[i]=(byte)(list.get(i).byteValue());
	}
	
	
	sos.write(arr);
	
	sos.close();
	fis.close();
	
	
%>