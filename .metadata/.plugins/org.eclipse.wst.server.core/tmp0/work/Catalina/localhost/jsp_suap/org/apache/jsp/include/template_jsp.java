/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.54
 * Generated at: 2014-07-30 12:41:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import basic.Hobby;
import java.util.HashMap;
import java.util.ArrayList;

public final class template_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	
    
	HashMap<String,ArrayList<Hobby>> menu = new HashMap();
    
		menu.put("top",new ArrayList<Hobby>());
		menu.put("info",new ArrayList<Hobby>());
		menu.put("gallery",new ArrayList<Hobby>());
		menu.put("center",new ArrayList<Hobby>());
    	
		
		menu.get("top").add(new Hobby("info","회사소개"));
    	menu.get("top").add(new Hobby("gallery","갤러리"));
    	menu.get("top").add(new Hobby("center","고객센터"));
    	
    	
    	menu.get("info").add(new Hobby("hello","인사말"));
    	menu.get("info").add(new Hobby("location","오시는길 "));
    	
    	menu.get("gallery").add(new Hobby("her","허윤미"));
    	menu.get("gallery").add(new Hobby("jun","전효성"));
    	menu.get("gallery").add(new Hobby("kate","케이트업튼"));
    	
    	menu.get("center").add(new Hobby("notice","공지사항"));
    	menu.get("center").add(new Hobby("fnq","즐겨하는질문"));
    	menu.get("center").add(new Hobby("qna","질문과 답변"));
    	
    	application.setAttribute("menu", menu);
    	
    	String sub = "info";
        
        if(request.getParameter("sub")!=null)
        	sub = request.getParameter("sub");
        
    	String main = menu.get(sub).get(0).getValue();
        
        if(request.getParameter("main")!=null)
        	main = request.getParameter("main");	
	    	
    	
    	String url = "main/"+sub+"/"+main+".jsp";
    
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<table border=\"1\" cellpadding=\"1\" cellspacing=\"1\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\" align=\"center\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc/top.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\t<td colspan=\"3\" align=\"right\">\r\n");
      out.write("\t\t\t\t");
      out.print(sub );
      out.write(" >> ");
      out.print(main );
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=\"150\" align=\"center\">\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc/menu.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("sub", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(sub ), request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<td width=\"500\" align=\"center\">\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, url , out, false);
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\" align=\"center\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc/bottom.jsp", out, false);
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
