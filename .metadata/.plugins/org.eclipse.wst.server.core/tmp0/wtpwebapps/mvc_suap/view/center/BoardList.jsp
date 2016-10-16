<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="60%" align="center">
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성일</td>
			<td>조회수</td>
		</tr>
<c:forEach items="${data.data }" var="dd" varStatus="no">	
		<tr>
			<td>${data.start + no.index }</td>
			<td>
			<c:forEach begin="1" end="${dd.ref }">	
				&nbsp;&nbsp;
			</c:forEach>
			<c:if test="${dd.ref>0 }">└</c:if>
			<a href="BoardDetail.bo?id=${dd.id }&page=${data.page}">${dd.title }</a>
			</td>
			<td>${dd.pname }</td>
			<td>${dd.reg_date }</td>
			<td>${dd.cnt }</td>
		</tr>
</c:forEach>
	<tr>
		<td colspan="5" align="center">
		<c:if test="${data.startPage>1 }">
			<a href="?page=1"><<</a>
			<a href="?page=${data.page-1 }"> <  </a>
		</c:if>
			<c:forEach begin="${data.startPage }" end="${data.endPage }" var="i">
			<c:choose>
				<c:when test="${i==data.page }">
					<font color="#F00000">[${i }]</font>
				</c:when>
				<c:otherwise>
					<a href="?page=${i }">${i }</a>
				</c:otherwise>
			</c:choose>
			</c:forEach>
		<c:if test="${data.endPage<data.totalPage }">
			<a href="?page=${data.page+1 }">  > </a>
			<a href="?page=${data.totalPage }">>></a>
		</c:if>
		</td>
	</tr>
	<tr>	
		<td colspan="5" align="right">
			<a href="BoardWriteForm.bo">글쓰기</a>
		</td>

	</tr>
	</table>
</body>
</html>