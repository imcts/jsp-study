package service.center.notice2;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.BoardBean;
import model.BoardListDao;
import di.Action;
import di.ActionResult;

public class FileDelete implements Action {//글을 DB에 집어 넣기 위한 클래스.
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
		

		bean.setId(Integer.parseInt(mm.getParameter("id")));//아이디값 셋팅.
		bean.setTitle(mm.getParameter("title"));//제목 셋팅.
		bean.setContent(mm.getParameter("content"));//내용 셋팅.
		bean.setUpfile("");//파일 이름명 없애줌.
		bean.setOrifile("");//파일 이름명 없애줌.
		
		if(mm.getParameter("upfile")!=null || //만약 업파일이 널이 아니라면.
				!mm.getParameter("upfile").equals("") || 
				!mm.getParameter("upfile").equals("null")){

			File ff = new File(//image폴더 안의 사진을 지우기 위한 경로 셋팅.
					"C:\\Users\\TaeSan\\Documents\\JspSave\\mvc_sukje\\WebContent\\image\\"
							+mm.getParameter("upfile"));
			ff.delete();//해당 파일 삭제.
		
			bdao.FileDelete(mm.getParameter("id"));//데이터베이스 안에 있는 해당 글번호의 
			//파일 저장명을 초기화시키기 위한 메소드 실행.
			
		}

		
		request.setAttribute("bean", bean); //bean클래스 어트리뷰트에 띄워즘.

		
		ActionResult result = new ActionResult();//결과 클래스 생성.

			
		result.setPath("BoardModifyForm");//Path값 입력.
		
		return result;//겨로가 클래스 리턴.
	}

}
