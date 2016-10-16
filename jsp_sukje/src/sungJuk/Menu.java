package sungJuk;

public class Menu {
	String menu,value;
	

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	
	public Menu(String menu, String value) {
		this.menu=menu;
		this.value=value;
	}
}
