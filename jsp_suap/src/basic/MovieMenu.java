package basic;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

public class MovieMenu {
	HashMap<String, ArrayList<Hobby>> menu = new HashMap<>();
	HttpServletRequest request;
	String substr,mainStr,mainUrl,sub,main;
	
	public String getMainUrl() {
		return mainUrl;
	}


	public void setMainUrl(String mainUrl) {
		this.mainUrl = mainUrl;
	}


	public MovieMenu(HttpServletRequest request) {
	
		this.request=request;
		
		
		menu.put("top", new ArrayList<Hobby>());
		menu.put("info", new ArrayList<Hobby>());
		menu.put("reserve", new ArrayList<Hobby>());
		
		menu.get("top").add(new Hobby("info", "영화소개"));
		menu.get("top").add(new Hobby("reserve", "영화예약"));
		
		menu.get("info").add(new Hobby("romance", "로맨스")); //앞에 있는건 jsp페이지가 되고, 뒤에있는건 메뉴구성.
		menu.get("info").add(new Hobby("action", "액션"));
		
		menu.get("reserve").add(new Hobby("nowReserveForm", "현재상영작"));
		menu.get("reserve").add(new Hobby("nextReserveForm", "다음달상영작"));
		
		sub = menu.get("top").get(0).getValue();
		if(request.getParameter("sub")!=null){
			sub=request.getParameter("sub");
		}
		
		main = menu.get(sub).get(0).getValue();
		if(request.getParameter("main")!=null){
			main=request.getParameter("main");
		}
		
		
		substr=getStr("top",sub);
		mainStr=getStr(sub,main);
		mainUrl="view/"+sub+"/"+main+".jsp";
		
		
	}
	
	
	public String getSub() {
		return sub;
	}


	public void setSub(String sub) {
		this.sub = sub;
	}


	public String getMain() {
		return main;
	}


	public void setMain(String main) {
		this.main = main;
	}


	String getStr(String arr, String sch){
		String res="";
		for(Hobby ho : menu.get(arr)){
			if(ho.getValue().equals(sch)){
				res = ho.getStr();
			}
		}
		return res;
	}
	

	
	
	
	public HashMap<String, ArrayList<Hobby>> getMenu() {
		return menu;
	}
	public void setMenu(HashMap<String, ArrayList<Hobby>> menu) {
		this.menu = menu;
	}
	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	public String getSubstr() {
		return substr;
	}
	public void setSubstr(String substr) {
		this.substr = substr;
	}
	public String getMainStr() {
		return mainStr;
	}
	public void setMainStr(String mainStr) {
		this.mainStr = mainStr;
	} 
	
	}
	
