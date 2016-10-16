package di;

public class ActionForward {
	boolean reDirect = false;
	String path= null;
	
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
