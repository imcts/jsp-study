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

public class BoardWrite implements Action {//글을 DB에 집어 넣기 위한 클래스.
	@Override//Action 인터페이스 를 상속 받았기에, 오버라이딩한 메소드.
	public ActionResult execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		BoardListDao bdao = new BoardListDao();//글을 입력하기 위해, 
		
		BoardBean bean = new BoardBean();//Dao메소드에 던져주기 위한 bean 클래스.
		
		MultipartRequest mm = new MultipartRequest(//BoardWriteForm에서 넘어온 값을 받기 위한 MutipartRequest. 생성.
				request,//리퀘스트
				"C:\\workspace\\JspSave\\mvc_sukje\\WebContent\\image", //이미지를 저장하기 위한 경로설정.
				1024*1024*10,//사이즈 설정. 
				"utf-8",//인코더 설정.
				new DefaultFileRenamePolicy()//파일명 중복 방지 설정.
				);
		
		bean.setTitle(mm.getParameter("title"));//bean에 title입력.
		bean.setPname(mm.getParameter("pname"));//bean에 pname입력.
		bean.setPw(mm.getParameter("pw"));//bean에 pw입력.
		bean.setContent(mm.getParameter("content"));//bean에 content입력.
		bean.setUpfile(mm.getFilesystemName("upfile")); //bean에 systemname입력.
		bean.setOrifile(mm.getOriginalFileName("upfile"));//bean에 oriname입력.
		
		
		int id = bdao.writeContent(bean); //ActionResult에 setPath를 해줄때 해당 글넘버를 detail로 보기위해, id를 넘겨받는다.
		
		 
		
		ActionResult result = new ActionResult(); //결과 클래스 생성.
		
		result.setReDirect(true);//리다이렉트를 하라는 명령. 
		result.setPath("BoardDetail.bo?id="+id);//리다이렉팅 시킬 Path값 셋팅.
		
		return result;//결과 클래스 리턴.
	}

}
