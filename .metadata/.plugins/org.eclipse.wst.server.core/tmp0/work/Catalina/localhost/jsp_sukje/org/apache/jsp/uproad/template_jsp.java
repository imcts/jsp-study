/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.54
 * Generated at: 2014-08-09 19:50:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.uproad;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class template_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/tags/job.tag", Long.valueOf(1407608191247L));
    _jspx_dependants.put("/WEB-INF/tags/hobby.tag", Long.valueOf(1407613845745L));
    _jspx_dependants.put("/WEB-INF/tags/mail.tag", Long.valueOf(1407607760840L));
  }

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form action=\"templateReg.jsp\" enctype=\"multipart/form-data\" method=\"post\">\r\n");
      out.write("\t\t<table border=\"1\" align=\"center\" width=\"55%\">\r\n");
      out.write("\t\t\t<h3 align=\"center\">회원가입 양식</h3>\r\n");
      out.write("\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t\t<td width=\"18%\">이름</td>\r\n");
      out.write("\t\t\t\t<td width=\"60\"><input size=\"38\" type=\"text\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">  </td>\r\n");
      out.write("\t\t\t\t<td rowspan=\"4\" width=\"145\" align=\"center\">사진</td> \r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t\t<td>아이디</td>\r\n");
      out.write("\t\t\t\t<td width=\"60\"><input type=\"text\" size=\"38\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" ></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t\t<td>비밀번호</td>\r\n");
      out.write("\t\t\t\t<td width=\"60\"><input type=\"password\" size=\"38\" name=\"pw\" > </td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t\t<td>연락처</td>\r\n");
      out.write("\t\t\t\t<td><input size=\"38\" type=\"text\" name=\"tel\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.tel }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t\t<td>이메일</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"mail1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.mail1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">&nbsp;@");
      if (_jspx_meth_ct_005fmail_005f0(_jspx_page_context))
        return;
      out.write(" </td>\r\n");
      out.write("\t\t\t\t<td><input size=\"1\" type=\"file\" name=\"photo\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"center\">직업</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\">");
      if (_jspx_meth_ct_005fjob_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"center\">취미</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\">");
      if (_jspx_meth_ct_005fhobby_005f0(_jspx_page_context))
        return;
      out.write("</td>  \r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t\t<td>이력서</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\" ><input size=\"45\" type=\"file\" name=\"iryuk\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr align=\"center\" >\r\n");
      out.write("\t\t\t\t<td colspan=\"3\"><input type=\"submit\" value=\"회원가입\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
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

  private boolean _jspx_meth_ct_005fmail_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ct:mail
    org.apache.jsp.tag.webmail_tag _jspx_th_ct_005fmail_005f0 = (new org.apache.jsp.tag.webmail_tag());
    _jsp_instancemanager.newInstance(_jspx_th_ct_005fmail_005f0);
    _jspx_th_ct_005fmail_005f0.setJspContext(_jspx_page_context);
    // /uproad/template.jsp(35,71) name = var type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_ct_005fmail_005f0.setVar((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.mail2 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    _jspx_th_ct_005fmail_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_ct_005fmail_005f0);
    return false;
  }

  private boolean _jspx_meth_ct_005fjob_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ct:job
    org.apache.jsp.tag.webjob_tag _jspx_th_ct_005fjob_005f0 = (new org.apache.jsp.tag.webjob_tag());
    _jsp_instancemanager.newInstance(_jspx_th_ct_005fjob_005f0);
    _jspx_th_ct_005fjob_005f0.setJspContext(_jspx_page_context);
    // /uproad/template.jsp(40,20) name = var type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_ct_005fjob_005f0.setVar((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.job }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    _jspx_th_ct_005fjob_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_ct_005fjob_005f0);
    return false;
  }

  private boolean _jspx_meth_ct_005fhobby_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ct:hobby
    org.apache.jsp.tag.webhobby_tag _jspx_th_ct_005fhobby_005f0 = (new org.apache.jsp.tag.webhobby_tag());
    _jsp_instancemanager.newInstance(_jspx_th_ct_005fhobby_005f0);
    _jspx_th_ct_005fhobby_005f0.setJspContext(_jspx_page_context);
    // /uproad/template.jsp(44,20) name = var type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_ct_005fhobby_005f0.setVar((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.hobby }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    _jspx_th_ct_005fhobby_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_ct_005fhobby_005f0);
    return false;
  }
}