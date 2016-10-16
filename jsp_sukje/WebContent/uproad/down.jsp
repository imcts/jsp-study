<%@page import="java.net.URLEncoder"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.io.FileInputStream"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String sys = request.getParameter("sys");
	String ori = request.getParameter("ori");
	
	FileInputStream fis  =  new FileInputStream("C:\\Users\\TaeSan\\Documents\\JspSave\\jsp_sukje\\WebContent\\uproad\\image\\"+sys);
	//서버에서 파일을 읽어오기 위한  input스트림.
	
	String en = URLEncoder.encode(ori, "utf-8");
	
	
	response.setHeader("Content-Disposition", "attachment;filename="+en);
	
	out=pageContext.pushBody();
	
	ServletOutputStream sos = response.getOutputStream();
	
	int data;
	
	ArrayList<Integer> list = new ArrayList();
	
	while((data=fis.read())!=-1){
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