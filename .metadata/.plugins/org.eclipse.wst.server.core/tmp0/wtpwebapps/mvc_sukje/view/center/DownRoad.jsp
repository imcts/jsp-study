<%@page import="java.util.ArrayList"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.io.FileInputStream"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	FileInputStream fis = new FileInputStream(
			"C:\\Users\\TaeSan\\Documents\\JspSave\\mvc_sukje\\WebContent\\image\\"
			+request.getParameter("sys")
			); //서버에 있는 경로의 sys파일명을 fis에 담아주고.

	String ori = URLEncoder.encode(request.getParameter("ori"), "utf-8"); //한글 파일 깨지지 말라고 인코딩 한번더 때려주고
	
	response.setHeader("Content-Disposition", "attachment;filename="+ori); //사용자에게 어느 위치에 저장할 것인지를 물어봄.
	
	
	out.clear();//파일을 안정적으로 받기 위해, 아웃풋 스트림을 한번 비워주고,
	out=pageContext.pushBody(); //아웃풋 스트림에 클라이언트가 지정한 경로값을 대입.
	
	
	ServletOutputStream sos = response.getOutputStream(); //서블릿 아웃풋 스트림에 가져온 요청받은 아웃풋 스트림을 대입.
	
	
	ArrayList<Integer> list = new ArrayList(); //인트형태만 담을 수 있는 어레이 리스트 하나 맹글고
	
	int data; //fis에 담겨있는 데이터의 값을 받아올 녀석 ~
	
	while((data=fis.read())!=-1){ //data의 값이 하나도 없으면 -1이므로 -1이 아닐때까지 돌아라 ~ 
		list.add(data);//data에 있는 값을 리스트에 때려박아주시고
	}

	byte[] arr = new byte[list.size()]; //sos에 담아서 쏴버릴 바이트 배열 하나 만들고,
	
	for(int i=0; i<arr.length; i++){ //그 바이트 배열만큼 돌아라~
		arr[i]=(byte)list.get(i).byteValue();//리스트에서 int값을 꺼내고 바이트값으로 변경.
	}
	
	sos.write(arr);//sos에 담아서 지정되어있는 경로로 가...가버렷 ! >ㅆ <
	
	sos.close(); //sos닫아주시고,
	fis.close();//fis닫아주시고 ~ 
%>










