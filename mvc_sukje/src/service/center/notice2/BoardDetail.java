package service.center.notice2;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardBean;
import model.BoardListDao;
import di.Action;
import di.ActionResult;

public class BoardDetail implements Action{//글을 클릭시 상세 보기가 가능하게 해줄 녀석. ㅇㅇ 
	@Override//Action 인터페이스 를 상속 받았기에, 오버라이딩한 메소드.
	public ActionResult execute(HttpServletRequest request,HttpServletResponse response) throws IOException {
		BoardListDao bdao = new BoardListDao(); //데이터 베이스와 연동하기 위한 Dao클래스 생성. 
		
		BoardBean bean =(BoardBean) bdao.getDetail(request.getParameter("id"));
		
		bdao.close();//클로즈 실행.
		
		bean.setPage(Integer.parseInt(request.getParameter("page")));	
				
		request.setAttribute("bean", bean );//넘어온 아이디의값을 이용
		//상세 보기할 페이지 값의 정보를 어트리뷰트에 띄워준다.
		
		
		ActionResult result = new ActionResult(); //그냥 상세보기만 되면 되니까 ~ 그냥 보내줘 ~
		
		return result; //result클래스 리턴.
	}

}
