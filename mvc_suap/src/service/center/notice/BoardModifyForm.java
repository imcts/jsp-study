package service.center.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardBean;
import model.BoardDao;
import di.Action;
import di.ActionForward;

public class BoardModifyForm implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		BoardDao dao = new BoardDao();
		
		String id = request.getParameter("id");
		
		BoardBean bean = (BoardBean)dao.BoardDetail(id);

		//bean.setPage(Integer.parseInt(request.getParameter("page")));
		
		request.setAttribute("data", bean);
		
		
		dao.close();
		
		ActionForward forward = new ActionForward();

		
		return forward;
	}

}
