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
    <table border="1" align="center" width="100%">  <!--테이블열음  -->
        <h3 align="center">게 시 판</h3>
        <tr align="center"> <!--행오픈  -->
            <td>번호</td> <!--번호뿌려줌  -->
            <td>제목</td> <!--제목뿌려줌  -->
            <td>작성자</td> <!--작성자뿌려줌  -->
            <td>작성일</td> <!--작성일뿌려줌  -->
            <td>조회수</td> <!--조회수뿌려줌  -->
        </tr> <!--행닫음  -->
    
      <c:forEach items="${bean.data }" var="dd" varStatus="no">	<!--넘어온 bean안에 data라는 object를 열어서 그 이름은 dd로 명명  -->
		<tr>
			<td>${bean.start + no.index }</td><!--bean안에 있는 start값 + no.index 한 값을 출력한다. noindex는 0부터 시작한다.   -->
			<td>
			<c:forEach begin="1" end="${dd.ref }">	<!--만약 dd안에 ref이 0보다 크다면   -->
				&nbsp;&nbsp;<!--스페이스바 스페이스바~  -->
			</c:forEach>
			<c:if test="${dd.ref>0 }">└</c:if><!--만약 레벨이 원글이 아닌 댓글이라면 글 앞에 └ -->
				<a href="BoardDetail.bo?id=${dd.id }&last=${dd.last }&page=${bean.page}">${dd.title }</a><!--클릭스 BoardDetail.bo로 보내준다. id값과 함께 ~   -->
			</td>
			<td>${dd.pname }</td><!--작성자 뿌려주고  -->
			<td>${dd.reg_date }</td><!--날자 뿌려주고  -->
			<td>${dd.cnt }</td><!--조회수 뿌려주고.  -->
		</tr>
		
</c:forEach>
	
			

        <tr>
		<td colspan="5" align="center">
		<c:if test="${bean.startPage > 1 }">
		<a href="?page=1"><<</a>
		<a href="?page=${bean.startPage-bean.pageLimit }"><</a>
		
		</c:if>
			<c:forEach begin="${bean.startPage }" end="${bean.endPage }" var="i" step="1"><!--bean객체 안에 있는 startPage부터 endPage까지   -->
			<c:choose>
				<c:when test="${i==bean.page }"><!--만약 i값이 넘어온 page값과 같다면   -->
					<font color="#F00000">[${i }]</font><!--이뿌게 빨강 빨강 ~ 괄호 괄호  -->
				</c:when>
				<c:otherwise>
					<a href="?page=${i }">${i }</a><!--아니라면 page의 값을 셋팅.  -->
				</c:otherwise>
			</c:choose>
			</c:forEach>
			<c:if test="${bean.endPage < bean.totalPage }">
				<a href="?page=${bean.startPage+bean.pageLimit }">></a>
				<a href="?page=${bean.totalPage }">>></a>
			</c:if>
		</td>
		
	</tr>

		

        <tr>
            <td colspan="5" align="right"><a href="BoardWriteForm.bo?page=${bean.page }">글쓰기</a></td><!--이거 누르면 글쓰기 됨 ㅇㅇ   -->
        </tr>
    </table>
</body>
</html>