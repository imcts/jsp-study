package service;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.center.notice.*;
import di.Action;
import di.ActionForward;


@WebServlet("/F_Controller")//웹 서블렛의 클래스 위치.
public class F_Controller extends HttpServlet {//extends HttpServlet을 상속받음, 원래 기능은 get과 post를 이클래스가 연동시킴.
	private static final long serialVersionUID = 1L; //버전 설정.
    
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//doprocess request와 response를 매개변수로 받아서, 
    	String requestURI = request.getRequestURI();
    	String contextPath = request.getContextPath();
    	String command = requestURI.substring(contextPath.length()+1,
    			requestURI.lastIndexOf(".bo")
    			);
    	
    	
    	Action action=null;
    	ActionForward forward = null;
    	ArrayList<String> noClassList = new ArrayList();
    	noClassList.add("BoardWriteForm");	
    	noClassList.add("PwChkForm");	

		if (noClassList.contains(command)) {
			forward = new ActionForward();
		} else {
			try {
				switch (command) {
				case "BoardList":
					action = new BoardList();
					forward = action.execute(request, response);
					break;
				case "BoardDetail":
					action = new BoardDetail();
					forward = action.execute(request, response);
					break;
				case "BoardWrite":
					action = new BoardWrite();
					forward = action.execute(request, response);
					break;
				case "PwChk":
					action = new PwChk(); 
					forward = action.execute(request, response);
					break;
				case "BoardDelete":
					action = new BoardDelete();  
					forward = action.execute(request, response);
					break;
				case "BoardModifyForm":
					action = new BoardModifyForm();
					forward = action.execute(request, response);
					break;
				case "FileDelete":
					action = new FileDelete();
					forward = action.execute(request, response);
					break;
				case "BoardModify":
					action = new BoardModify();
					forward = action.execute(request, response);
					break; 
				case "BoardReplyForm":
					action = new BoardReplyForm();
					forward = action.execute(request, response);
					break;
				case "BoardReply":
					action = new BoardReply();
					forward = action.execute(request, response);
					break;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
    	
    	if(forward!=null){
    		if(forward.isReDirect()){//이게 트루면 response를 리다이렉트해라.
    			response.sendRedirect(forward.getPath());//내가 지정하는 페이지로 보내겠다.
    		}else{
    			if(forward.getPath()==null){
            		forward.setPath(command);
        		}
            	String skin = "view/center/"+forward.getPath()+".jsp";
    			RequestDispatcher dispatcher = request.getRequestDispatcher(skin); //정보를 담아준다.
    			dispatcher.forward(request, response);
    		}

    	}
    		
	}
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

}
