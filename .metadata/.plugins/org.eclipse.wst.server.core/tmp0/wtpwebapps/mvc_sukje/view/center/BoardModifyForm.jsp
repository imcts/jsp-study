<%@page import="model.BoardBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ct" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function fileDelete(){/*  */
		if(confirm("파일을 삭제하시겠습니까")){/*만약 파일 삭제 컨펌을 받았다면.  */
			var frm = document.frm;/*frm은 form에 담긴 값이 됨.  */
			frm.action="FileDelete.bo";/*이동할 경로 지정.  */
			frm.submit();	/*서브밋 실행.  */
		}
	}
</script>
</head>
<body>
<form name="frm" action="BoardModify.bo" method="post" enctype="multipart/form-data">
	<table border="1">
	<input type="hidden" name="id" value="${bean.id }" /><!--수정을 위해선 id값이 필요하다, 숨겨서 보내주자.  -->
	<input type="hidden" name="page" value="${bean.page }" /><!--페이지값을 같이 넘겨준다.  -->

	<tr>
		<td>제목</td><!--제목 작성  -->
		<td><input type="text" name="title" value="${bean.title }" /></td><!--bean에 담긴 title값 출력.  -->
	</tr>
	<tr>
		<td>내용</td><!--내용 작성  -->
		<td><textarea rows="5" cols="30" name="content">${bean.content }</textarea></td>
		<!--bean에 담긴 content값 출력  -->
	</tr>
	
<c:choose>	
	<c:when test="${bean.orifile!=null || param.orifile!='' }"><!--만약 orifile이 null이 아니라면.  -->
		<input type="hidden" name="upfile" value="${bean.upfile }" /><!--시스템파일명 전송  -->
		<input type="hidden" name="orifile" value="${bean.orifile }" /><!--오리지널 파일명 전송  -->
		<td>파일</td><!--파일 출력  -->
		<td><ct:file sys="${bean.upfile }" ori="${bean.orifile }"/></td>
		<!--수정시, 이미지 파일을 보여주거나, 문서파일을 보여주는 커스텀 태그 실행.  -->
		<tr>
		<td colspan="2" align="center">
			<input type="button" value="삭제" onclick="fileDelete()"><!--파일을 삭제 할시 클릭하면 script 함수 실행.  -->
		</td>
		</tr>
	</c:when>
	<c:otherwise><!--만약 upfile이 널이라면   -->
	<tr>
		<td>파일</td><!-- 파일 출력 -->
		<td><input type="file" name="upfile" /></td><!-- 파일을 업로드 할 수 있게 변경.  -->
	</tr>
	</c:otherwise>
</c:choose>
	<tr>
		<td colspan="2" align="center">
			<input type="submit" value="작성" /><!--서브밋 실행  -->
			<input type="button" value="뒤로" onclick="location.href='BoardDetail.bo?id=${bean.id}&page=${param.page }'"/>
			<!--클릭시 전에 보고있던 디테일 페이지로 이동하기 위한 location.  -->
		</td>
	
	</tr>
	</table>
</form>
</body>
</html>