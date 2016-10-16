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

public class BoardModify implements Action{

	@Override//Action 인터페이스 를 상속 받았기에, 오버라이딩한 메소드.
	public ActionResult execute(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		BoardListDao bdao = new BoardListDao();//글을 수정하기 위한, Dao생성
		
		MultipartRequest mm = new MultipartRequest(//BoardWriteForm에서 넘어온 값을 받기 위한 MutipartRequest. 생성.
				request,//리퀘스트
				"C:\\workspace\\JspSave\\mvc_sukje\\WebContent\\image", //이미지를 저장하기 위한 경로설정.
				1024*1024*10,//사이즈 설정. 
				"utf-8",//인코더 설정.
				new DefaultFileRenamePolicy()//파일명 중복 방지 설정.
				);
		
		BoardBean bean = new BoardBean();//정보값을 담을 bean클래스 생성.
		
		bean.setId(Integer.parseInt(mm.getParameter("id")));//아이디 값 셋팅.
		bean.setTitle(mm.getParameter("title"));//제목 셋팅
		bean.setContent(mm.getParameter("content"));//내용 셋팅.
		
		if(mm.getParameter("upfile")!=null){//만약 사용자가 새로운 파일을 업로딩 했다면
			bean.setUpfile(mm.getParameter("upfile"));//시스템파일 값 셋팅.
			bean.setOrifile(mm.getOriginalFileName("upfile"));//오리지널 파일 값 셋팅.
		}else{			
			bean.setUpfile(mm.getFilesystemName("upfile")); //만약 값이 없다면, 
			bean.setOrifile(mm.getFilesystemName("upfile"));//만약 값이 없다면,
		}
		
		bdao.BoardModify(bean); //데이터베이스에 bean클래스 전송.

		
		
		
		ActionResult result = new ActionResult(); //결과클래스 생성.
		
		result.setReDirect(true);//리다이렉팅 준비.
		result.setPath("BoardDetail.bo?id="+bean.getId()+"&page="+mm.getParameter("page"));//Path값 셋팅후 내가 수정을 눌렀던 곳으로 돌아가기 위한 id값 넘김.
		
		
		return result;//결과 클래스 셋팅후 리턴.
	}

}
