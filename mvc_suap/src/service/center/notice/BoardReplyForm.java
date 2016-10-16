package service.center.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardBean;
import model.BoardDao;
import di.Action;
import di.ActionForward;

public class BoardReplyForm implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		BoardDao bdao = new BoardDao();
		
		String id = request.getParameter("id");
		
		BoardBean bean = (BoardBean) bdao.BoardDetail(id);

		bdao.close();
		
		bean.setCommand("BoardReplyForm");
		
		String re = "[Re]";
		
		bean.setTitle(re+bean.getTitle());
		
		bean.setContent(re+bean.getContent());
		/*bean.setPage(Integer.parseInt(request.getParameter("page")));*/
		request.setAttribute("data", bean );
		
		
		
		ActionForward forward = new ActionForward();

		forward.setPath("BoardWriteForm");
		
		return forward;
	}

}
