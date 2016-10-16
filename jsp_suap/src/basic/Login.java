package basic;

import java.util.HashMap;
import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Login {
	HashMap map; 
	String id, pw, url;
	HttpSession session;
	HttpServletRequest request;
	
	
	
	public Login(HttpServletRequest request) {
	  this.map=new HashMap<>();
	  this.request=request;
	  this.session=request.getSession();
	  
	  	
	  
	  
	  this.input();
	  
	  this.loginChk();
	  
	  this.session.setAttribute("login", this);
	  
	}
	private void loginChk() {
		this.url="loginform.jsp";
		this.id="";
		this.pw="";
		
		if(request.getParameter("id")!=null){
			this.id=request.getParameter("id");
		}
		if(request.getParameter("pw")!=null){
			this.pw=request.getParameter("pw");
		}
		
		
		Iterator it = this.map.keySet().iterator();
		
		while(it.hasNext()){
			String key = (String)it.next();
			
			if(this.id.equals(key)){ //입력한 아이디랑 저장된 키값이랑 같다면 , 
				Iterator it2 = this.map.keySet().iterator();
				
				while(it2.hasNext()){
					String password = (String)it2.next();
					if(this.pw.equals(map.get(password))){
						this.url="loginOk.jsp";
					}
				}
				
			}
		}
		
	}
	public String getUrl() {
		return url;
	}
	private void input() {
		this.map.put("aaa", "111");
		this.map.put("bbb", "222");
		this.map.put("ccc", "333");
		this.map.put("ddd", "444");
		this.map.put("eee", "555");
	}

}
