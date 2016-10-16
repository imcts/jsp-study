package sungJuk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SungJukMap {
	HashMap menuMap; //메뉴가 담길 맵. 
	HashMap studMap; //학생이 담길 맵.
	
	public SungJukMap() {
		this.menuMap=new HashMap<>();
		this.studMap=new HashMap<>();
		input();
	}

	private void input() {
		
		this.menuMap.put("top", new ArrayList<>()); //1학년 2학년 3학년.
		this.menuMap.put("menu", new HashMap()); //1반 2반 3반. 
		
		
		((List)menuMap.get("top")).add(new Menu("1","1학년")); 
		((List)menuMap.get("top")).add(new Menu("2","2학년")); 
		((List)menuMap.get("top")).add(new Menu("3","3학년")); 
		
		
		
		((Map)menuMap.get("menu")).put("1", new ArrayList());
		((List)((Map)menuMap.get("menu")).get("1")).add(new Menu("1","1-1"));
		((List)((Map)menuMap.get("menu")).get("1")).add(new Menu("2","1-2"));
		((List)((Map)menuMap.get("menu")).get("1")).add(new Menu("3","1-3"));
		
		((Map)menuMap.get("menu")).put("2", new ArrayList());
		((List)((Map)menuMap.get("menu")).get("2")).add(new Menu("1","2-1"));
		((List)((Map)menuMap.get("menu")).get("2")).add(new Menu("2","2-2"));
		((List)((Map)menuMap.get("menu")).get("2")).add(new Menu("3","2-3"));
		
		
		((Map)menuMap.get("menu")).put("3", new ArrayList());
		((List)((Map)menuMap.get("menu")).get("3")).add(new Menu("1","3-1"));
		((List)((Map)menuMap.get("menu")).get("3")).add(new Menu("2","3-2"));
		((List)((Map)menuMap.get("menu")).get("3")).add(new Menu("3","3-3"));
		
		
		
		//----------------------------------------------------------------
		
		/* */

		studMap.put("1", new HashMap());
		((Map)studMap.get("1")).put("1", new ArrayList());
		((Map)studMap.get("1")).put("2", new ArrayList());
		((Map)studMap.get("1")).put("3", new ArrayList());
		
		
		studMap.put("2", new HashMap());
		((Map)studMap.get("2")).put("1", new ArrayList());
		((Map)studMap.get("2")).put("2", new ArrayList());
		((Map)studMap.get("2")).put("3", new ArrayList());
		
		
		studMap.put("3", new HashMap());
		((Map)studMap.get("3")).put("1", new ArrayList());
		((Map)studMap.get("3")).put("2", new ArrayList());
		((Map)studMap.get("3")).put("3", new ArrayList());
		
		
		((List)((Map)studMap.get("1")).get("1")).add(new Student("a", 1 ,"남자", 80, 70, 80, 1));
		((List)((Map)studMap.get("1")).get("1")).add(new Student("b", 1 ,"여자", 70, 60, 70, 1)); 
		((List)((Map)studMap.get("1")).get("1")).add(new Student("c", 1 ,"남자", 60, 50, 60, 1)); 
		((List)((Map)studMap.get("1")).get("1")).add(new Student("d", 1 ,"여자", 50, 40, 50, 1)); 
		((List)((Map)studMap.get("1")).get("1")).add(new Student("e", 1 ,"남자", 40, 30, 60, 1));
		
		
		
		((List)((Map)studMap.get("1")).get("2")).add(new Student("f", 2 ,"남자", 70, 40, 50, 1)); 
		((List)((Map)studMap.get("1")).get("2")).add(new Student("g", 2 ,"여자", 60, 10, 60, 1)); 
		((List)((Map)studMap.get("1")).get("2")).add(new Student("h", 2 ,"남자", 50, 90, 70, 1)); 
		((List)((Map)studMap.get("1")).get("2")).add(new Student("i", 2 ,"여자", 50, 70, 80, 1)); 
		((List)((Map)studMap.get("1")).get("2")).add(new Student("j", 2 ,"남자", 70, 60, 90, 1));
		
	
		((List)((Map)studMap.get("1")).get("3")).add(new Student("k", 3 ,"남자", 60, 50, 60, 1)); 
		((List)((Map)studMap.get("1")).get("3")).add(new Student("l", 3 ,"여자", 50, 40, 70, 1)); 
		((List)((Map)studMap.get("1")).get("3")).add(new Student("m", 3 ,"남자", 40, 30, 80, 1)); 
		((List)((Map)studMap.get("1")).get("3")).add(new Student("n", 3 ,"여자", 30, 20, 90, 1)); 
		((List)((Map)studMap.get("1")).get("3")).add(new Student("o", 3 ,"남자", 50, 10, 100, 1));
		
		
		((List)((Map)studMap.get("2")).get("1")).add(new Student("aa", 1 ,"남자", 80, 70, 80, 2)); 
		((List)((Map)studMap.get("2")).get("1")).add(new Student("bb", 1 ,"여자", 70, 60, 70, 2)); 
		((List)((Map)studMap.get("2")).get("1")).add(new Student("cc", 1 ,"남자", 60, 50, 60, 2)); 
		((List)((Map)studMap.get("2")).get("1")).add(new Student("dd", 1 ,"여자", 50, 40, 50, 2)); 
		((List)((Map)studMap.get("2")).get("1")).add(new Student("ee", 1 ,"남자", 40, 30, 60, 2));
		
		
		
		((List)((Map)studMap.get("2")).get("2")).add(new Student("ff", 2 ,"남자", 70, 40, 50, 2)); 
		((List)((Map)studMap.get("2")).get("2")).add(new Student("gg", 2 ,"여자", 60, 10, 60, 2)); 
		((List)((Map)studMap.get("2")).get("2")).add(new Student("hh", 2 ,"남자", 50, 90, 70, 2)); 
		((List)((Map)studMap.get("2")).get("2")).add(new Student("ii", 2 ,"여자", 50, 70, 80, 2)); 
		((List)((Map)studMap.get("2")).get("2")).add(new Student("jj", 2 ,"남자", 70, 60, 90, 2));
		
		
		
		((List)((Map)studMap.get("2")).get("3")).add(new Student("kk", 3 ,"남자", 60, 50, 60, 2)); 
		((List)((Map)studMap.get("2")).get("3")).add(new Student("ll", 3 ,"여자", 50, 40, 70, 2)); 
		((List)((Map)studMap.get("2")).get("3")).add(new Student("mm", 3 ,"남자", 40, 30, 80, 2)); 
		((List)((Map)studMap.get("2")).get("3")).add(new Student("nn", 3 ,"여자", 30, 20, 90, 2)); 
		((List)((Map)studMap.get("2")).get("3")).add(new Student("oo", 3 ,"남자", 50, 10, 100, 2));
		
		
		
		
		
		
		((List)((Map)studMap.get("3")).get("1")).add(new Student("aaa", 1 ,"남자", 80, 70, 80, 3)); 
		((List)((Map)studMap.get("3")).get("1")).add(new Student("bbb", 1 ,"여자", 70, 60, 70, 3)); 
		((List)((Map)studMap.get("3")).get("1")).add(new Student("ccc", 1 ,"남자", 60, 50, 60, 3)); 
		((List)((Map)studMap.get("3")).get("1")).add(new Student("ddd", 1 ,"여자", 50, 40, 50, 3)); 
		((List)((Map)studMap.get("3")).get("1")).add(new Student("eee", 1 ,"남자", 40, 30, 60, 3));
		
		
		((List)((Map)studMap.get("3")).get("2")).add(new Student("fff", 2 ,"남자", 70, 40, 50, 3)); 
		((List)((Map)studMap.get("3")).get("2")).add(new Student("ggg", 2 ,"여자", 60, 10, 60, 3)); 
		((List)((Map)studMap.get("3")).get("2")).add(new Student("hhh", 2 ,"남자", 50, 90, 70, 3)); 
		((List)((Map)studMap.get("3")).get("2")).add(new Student("iii", 2 ,"여자", 50, 70, 80, 3)); 
		((List)((Map)studMap.get("3")).get("2")).add(new Student("jjj", 2 ,"남자", 70, 60, 90, 3));
		
		

		((List)((Map)studMap.get("3")).get("3")).add(new Student("kkk", 3 ,"남자", 60, 50, 60, 3)); 
		((List)((Map)studMap.get("3")).get("3")).add(new Student("lll", 3 ,"여자", 50, 40, 70, 3)); 
		((List)((Map)studMap.get("3")).get("3")).add(new Student("mmm", 3 ,"남자", 40, 30, 80, 3)); 
		((List)((Map)studMap.get("3")).get("3")).add(new Student("nnn", 3 ,"여자", 30, 20, 90, 3)); 
		((List)((Map)studMap.get("3")).get("3")).add(new Student("ooo", 3 ,"남자", 50, 10, 100, 3));
		
		
	}

	
	
	public HashMap getMenuMap() {
		return menuMap;
	}

	public HashMap getStudMap() {
		return studMap;
	}
	
	
	
	
		
}
