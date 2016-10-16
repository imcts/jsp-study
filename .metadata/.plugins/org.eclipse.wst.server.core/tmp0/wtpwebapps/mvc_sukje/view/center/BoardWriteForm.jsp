<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
	<c:set var="frmAction" value="BoardWrite.bo"/><!--내가 글쓰기를 작성 했을 경우에는 이 값이 컨트롤러로 전송된다.  -->
<c:if test="${bean.command!=null }"><!--만약 넘어온 bean클래스의 command값이 null이 아니고, 어떠한 값이 셋팅 되어 있다면.  -->
	<c:set var="frmAction" value="BoardReply.bo"/><!--내가 답글달기를 작성했을 경우에는 이 값이 컨트롤러로 전송된다.  -->
</c:if>
<c:choose>
		<c:when test="${bean.command==null }"><!--만약 넘어온 command값이 비어있다면  -->
			<c:set var="content" value=""/><!--글을 작성해야 하므로 value는 비워두시고  -->
		</c:when>
		<c:otherwise>
			<c:set var="content" value="${bean.content }"/><!--그게 아니라면, 넘어온 컨텐트 값을 입력시킨다.  -->
		</c:otherwise>
</c:choose>

<body>
	<form action="${frmAction }" enctype="multipart/form-data" method="post"><!--멀티파티 리퀘스트로 보내버렷.  -->
		<table border="1">
		<input type="hidden" name="id" value="${bean.id }"><!--항상 id값은 따라다녀야 하는데, 여기에 있는게 100% 안전하다.  -->
		<input type="hidden" name="page" value="${bean.page }"><!--페이지값 같이 넘겨준다.  -->
		<input type="hidden" name="last" value="${bean.last }"><!--마지막 글인지 아닌지 ~  -->
			<tr>
				<td>제목</td><!--제목  -->
				<td><input type="text" name="title" value="${bean.title }"></td><!--제목을 받아올 텍스트  -->
			</tr>
			<tr>
				<td>작성자</td><!--작성자출력  -->
				<td><input type="text" name="pname" value="${bean.pname }"></td><!--작성자 받아올 텍스트  -->
			</tr>
			<tr>
				<td>비밀번호</td><!--비밀번호 출력  -->
				<td><input type="password" name="pw"></td><!--비밀번호 받아올 password -->
			</tr>
			<tr>
				<td>내용</td><!--내용 출력  -->
				<td><textarea cols="30" rows="10" name="content">${content }</textarea></td><!--내용을 받아올 텍textArea  -->
			</tr>
			<c:if test="${bean.command==null }"><!--만약 커맨드 값에 아무것도 없다면 글쓰기 상태이므로 파일을 input   -->
			<tr>
				<td>파일</td><!--파일 출력  -->
				<td><input type="file" name="upfile" /></td><!--파일을 인풋할 수 있게 해줌.  -->
			</tr>
			</c:if>
			<tr>
				<td colspan="2" align="center"><!--버튼을출력 하기 위한 행 결합 , 행 정렬은 중앙.  -->
					<input type="submit" value="작성"><!--서브밋버튼  -->
					<input type="reset" value="취소"><!--리셋버튼  -->
					<input type="button" value="뒤로가기" onclick="history.go(-1)"><!--버튼, 클릭시 이전페이지로 이동.  -->
				</td> 
			</tr>
			
		</table>
	</form>
</body>
</html>