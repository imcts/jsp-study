/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.54
 * Generated at: 2014-07-29 16:52:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.fileRegex;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.File;

public final class FileProc_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");

	File file = new File("C:\\Users\\TaeSan\\Documents\\JspSave\\jsp_sukje\\allFile");
	String fileList[] = file.list();
	ArrayList imageList = new ArrayList();
	ArrayList textList = new ArrayList();
	

	for(int i=0; i<fileList.length; i++){
		String [] arr = fileList[i].split("\\.");
		int textIndex=0,imageIndex=0;
		if(arr[1].equals("txt") 
				|| arr[1].equals("doc") 
				|| arr[1].equals("hwp") 
				|| arr[1].equals("gul")
				|| arr[1].equals("ppt") 
				|| arr[1].equals("xls")){
			new FileInputStream("C:\\Users\\TaeSan\\Documents\\JspSave\\jsp_sukje\\allFile\\"+fileList[i]);
			new FileOutputStream("C:\\Users\\TaeSan\\Documents\\JspSave\\jsp_sukje\\textFile\\"+fileList[i]);
			textList.add(textIndex, fileList[i]);
			textIndex++;
		}else{
			new FileInputStream("C:\\Users\\TaeSan\\Documents\\JspSave\\jsp_sukje\\allFile\\"+fileList[i]);
			new FileOutputStream("C:\\Users\\TaeSan\\Documents\\JspSave\\jsp_sukje\\imageFile\\"+fileList[i]);
			imageList.add(imageIndex, fileList[i]);
			imageIndex++;
		}
		
	}



      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<table border=\"1\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"center\" colspan=\"2\">파일 분류 완료</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr valing=\"top\">\r\n");
      out.write("\t\t\t\t\t<td align=\"center\">textList폴더</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
for(int i=0; i<textList.size(); i++){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">");
      out.print((String)textList.get(i) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"center\">imageList폴더</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
for(int i=0; i<imageList.size(); i++){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">");
      out.print((String)imageList.get(i) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</td>\r\n");
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