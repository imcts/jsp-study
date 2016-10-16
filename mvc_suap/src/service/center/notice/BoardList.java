package service.center.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardBean;
import model.BoardDao;
import di.Action;
import di.ActionForward;

public class BoardList implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		BoardDao dao = new BoardDao();
		BoardBean bean = new BoardBean();
		
		if(request.getParameter("page")!=null && !request.getParameter("page").equals("")){
			bean.setPage(Integer.parseInt(request.getParameter("page")));
		}
		
		bean.setData(dao.BoardList(bean));
		
		
		bean.setStartPage(  (bean.getPage()-1)/bean.getPageLimit() * bean.getPageLimit()+ 1    );
		bean.setEndPage(bean.getStartPage()+bean.getPageLimit()-1);
		
		if(bean.getTotalPage()<bean.getEndPage()){
			bean.setEndPage(bean.getTotalPage());
		}
		
		request.setAttribute("data", bean);
		
		ActionForward forward = new ActionForward();
		
		return forward;
	}

}
