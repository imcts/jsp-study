package service.center.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.BoardBean;
import model.BoardDao;
import di.Action;
import di.ActionForward;

public class FileDelete implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		BoardDao dao = new BoardDao();
		String up = "up";
		String path = "C:\\Users\\TaeSan\\Documents\\JspSave\\mvc_suap\\WebContent\\"+up;
		int size=1024*1024*10;
		
		MultipartRequest mm = new MultipartRequest(request,  path, size, "utf-8", new DefaultFileRenamePolicy());
		
		BoardBean bean = new BoardBean();
		
		bean.setId(Integer.parseInt(mm.getParameter("id")));
		bean.setTitle(mm.getParameter("title"));
		bean.setPname(mm.getParameter("pname"));
		bean.setContent(mm.getParameter("content"));
		bean.setPage(Integer.parseInt(mm.getParameter("page")));
		bean.setUpfile("");
		
		
		dao.FileDelete(mm.getParameter("id"));
		dao.close();
		
		request.setAttribute("data", bean);

		
		ActionForward forward = new ActionForward();

		forward.setPath("BoardModifyForm");
		
		
		return forward;
}

} 