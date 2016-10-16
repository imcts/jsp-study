<%@tag import="java.net.URLEncoder"%>
<%@tag import="java.util.ArrayList"%>
<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="ori" required="true"%>
<%@ attribute name="sys" required="true"%>

<%
	int index=0; //이미지인지 아닌지 구분하기 위한 인덱스.
	

	ArrayList img = new ArrayList(); //파일 이름명을 담을 리스트.
	img.add("jpg"); //jpg
	img.add("png"); //png
	img.add("gif"); //gif
	img.add("bmp"); //bmp
	
	String file=sys.substring(sys.lastIndexOf(".")+1); //넘어온 시스템 파일명의 마지막 세글자만 잘라냄.

	
	if(img.contains(file)){ //이미지인지 아닌지 물어봄.
		index=1;//이미지라면~
	}
	
	request.setAttribute("index", index); //비교하기 위해, 어트리뷰트에 띄워버리고,
	
	String ori1 = URLEncoder.encode(ori, "utf-8"); //파라미터로 넘겨줄때 한글 깨지니까 인코딩해서 보내주고,
	String sys1 = URLEncoder.encode(sys, "utf-8"); //파라미터로 넘겨줄때 한글 깨지니까 인코딩 해서 넘겨버리고 ~
	
	
%>

<c:choose>
	<c:when test="${index==1 }"> <!--만약 이미지 파일이라면  -->
		<img width="100%" src="image/${sys }" ><!--그냥 이미지 뿌려주고. -->
	</c:when>
	
	<c:otherwise><!--이미지 파일이 아니라면, 다운로드.jsp로 포워딩 시킴.  -->
		<a href="DownRoad.bo?ori=<%=ori1 %>&sys=<%=sys1%>">${ori }</a><!--시스템 파일과, 오리지널 파일 두개의값을 보냄.  -->
	</c:otherwise>
</c:choose>


















