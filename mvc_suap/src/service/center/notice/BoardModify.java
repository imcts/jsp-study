package service.center.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.BoardBean;
import model.BoardDao;
import di.Action;
import di.ActionForward;

public class BoardModify implements Action {

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
		bean.setPw(mm.getParameter("pw"));
		bean.setContent(mm.getParameter("content"));
		
		if(mm.getParameter("upfile")!=null){
			bean.setUpfile(mm.getParameter("upfile"));
		}else{			
			bean.setUpfile(mm.getFilesystemName("upfile"));
		}
		
		dao.BoardModify(bean);
		

		
		ActionForward forward = new ActionForward();

		
		forward.setReDirect(true);
		
		forward.setPath("BoardDetail.bo?id="+bean.getId()+"&page="+mm.getParameter("page"));
		
		return forward;
}

}