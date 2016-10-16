<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title></title> <!--타이틀따윈 없다.  -->
</head> <!--헤드열음  -->
<body> <!--바디열음  -->
	<table border="1">  <!--테이블열음  -->
		<h3 align="center">게 시 판</h3>
		<tr align="center"> <!--행오픈  -->
			<td>번호</td> <!--번호뿌려줌  -->
			<td>제목</td> <!--제목뿌려줌  -->
			<td>작성자</td> <!--작성자뿌려줌  -->
			<td>작성일</td> <!--작성일뿌려줌  -->
			<td>조회수</td> <!--조회수뿌려줌  -->
		</tr> <!--행닫음  -->
	
		<c:forEach items="${list }" var="list" varStatus="no">  <!--어트리뷰트에올라온 list를 가져와서 확장포를 돌려줌.  -->
		<tr> <!--행열음  -->
			<td align="center">${list.id }</td>  <!--아이디 뿌려줌. -->
			<td><a href="BoardDetail.bo?id=${list.id }">${list.title }</a></td>  <!--액션태그 넣고 href넣어주고, id값을 같이 넘겨버림.   -->
			<td>${list.pname }</td>  <!--작성자 뿌려줌.  -->
			<td align="center">${list.reg_date }</td> <!--작성일 뿌려줌.  -->
			<td align="center">${list.cnt }</td> <!--조회수 뿌려줌.  -->
		</tr>
		</c:forEach>
		<tr>
			<td colspan="5" align="right"><a href="BoardWriteForm.bo">글쓰기</a></td>
		</tr>
	</table>
</body>
</html>