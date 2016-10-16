<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="ct" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<h3 align="center">상세보기</h3>
		<tr>
			<td>제목:</td><!--제목을 출력  -->
			<td>${bean.title }</td><!--제목 출력 -->
			<td>조회:</td><!--조회출력  -->
			<td>${bean.cnt }</td><!--빈에서 조회수 가져옴  -->
			<td>작성일:</td><!--작성일 출력  -->
			<td>${bean.reg_date }</td><!--빈에서 작성일 가져옴  -->
		</tr>
		<tr>
			<td colspan="6" align="center">내    용</td><!--내용 출력  -->
		</tr>
		<tr>
			<td colspan="6"><ct:replace var="${bean.content }"/></td><!--커스텀 태그에 내용을 보내고, <br>로 바꿀거 바꾸고 리턴.  -->
		</tr>
		<tr>
			<td>파일:</td>
			<td colspan="6" ><ct:file ori="${bean.orifile }" sys="${bean.upfile }"/></td><!--커스텀태그인file에 파일명2가지를 넣고돌림.  -->
		</tr>
		<tr>
			
			<td colspan="6" align="right">
			<a href="PwChkForm.bo?id=${bean.id }&upfile=${bean.upfile }&page=${bean.page }&orifile=${bean.orifile}&url=BoardModifyForm">수정</a><!--이거 누르면 수정이동  -->
			<a href="BoardReplyForm.bo?id=${bean.id }&last=${param.last }&page=${bean.page}">답변</a><!--이거 누르면 답변이동  -->
			<a href="PwChkForm.bo?id=${bean.id }&page=${bean.page}&upfile=${bean.upfile }&orifile=${bean.orifile}&url=BoardDelete">삭제</a><!--이거누르면 삭제이동  -->
			<a href="BoardList.bo?page=${bean.page }">목록으로</a><!--이거 누르면 목록으로 그냥 이동.  -->
			
			</td>
		</tr>
	</table>
</body>
</html>