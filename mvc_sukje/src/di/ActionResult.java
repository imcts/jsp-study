package di;

public class ActionResult { 
	//결과값을 담아서 컨트롤러에게 리턴시켜줄 클래스. 이 클래스로 인하여, 
	//리다이렉트를 시킬것인지, 아니면 페이지에 뿌려줄 값을 가질 것인지를 결정시킨다.
	//만약 리다이렉트를 시킨다면, 값을 true로 변경 시켜줄 것이다. 
	boolean reDirect = false;
	String path = null;
	
	public boolean isReDirect() {
		return reDirect;
	}
	public void setReDirect(boolean reDirect) {
		this.reDirect = reDirect;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	

}
