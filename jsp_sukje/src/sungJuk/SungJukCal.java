package sungJuk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class SungJukCal {
	Student [] st;
	
		
	public ArrayList banBunho(){
		ArrayList arr = new ArrayList();
		for(int ban=1, i=0; i<st.length; i++){
			for(int j=0; j<st.length; j++){
				if(st[j].getBan()==ban){
					arr.add(st[j]);
					ban++;
				}
			}
		}
		
		
		return arr;
	}
	
	
	
	
	
	
	
	public void genRank(String gen){
		for(int i=0; i<st.length; i++){
			if(st[i].getGen().equals(gen)){
				st[i].setRank(1); //남자의 랭크값을 초기화. 
			}
		}
		
		for(int  i=0; i<st.length; i++){
			for(int j=0; j<st.length; j++){
				if(st[j].getGen().equals(gen) && st[i].getAvg() < st[j].getAvg()){
					st[i].setRank(st[i].getRank()+1);
				}
			}
		}
	}
	
	public ArrayList GenSungJuk(){
		ArrayList arr = new ArrayList();
		//성별로 등수를 다시 설정. 
		genRank("남자");
		
		
		for(int r=1,i=0; i<st.length; i++){
			for(int  j=0; j<st.length; j++){
				if(st[j].getGen().equals("남자") && st[j].getRank()==r){
					arr.add(st[j]);
					r++;
				}
			}
		}
		
		genRank("여자");
		
		for(int r=1,i=0; i<st.length; i++){
			for(int  j=0; j<st.length; j++){
				if(st[j].getGen().equals("여자") && st[j].getRank()==r){
					arr.add(st[j]);
					r++;
				}
			}
		}
		
		
		
		return arr;
	}
	
	public ArrayList BunHoSun(){
		ArrayList arr = new ArrayList();
		for(int n=1,i=0; i<st.length; i++){
			for(int j=0; j<st.length; j++){
				if(st[j].getNum()==n){
					arr.add(st[j]);
					n++;
				}
			}
		}
		
		
		return arr;
	}
	
	public ArrayList SungSukSun(){
		ArrayList arr = new ArrayList();
		
		for(int r=1,i=0; i<st.length; i++){
			for(int j=0; j<st.length; j++){
				if(st[j].getRank()==r){
					arr.add(st[j]);
					r++;
				}
			}
		}
		
		return arr;
	}
	
	public void rank(HashMap map) {
	
		Iterator it = map.keySet().iterator();
		this.st = new Student[map.size()];
		
		int index=0;
		
		while(it.hasNext()){
			st[index]=(Student)map.get(it.next());
			index++;
		}
		
		for(int i=0; i<st.length; i++){
			for(int j=0; j<st.length; j++){
				if(st[i].getAvg()<st[j].getAvg()){
					st[i].setRank(st[i].getRank()+1);
				}
			}
		}
		
		
		
	}
	
	
	
	
	
}
