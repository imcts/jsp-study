package service.center.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.BoardBean;
import model.BoardDao;
import di.Action;
import di.ActionForward;

public class BoardDelete implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		BoardDao dao = new BoardDao();
	
	
		dao.BoardDelete(request.getParameter("id"));
		
		
		ActionForward forward = new ActionForward();

		
		forward.setReDirect(true);
		
		forward.setPath("BoardList.bo?page="+request.getParameter("page"));
		
		return forward;
}

} 