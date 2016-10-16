package service.center.notice2;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.BoardBean;
import model.BoardListDao;
import di.Action;
import di.ActionResult;

public class BoardReply implements Action {

	@Override
	public ActionResult execute(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		BoardListDao dao = new BoardListDao();//데이터베이스를 위한 DAO클래스 생성.
		
		MultipartRequest mm = new MultipartRequest(//BoardWriteForm에서 넘어온 값을 받기 위한 MutipartRequest. 생성.
				request,//리퀘스트
				"C:\\workspace\\JspSave\\mvc_sukje\\WebContent\\image", //이미지를 저장하기 위한 경로설정.
				1024*1024*10,//사이즈 설정. 
				"utf-8",//인코더 설정.
				new DefaultFileRenamePolicy()//파일명 중복 방지 설정.
				);
		
		BoardBean bean = new BoardBean(); //빈 객체 생성.
		
		
		bean.setId(Integer.parseInt(mm.getParameter("id")));//파라미터로 넘어온 id값 셋팅
		bean.setTitle(mm.getParameter("title"));//제목 셋팅
		bean.setPname(mm.getParameter("pname"));//작성자 셋팅
		bean.setPw(mm.getParameter("pw"));//패스워드 셋팅
		bean.setContent(mm.getParameter("content"));//글 내용 셋팅
		bean.setLast(Boolean.parseBoolean(request.getParameter("last")));

		
		int id = dao.BoardReply(bean); //답글을 작성시키기 위한 메소드 실행.
		
		
		ActionResult result = new ActionResult();//결과 클래스 생성

		
		result.setReDirect(true);//방금 작성한 글을 보기 위해 redirect실행
		
		int page = Integer.parseInt(mm.getParameter("page"));//페이지 값은 일단 넘어온 값을 저장.
		
		if(mm.getParameter("last").equals("true")){//만약 넘어온 last의 값이 트루라면.
			page++;//페이지 ++ 
		}
		result.setPath("BoardDetail.bo?id="+id+"&page="+page);//path값 설정
		
		return result;//결과 클래스 리턴.
}

} 