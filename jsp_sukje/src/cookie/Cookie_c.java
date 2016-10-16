package cookie;

import java.util.HashMap;
import java.util.Iterator;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

public class Cookie_c {
	
	HttpServletRequest request;
	HttpServletResponse response;
	HashMap map;
	Cookie loginCoo;
	Cookie [] cooarr;
	String id, password;
	int logout,cookieOk=0;

	String url;
	
	
	public Cookie_c(HttpServletRequest request, HttpServletResponse response) {
		this.request=request;
		this.response=response;
		this.map=new HashMap<>();
		this.id="";
		this.cooarr=request.getCookies();
		
		if(request.getParameter("id")!=null){
			this.id=request.getParameter("id");
		}
		this.password="";
		if(request.getParameter("password")!=null){
			this.password=request.getParameter("password");
		}
		
		
		this.input();
		
		
		this.logout=0;
		if(request.getParameter("logout")!=null){
			this.logout=Integer.parseInt(request.getParameter("logout"));
		}
		
		if(this.logout==1){
			for(int i=0; i<this.cooarr.length; i++){
				this.loginCoo=new Cookie(cooarr[i].getName(),"");
				this.loginCoo.setMaxAge(0);
				this.loginCoo.setPath("/");
				this.response.addCookie(this.loginCoo);
			}
		}
		
		
		this.url="loginForm.jsp";
		this.loginChk();
	}

	public String getId() {
		return id;
	}

	private void input() {
		this.map.put("aaa", "111");
		this.map.put("bbb", "222");
		this.map.put("ccc", "333");
		this.map.put("ddd", "444");
		this.map.put("eee", "555");
	}

	public void loginChk(){
		Iterator it = this.map.keySet().iterator();
		
		br : while(it.hasNext()){
			if(((String)it.next()).equals(id)){
				
				Iterator pw = this.map.keySet().iterator();
				while(pw.hasNext()){
					String pass = ((String)this.map.get((String)pw.next()));
					if(pass.equals(password)){
						this.loginCoo=new Cookie(this.id,"login");
						this.loginCoo.setPath("/");
						this.response.addCookie(this.loginCoo);
						this.cookieOk=1;
						this.url="success.jsp";
						break br;
					}
				
				
				}
			}
		}
		
		

	}


	public String getUrl() {
		return url;
	}

}
