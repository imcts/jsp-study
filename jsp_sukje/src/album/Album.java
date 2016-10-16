package album;

import java.util.*;
import javax.servlet.http.*;

public class Album {
	HttpServletRequest request;
	HttpSession session;
	AlbumDao adao;
	AlbumBean bean;
	String mainUrl,menukey,mainkey,id,pw;
	int loginChk=0;
	
	public Album(HttpServletRequest request) {
		this.request=request;
		this.session=request.getSession();
		this.bean=new AlbumBean();
		this.adao = new AlbumDao(bean);
		
		
		
		this.seting();
		
		
		
		this.bean.setMenukey(this.menukey);
		this.bean.setMainkey(this.mainkey);
		this.bean.setMainUrl(this.mainUrl);
		this.request.setAttribute("bean", bean);
		
	}


	private void seting() {
		this.mainUrl="inc/hello.jsp"; //초기값은 무조건 로그인 폼.
		
		this.loginChk=0;
		if(this.session.getAttribute("user")!=null){
			this.loginChk=((LoginChek)session.getAttribute("user")).getLoginChk();
		}
		
		
		this.menukey="info";//초기값은 인포.
		if(request.getParameter("menukey")!=null){
			this.menukey=request.getParameter("menukey");
			if(menukey.equals("center")){
				this.mainUrl="inc/mainstr.jsp";
			}
			
			if(menukey.equals("artist")){
				if(this.loginChk==0){
					this.mainUrl="inc/loginform.jsp";
				}else{
					this.mainUrl="inc/yunmi.jsp";
				}
			}
		} 
		
		
		this.mainkey="inc/hello.jsp";//초기값은 인사말.
		if(request.getParameter("mainkey")!=null){
			this.mainkey=request.getParameter("mainkey");
			this.mainUrl="inc/"+mainkey+".jsp";
			if(mainkey.equals("artist")){
				if(this.loginChk==0){
					this.mainUrl="inc/loginform.jsp";
				}else{
					this.mainUrl="inc/detail.jsp"; //무조건 디테일뷰로 보내부러.
				}
			}
			
			System.out.println(this.mainUrl+"메인키");
		}
				
		
		
		if(request.getParameter("id")!=null || request.getParameter("password")!=null && this.loginChk==0){
			this.id=request.getParameter("id");
			this.pw=request.getParameter("password");
			this.loginChk();
		}
		
	
		System.out.println(this.loginChk+"로그인체크값");
		
	}
/*	private void imageChoice() {
		if(this.detailInfo.equals("aaa")){
			this.image="yunmi.jpg";
		}
		else if(this.detailInfo.equals("bbb")){
			this.image="hyusung.jpg";
		}
		else if(this.detailInfo.equals("ccc")){
			this.image="gaeun.jpg";
		}
		else if(this.detailInfo.equals("ddd")){
			this.image="upton.jpg";
		}
		else if(this.detailInfo.equals("eee")){
			this.image="yuri.jpg";
		}
	}
*/
	private void loginChk() {
		HashMap userMap=this.adao.userSeting();
		Iterator it = userMap.keySet().iterator();
		
		while(it.hasNext()){
			String key=(String)it.next();
			
			if(this.id.equals(key) && this.pw.equals(userMap.get(key))){
				this.loginChk=1;
				this.mainUrl="inc/hello.jsp";
				this.session.setAttribute("user", new LoginChek(this.loginChk,this.id));
			}			
		}
		
		
	}
	
}
