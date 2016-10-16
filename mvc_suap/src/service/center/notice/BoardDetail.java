package service.center.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardBean;
import model.BoardDao;
import di.Action;
import di.ActionForward;

public class BoardDetail implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		BoardDao dao = new BoardDao();
		
		String id = request.getParameter("id");
		
		dao.addCount(id);
	
		request.setAttribute("data", dao.BoardDetail(id));
		
		dao.close();
		
		ActionForward forward = new ActionForward();

		
		return forward;
	}

}
