package service.center.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardBean;
import model.BoardDao;
import di.Action;
import di.ActionForward;

public class PwChk implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		BoardDao dao = new BoardDao();
		
		
		BoardBean bean = new BoardBean();
		
		bean.setId(Integer.parseInt(request.getParameter("id")));
		bean.setPw(request.getParameter("pw"));
		
		String page = ".bo?id="+bean.getId()+"&page="+request.getParameter("page");
		
		bean.setGoUrl("BoardDetail"+page);
		bean.setMsg("비밀번호가 일치하지 않습니다.");
		
		
		if (dao.PwChk(bean)) {
			bean.setGoUrl(request.getParameter("url")+page);
			bean.setMsg("비밀번호가 일치합니다.");
		}
		
		request.setAttribute("data", bean);
		
		ActionForward forward = new ActionForward();
		
		
		return forward;
	}

}
