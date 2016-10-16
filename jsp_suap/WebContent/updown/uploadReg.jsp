<%@page import="java.io.File"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
		
	List<String> imgList = new ArrayList();

	imgList.add("jpg");
	imgList.add("bmp");
	imgList.add("gif");
	imgList.add("png");
	
	String up = "up";
	String path = "C:\\Users\\TaeSan\\Documents\\JspSave\\jsp_suap\\WebContent\\"+up;
	int size = 1024*1024*10;//단위는 바이트 단위.
	
	MultipartRequest mm = new MultipartRequest(
			request,
			path,
			size,
			"utf-8",
			new DefaultFileRenamePolicy()
			);
	String name = mm.getParameter("name");
	String title = mm.getParameter("title");
	String sys1 = mm.getFilesystemName("file1");
	String ori1 = mm.getOriginalFileName("file1");
	
	String url="uploadView.jsp?name="+URLEncoder.encode(name)+"&title="+URLEncoder.encode(title)+"&ori1="+URLEncoder.encode(ori1)+"&sys1="+URLEncoder.encode(sys1);
	//response.sendRedirect(url);
	
	String goUrl = "uploadView.jsp";
	
	String ext = sys1.substring(sys1.lastIndexOf(".")+1);
	
	if(!imgList.contains(ext.toLowerCase())){
		goUrl="uproad.jsp";
		File delFile = new File(path+"\\"+sys1);
		delFile.delete();
	}
	
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="frm"  method="post" >
		<table border="1">
			<tr>
				<td>작성자</td>
				<td><input type="hidden" name="name" value="<%=name%>"/></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="hidden" name="title" value="<%=title%>"/></td>
			</tr>
			<tr>
				<td>파일1</td>
				<td><input type="hidden" name="sys1" value="<%=sys1%>"/></td>
			</tr>
			<tr>
				<td>파일2</td>
				<td><input type="hidden" name="ori1" value="<%=ori1%>"/></td>
			</tr>
		
		</table>
	</form>
	
	<script type="text/javascript">
		var frm = document.frm;
		frm.action="<%=goUrl%>";
		frm.submit();
	</script>
	
	
</body>
</html>