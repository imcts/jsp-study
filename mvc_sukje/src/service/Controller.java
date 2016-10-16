package service;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import di.*;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L ; //모든 데이터는 바이트 단위로 전송되기 때문에, 행여나 일어날 수 있는 InvalidClassException를 
	//미연에 방지하고자, serialVersionUID를 선언해준다. 서로 다른 자바 클래스간의 컴파일러 과정에서 동일한 값을 얻어내기 위해서는 이 선언을 해주는게 좋다. 어찌보면 안전빵. 
	//서블릿 클래스가 생성됨과 동시에 메소드 영역에 상수값으로 떠 있으므로, 다시 컨트롤러를 찾을때 버전값을 이용 찾아오게 하는 개념인듯. 
	
	Action action=null; //액션 인터페이스 선언.
	ActionResult result=null; //결과값을 담아서 리턴받을 클래스 선언.

	protected void doprocess(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		//모든 메소드는 여기로 오지롱 ~> ㅅ<
		
		String fullUrl = request.getRequestURI(); //프로젝트명부터 마지막 주소값까지를 가져옴.
		String conUrl = request.getContextPath(); //프로젝트명을 가져옴.
		String command = fullUrl.substring(conUrl.length()+1,fullUrl.lastIndexOf(".bo"));
		//프로젝트명부터 전체 주소값인 (/mvc_sukje/BoardList.bo)에서 프로젝트의 주소값을 제해주고, 그 후 (.bo)를 제해주면, 실질적인 명령어값이 남게 된다.
		//클라이언트가 이동을 원한 페이지를 실행시킬 수 있는 key값.
	
		ArrayList list = new ArrayList();//command값을 담고 있을 리스트 생성.
		list.add("DownRoad");
		list.add("BoardWriteForm");
		list.add("PwChkForm");

		if (list.contains(command)) {
			this.result = new ActionResult();// 리스트 안의 값이 들어오면 그냥 다운로드 .jsp를 포워딩.
		}else{
			try {
				this.action = (Action)Class.forName("service.center.notice2."+command).newInstance();
				//들어오는 command값에 해당하는 클래스 생성.
				this.result = action.execute(request, response); //결과 클래스를 리턴 받음.
			} catch (Exception e) {
				e.printStackTrace();
			} 
			
		}
		
		
		
		
		if(result!=null){
			if(result.isReDirect()){ //결과클래스 안에 있는 reDirect값이 true라면.
				response.sendRedirect(result.getPath()); //해당  페이지 이동. 
			}else{//아니라면.
				if(result.getPath()==null){//결과 클래스 안에 있는 path값이 초기값인 상태 그대로라면, 페이지를 구성하면서 뿌려줄 값이있다는 이야기.
					this.result.setPath(command);//그렇다면 어떤 페이지를 뿌려줄 것인지를 결정시키는 커맨드값을 입력.
				}
				
				if(result.isReDirect()==false && result.getPath()!=null){ //만약 path값은 셋팅했고, redirecting은 하지 않겠다면
					request.setAttribute("mainP", result.getPath());//Attribute에 path에 저장된 값을 셋팅.
				}else{
					request.setAttribute("mainP", command); //Attribute에 command값 셋팅.
				}
				
				RequestDispatcher ds =  request.getRequestDispatcher("view/center/template.jsp");//template페이지 포워딩.
				ds.forward(request, response); //포워딩.
			}
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		this.doprocess(request, response);//get방식으로 오는것은 전부 doprocess로 이동.
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doprocess(request, response);//post방식으로 오는것은 전부 doprocess로 이동.
	}

}
