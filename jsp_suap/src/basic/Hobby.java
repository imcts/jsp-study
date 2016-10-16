package basic;

public class Hobby {
	private String value, str;
	
	boolean chk=false;
	
	public Hobby(String string, String string2) {
		this.value=string;
		this.str=string2;
	}
	
	
	
	
	
	
	
	public Hobby(String string, String string2, boolean chk) {
		this.value=string;
		this.chk=chk;
		this.str=string2;
	}
	
	
	
	
	
	public boolean isChk() {
		return chk;
	}

	public void setChk(boolean chk) {
		this.chk = chk;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	
	
}
