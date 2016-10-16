package movie;

public class Menu {
	String key,value;
	

	public String getKey() {
		return key;
	}


	public String getValue() {
		return value;
	}


	
	public Menu(String menu, String value) {
		this.key=menu;
		this.value=value;
	}
}
