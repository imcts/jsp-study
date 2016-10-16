package service.center.notice2;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardBean;
import model.BoardListDao;
import di.Action;
import di.ActionResult;

public class BoardModifyForm implements Action{

	@Override//Action 인터페이스 를 상속 받았기에, 오버라이딩한 메소드.
	public ActionResult execute(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		BoardListDao bdao = new BoardListDao(); //수정 폼에 글을 가져오기 위한 Dao클래스 생성.
		
		BoardBean bean = (BoardBean) bdao.getDetail(request.getParameter("id")); //빈 클래스 선언 후 getDetail에서 리턴 받음.
		
		bean.setPage(Integer.parseInt(request.getParameter("page")));//페이지값 세팅.
		
		bdao.close();//데이터베이스 클로즈
		
		request.setAttribute("bean", bean);//디테일 메소드를 이용,
		
		ActionResult result = new ActionResult();//디폴트 클래스 생성.
		
		return result;//결과값 클래스 리턴.
	}

}
