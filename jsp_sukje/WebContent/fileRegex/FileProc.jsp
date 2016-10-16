<%@page import="java.util.ArrayList"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	File file = new File("C:\\Users\\TaeSan\\Documents\\JspSave\\jsp_sukje\\allFile");
	String fileList[] = file.list();
	ArrayList imageList = new ArrayList();
	ArrayList textList = new ArrayList();
	

	for(int i=0; i<fileList.length; i++){
		String [] arr = fileList[i].split("\\.");
		int textIndex=0,imageIndex=0;
		if(arr[1].equals("txt") 
				|| arr[1].equals("doc") 
				|| arr[1].equals("hwp") 
				|| arr[1].equals("gul")
				|| arr[1].equals("ppt") 
				|| arr[1].equals("xls")){
			new FileInputStream("C:\\Users\\TaeSan\\Documents\\JspSave\\jsp_sukje\\allFile\\"+fileList[i]);
			new FileOutputStream("C:\\Users\\TaeSan\\Documents\\JspSave\\jsp_sukje\\textFile\\"+fileList[i]);
			textList.add(textIndex, fileList[i]);
			textIndex++;
		}else{
			new FileInputStream("C:\\Users\\TaeSan\\Documents\\JspSave\\jsp_sukje\\allFile\\"+fileList[i]);
			new FileOutputStream("C:\\Users\\TaeSan\\Documents\\JspSave\\jsp_sukje\\imageFile\\"+fileList[i]);
			imageList.add(imageIndex, fileList[i]);
			imageIndex++;
		}
		
	}


%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
	<tr>
		<td align="center" colspan="2">파일 분류 완료</td>
	</tr>
		<tr>
			<td>
			<table>
				<tr>
					<td align="center">textList폴더</td>
				</tr>
				<%for(int i=0; i<textList.size(); i++){ %>
					<tr>
						<td align="center"><%=(String)textList.get(i) %></td>
					</tr>
				<%} %>
			</table>
			</td>
			
			
			<td>
			<table>
				<tr>
					<td align="center">imageList폴더</td>
				</tr>
				<%for(int i=0; i<imageList.size(); i++){ %>
					<tr>
						<td align="center"><%=(String)imageList.get(i) %></td>
					</tr>
				<%} %>
			</table>
			
			
			</td>
		</tr>
	</table>
</body>
</html>