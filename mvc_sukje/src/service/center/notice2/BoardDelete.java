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

public class BoardDelete implements Action {

	@Override//Action 인터페이스 를 상속 받았기에, 오버라이딩한 메소드.
	public ActionResult execute(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		BoardListDao bdao = new BoardListDao();//글을 삭제 하기 위한 DAO클래스 생성.
	
		if(request.getParameter("upfile")!=null){//만약 넘어온 파라미터값이 있다면.
			File ff = new File( //system파일을 삭제하기 위한 경로 지정.
					"C:\\Users\\TaeSan\\Documents\\JspSave\\mvc_sukje\\WebContent\\image\\"
							+request.getParameter("upfile"));
			ff.delete();//파일 삭제.
		}
		
		bdao.BoardDelete(request.getParameter("id")); //데이터베이스에서 해당 글을 삭제 하기 위해 id값 넘겨줌.
		
		
		ActionResult result = new ActionResult();//결과 클래스 생성.

		
		result.setReDirect(true);//리다이렉팅을 위한 셋팅
		
		result.setPath("BoardList.bo?page="+request.getParameter("page"));//Path값 설정.
		
		return result;//결과 클래스 리턴.
}

} 