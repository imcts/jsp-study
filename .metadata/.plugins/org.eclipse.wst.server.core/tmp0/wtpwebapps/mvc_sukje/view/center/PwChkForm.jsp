<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="PwChk.bo" method="post">
		<table>
		<input type="hidden" name="id" value="${param.id }"><!--id값은 글번호를 가져와야 하기 때문에 필요하다  -->
		<input type="hidden" name="url" value="${param.url }"><!--url은 PwChk클래스를 하나만 쓰기 때문에 구분하기위해  -->
		<input type="hidden" name="upfile" value="${param.upfile }"><!--upfile이 있어야 파일을 지우거나, db를 수정하겠지.  -->
		<input type="hidden" name="orifile" value="${param.orifile }"><!--내 프로젝트에는 ori파일이름을 게시판에서 사용하므로, 이 값도 넘겨줘야 한다.  -->
		<input type="hidden" name="page" value="${param.page }"><!--내 프로젝트에는 ori파일이름을 게시판에서 사용하므로, 이 값도 넘겨줘야 한다.  -->
		
			<tr>
				<td><input type="password" name="pw"></td><!--패스워드를 입력 받고,  -->
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="확인"></td><!--우에 히든값과, 함께 pw서브밋.  -->
			</tr>
		</table>
	</form>
</body>
</html>