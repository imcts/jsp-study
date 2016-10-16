package service.center.notice2;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardBean;
import model.BoardListDao;
import di.Action;
import di.ActionResult;

public class PwChk implements Action{

	@Override//Action 인터페이스 를 상속 받았기에, 오버라이딩한 메소드.
	public ActionResult execute(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		BoardListDao bdao = new BoardListDao();//비밀번호 체크를 위한 DAO생성.
		 
		BoardBean bean = new BoardBean(); //정보를 담을 Bean클래스 생성.
	
		bean.setId(Integer.parseInt(request.getParameter("id"))); //아이디값 세팅.
		bean.setPw(request.getParameter("pw"));//비밀번호값 셋팅.
		bean.setMsg("비밀번호가 일치하지 않습니다.");//디폴트 값으로 노일치 셋팅.
		bean.setUrl("BoardDetail.bo?id="+request.getParameter("id")+"&page="+request.getParameter("page"));//디폴트 값으로 다시 돌아갈 디테일 값 세팅.
		
		if(bdao.PwChk(bean)){//만약 비밀번호가 일치한다면.
			bean.setMsg("비밀번호가 일치합니다.");//메시지값 바꿔주고.
			bean.setUrl(request.getParameter("url")+".bo?id="+request.getParameter("id")//아이디값 받고,
					+"&upfile="+request.getParameter("upfile")//시스템이름 받고
					+"&orifile="+request.getParameter("orifile")
					+"&page="+request.getParameter("page")
					);//오리지널 파일명 받고
		}
		
		request.setAttribute("bean", bean);//어트리뷰트에 띄워줌.
		
		ActionResult result = new ActionResult();//결과클래스 디폴트로 생성.
		
		return result;//결과 클래스 리턴.
	}

}
