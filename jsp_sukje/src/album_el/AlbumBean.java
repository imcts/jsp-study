package album_el;

import java.util.*;

public class AlbumBean {
	String mainUrl,menukey,mainkey;
	Map menuMap,infoMap,centerMap,artistMap,loginMap;
	int loginchk;
	
	public int getLoginchk() {
		return loginchk;
	}

	public void setLoginchk(int loginchk) {
		this.loginchk = loginchk;
	}

	public AlbumBean() {
		this.infoMap=new HashMap();
		this.infoMap.put("hello", "저희 사이트를 방문해주셔서 감사드립니다.");
		this.infoMap.put("location", "거 뭐 알아서 찾아오슈.");

		this.centerMap=new HashMap();
		this.centerMap.put("mainstr", "공지사항입니다.");
		this.centerMap.put("qna", "자주하는 질문입니다.");
		
		this.loginMap=new HashMap();
		this.loginMap.put(0, "id : &nbsp;<input type='text' name='id'>&nbsp;&nbsp;pw :&nbsp; "
				+ "<input type='password' name='password'>&nbsp;&nbsp;&nbsp;<input type='submit' value='로그인'>");
		this.loginMap.put(1, "");
	}
	
	public void setInfoMap(Map infoMap) {
		this.infoMap = infoMap;
	}

	public void setCenterMap(Map centerMap) {
		this.centerMap = centerMap;
	}

	public void setLoginMap(Map loginMap) {
		this.loginMap = loginMap;
	}

	public Map getLoginMap() {
		return loginMap;
	}

	public Map getCenterMap() {
		return centerMap;
	}

	public String getMainUrl() {
		return mainUrl;
	}

	public String getMenukey() {
		return menukey;
	}

	public void setMenukey(String menukey) {
		this.menukey = menukey;
	}

	public String getMainkey() {
		return mainkey;
	}

	public void setMainkey(String mainkey) {
		this.mainkey = mainkey;
	}

	public void setMainUrl(String mainUrl) {
		this.mainUrl = mainUrl;
	}

	public Map getMenuMap() {
		return menuMap;
	}

	public void setMenuMap(Map menuMap) {
		this.menuMap = menuMap;
	}
	public Map getInfoMap() {
		return infoMap;
	}
	
	
	public Map getArtistMap() {
		return artistMap;
	}

	public void setArtistMap(Map artistMap) {
		this.artistMap = artistMap;
	}

}
