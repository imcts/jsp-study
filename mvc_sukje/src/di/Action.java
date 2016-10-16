package di;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	public ActionResult execute(HttpServletRequest request,HttpServletResponse response)throws IOException;
	//ActionResult를 리턴하는 execute메소드 선언, 변수로 리퀘스트와 리스폰스를 받는다. 
}
