package album;

import java.util.HashMap;

public class AlbumBean {
	
	String mainUrl,menukey,mainkey;
	HashMap menuMap;
	
	
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

	public HashMap getMenuMap() {
		return menuMap;
	}

	public void setMenuMap(HashMap menuMap) {
		this.menuMap = menuMap;
	}
	
}
