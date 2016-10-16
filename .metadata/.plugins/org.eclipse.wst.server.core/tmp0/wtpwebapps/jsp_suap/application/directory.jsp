<%@page import="java.io.FileReader"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//파일의 정보를 읽어오는법.
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//String path = "C:\\Users\\TaeSan\\Documents\\JspSave\\jsp_suap\\WebContent\\";
	String file="file\\ddd.txt";
	String path=application.getRealPath(file); //이떄 위치는 현재 프로젝트 위치에서 부터 찾아가게 된다. 일반적으로 절대 주소값을 찾아갈 수 없기때문에 서버가 가지고있는 패스값을 가져간다.
	
	//out.print(path);//가상 서버 주소가 나오게 된다. 
	 
	FileReader fr = new  FileReader(path);
	//"C:\\Users\\TaeSan\\Documents\\JspSave\\jsp_suap\\WebContent\\file\\ddd.txt"
	
	int data ;
	String str="";
	while((data=fr.read())!=-1){
		str+=(char)data;
	}

	fr.close();
	

%>

</body>
</html>