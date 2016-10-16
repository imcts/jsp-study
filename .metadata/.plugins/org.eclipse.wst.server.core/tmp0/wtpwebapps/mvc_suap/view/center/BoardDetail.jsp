<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="ct" tagdir ="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">

   <tr>
      <td>제목</td>
      <td>${data.title }</td>
   </tr>
   <tr>
      <td>아이디</td>
      <td>${data.id }</td>
   </tr>
   <tr>
      <td>작성자</td>
      <td>${data.pname }</td>
   </tr>
   <tr>
      <td>작성일</td>
      <td>${data.reg_date }</td>
   </tr>
   <tr>
      <td>조회수</td>
      <td>${data.cnt }</td>
   </tr>
   <tr>
      <td>내용</td>
      <td><ct:replace str="${data.content}"/> </td>
   </tr>
   <c:if test="${data.upfile!=null }">
   <tr>
      <td>파일</td>
      <td>${data.upfile }</td>
   </tr>
   </c:if>
   <tr>
      <td colspan="2" align="right">
         <a href = "PwChkForm.bo?id=${data.id }&url=BoardModifyForm&page=${param.page }">수정</a>
         <a href = "PwChkForm.bo?id=${data.id }&url=BoardDelete&page=${param.page }">삭제</a>
         <a href = "BoardReplyForm.bo?id=${data.id }&page=${param.page }">답변</a>
         <a href = "BoardList.bo?page=${param.page }">목록으로</a>
      </td>
   </tr>
</table>
</body>
</html>