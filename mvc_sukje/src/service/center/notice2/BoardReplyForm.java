package service.center.notice2;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardBean;
import model.BoardListDao;
import di.Action;
import di.ActionResult;

public class BoardReplyForm implements Action {

	@Override
	public ActionResult execute(HttpServletRequest request,HttpServletResponse response)throws IOException{
		
		BoardListDao bdao = new BoardListDao();//데이터베이스와 연동하기 위한 dao클래스 생성.
		
		String id = request.getParameter("id");//넘어온 아이디값 저장해주고
		
		BoardBean bean = (BoardBean) bdao.getDetail(id);//디테일메소드를 이용 bean객체를 리턴 .

		bdao.close();//데이터베이스 닫아주시고.
		
		bean.setCommand("BoardReplyForm");//내가 어떤걸 사용할 것이라는걸, command에 셋팅, writeform이 알아봐야 하니꼐 ㅇㅇ
		
		String re = "[Re]"; //댓글을 뭘로 셋팅 할 것인지, 나중엔 이거보단 이미지가 낫겠네 ㅇㅇ 
		
		bean.setId(Integer.parseInt(id));//아이디값 셋팅
		bean.setTitle(re+bean.getTitle());//제목값 셋팅
		bean.setContent(re+bean.getContent());//내용 셋팅
		bean.setPage(Integer.parseInt(request.getParameter("page")));//페이지 값 설정.
		bean.setLast(Boolean.parseBoolean(request.getParameter("last")));//마지막글인지 설정.
		request.setAttribute("bean", bean );//어트리뷰트에 bean객체 전송.
		
		
		
		ActionResult result = new ActionResult();//결과 클래스 생성.

		result.setPath("BoardWriteForm");//path값 셋팅.
		
		return result;//결과 클래스 리턴.
	}

}
