package basic;

import java.util.ArrayList;
import java.util.HashMap;

public class StudformList {
	
	HashMap<String,ArrayList<Hobby>> list = new HashMap<>();
	
	
	public StudformList() {
		list.put("hobby", new ArrayList());
		
		list.get("hobby").add(new Hobby("game","게임"));
		list.get("hobby").add(new Hobby("read","독서",true));
		list.get("hobby").add(new Hobby("movie","영화"));
		list.get("hobby").add(new Hobby("fish","낚시"));
		
		
		list.put("gender", new ArrayList());
		list.get("gender").add(new Hobby("m","남자"));
		list.get("gender").add(new Hobby("w","여자",true));
		list.get("gender").add(new Hobby("a","아줌마"));
		
		list.put("tel1", new ArrayList());
		list.get("tel1").add(new Hobby("010","010"));
		list.get("tel1").add(new Hobby("011","011"));
		list.get("tel1").add(new Hobby("016","016",true));
		list.get("tel1").add(new Hobby("017","017"));
		list.get("tel1").add(new Hobby("018","018"));
		list.get("tel1").add(new Hobby("019","019"));
		
		
		list.put("email2", new ArrayList());
		list.get("email2").add(new Hobby("naver.com","네이버"));
		list.get("email2").add(new Hobby("daum.net","다음"));
		list.get("email2").add(new Hobby("nate.com","네이트"));
		list.get("email2").add(new Hobby("gmail.com","지메일"));
		list.get("email2").add(new Hobby("","직접입력"));
		
	}
	
	public String get(String key,String input){
		String res="";
		
		for(Hobby hh :list.get(key)){ 
			
			String chk = hh.isChk() ? "checked='checked'" : "";
		
		res+="<input type='"+input+"' name='"+key+"' value='"+hh.getValue()+"' "+chk+">"+hh.getStr(); 
		
		} 
		
		return res;
	}
	
	public String select(String tell){
		String res="";
		
		for(Hobby hh : list.get(tell)){
			
			String chk=hh.isChk() ? "selected='selected'" : "";
			res+="<option value='"+hh.getValue()+"' "+chk+">"+hh.getStr()+"</option>";
			
		}
		
		return res;
	}
	
	public String getStr(String value, String key){
		String res="";
		for(Hobby hh : list.get(key)){
			
			if(hh.getValue().equals(value)){
				res=hh.getStr();
			}
			
		}
		
		
		return res;
	}
	
}
