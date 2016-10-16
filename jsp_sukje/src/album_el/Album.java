package album_el;

import java.util.*;
import javax.servlet.http.*;

public class Album {
	HttpServletRequest request;
	HttpSession session;
	AlbumDao adao;
	AlbumBean bean;
	String menukey,mainkey,mainurl,id,pw;
	int loginchk=0;
	
	public Album(HttpServletRequest request) throws Exception {
		this.request=request;
		this.session=request.getSession();
		this.bean=new AlbumBean();
		this.adao=new AlbumDao(this.bean);
		
		this.menukey="info";
		if(request.getParameter("menukey")!=null){
			this.menukey=request.getParameter("menukey");
		}
		this.mainkey="hello";
		if(request.getParameter("mainkey")!=null){
			this.mainkey=request.getParameter("mainkey");
		}
		
		
		this.mainurl="inc/info.jsp";
		if(this.menukey.equals("artist")){
			this.mainurl="inc/artistview.jsp";
			if(request.getParameter("mainkey")==null){
				this.mainkey="yunmi";
			}
			
		}else if(this.menukey.equals("center")){
			this.mainurl="inc/center.jsp";
			if(request.getParameter("mainkey")==null){
				this.mainkey="mainstr";
			}
		}
		

		if(this.session.getAttribute("user")!=null){
			this.loginchk=((LoginChek)session.getAttribute("user")).getLoginChk();
		}
		
		if(request.getParameter("id")!=null || request.getParameter("password")!=null && this.loginchk==0){
			this.id=request.getParameter("id");
			this.pw=request.getParameter("password");
			this.login();
		}
		
		if(request.getParameter("logout")!=null){
			this.loginchk=0;
			this.session.invalidate();
		}
		
		System.out.println(loginchk);
		
		this.bean.setLoginchk(this.loginchk);
		this.bean.setMainkey(this.mainkey);
		this.bean.setMainUrl(this.mainurl);
		this.bean.setMenukey(this.menukey);
		this.request.setAttribute("bean", this.bean);
	}

	private void login() throws Exception {
		HashMap map = adao.getUser();
		
		Iterator it = map.keySet().iterator();
		while(it.hasNext()){
			String key=(String)it.next();
			
			if(this.id.equals(key)){
				if(this.pw.equals(map.get(key))){
					this.loginchk=1;
					this.session.setAttribute("user", new LoginChek(this.loginchk, this.id));
				}
			}	
		}
		
		
	}
	
}
