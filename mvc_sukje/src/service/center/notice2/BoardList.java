package service.center.notice2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.*;
import di.*;


public class BoardList implements Action{//게시판의 목록을 뿌려줄 클래스.
	@Override//Action 인터페이스 를 상속 받았기에, 오버라이딩한 메소드.
	public ActionResult execute(HttpServletRequest request,HttpServletResponse response) {
		BoardListDao bdao = new BoardListDao(); //리스트를 가져올 BoardListDao 생성.
		
		BoardBean bean = new BoardBean();//정보를 저장시킬 bean클래스 생성.
		
		if(request.getParameter("page")!=null && !request.getParameter("page").equals("")){//만약 넘어온 page파라미터값이 null이 아니라면.
			bean.setPage(Integer.parseInt(request.getParameter("page")));//bean클래스에 page값 저장
			
		}
		
		bean.setData(bdao.getList(bean));//데이터베이스에서 내가 넘겨준 bean클래스에 담긴 page값을 이용, 
		//getstart와 getEnd를 사용해서 값을 쓸 것이고, 각각의 get메소드에는 내가 설정해준 값들이 넘겨받은 page값을 이용해서 셋팅되어있다. 
		//getter setter에 규제를 거는 것 뿐 아니라, 변형해서 쓰는게 더 효과적이다.
		
		
		bean.setStartPage(  (bean.getPage()-1)/bean.getPageLimit() * bean.getPageLimit()+ 1    );
		//시작할 페이지값을 셋팅한다. 근데 이것도 게터에서 설정해놓는게 훨 안낫냐- _-? 어차피 bean에 다 들어있는데,
		//어쨌든 시작 페이지는 디폴트값인 1페이지가 들어왔다면, 
		// (page-1)/pagelimit * pagelimit +1 이 된다.
		//즉   0 / 4 * 4 +1 = 1페이지가 되는것.
		//   0 / 4 = int 형이기 때문에 뒷자리가 잘려 나가고, 0 * 4 = 0 ,0 +1 =1 
		
		bean.setEndPage(bean.getStartPage()+bean.getPageLimit()-1);
		//끝나는 페이지는 시작 페이지 + 제한 페이지 -1 의 값, 
		//시작 페이지가 1페이지라면,   1 + 4 - 1 ; 
		//즉 4 페이지가 되어야 한다.
		
		if(bean.getTotalPage()<bean.getEndPage()){ //만약 토탈 페이지가  끝 페이지보다 작다면, 
			//이건 무슨 뜻이냐면, 예를 들어, 끝나는 페이지가 10페이지인데, 
			//총 토탈 페이지는 9페이지라면, 10페이지의 값이 없음에도 1페이지의 값이 나오게 된다. end페이지의 셋팅 설정상 어쩔 수 없는 부분.
			bean.setEndPage(bean.getTotalPage()); //그래서 end페이지의 값을 토탈 페이지에 맞춰버리면 간단히 해결.
		}
		
		request.setAttribute("bean", bean); //받아온 request를 이용하여, Attribute에 list를 띄워줌.
		
		ActionResult result = new ActionResult(); //forward시킬 주소값을 담고있는 클래스를 리턴 시켜줌.
		
		return result; //결과 클래스 리턴.
	}
}
