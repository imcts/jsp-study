/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.54
 * Generated at: 2014-08-07 18:55:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.el;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.List;

public final class foreach_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/tags/forEach.tag", Long.valueOf(1407437745472L));
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String [] arr = {"스","트","링","입","니","다"};
	int [] brr = {1,2,3,4,5,2,3,2,3,2,1,2,3,3,3,6,7,7};
	char [] crr = {'캐','릭','터','입','니','다'};
	List drr = new ArrayList();
	drr.add("어");
	drr.add("레");
	drr.add("이");
	drr.add("리");
	drr.add("스");
	drr.add("트");
	drr.add("입");
	drr.add("니");
	drr.add("다");
	
	Set err = new LinkedHashSet();
	err.add("링");
	err.add("크");
	err.add("드");
	err.add("해");
	err.add("쉬");
	err.add("셋");
	err.add("입");
	err.add("니");
	err.add("다");
	
	
	Map frr = new LinkedHashMap();
	frr.put("해", "해");
	frr.put("쉬", "쉬");
	frr.put("맵", "맵");
	frr.put("입", "입");
	frr.put("니", "니");
	frr.put("다", "다");
	frr.put("key", "value");
	

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      if (_jspx_meth_ct_005fforEach_005f0(_jspx_page_context))
        return;
      out.write(" - 일반포문\r\n");
      out.write("\t<br>\r\n");
      out.write("\t");
      if (_jspx_meth_ct_005fforEach_005f1(_jspx_page_context))
        return;
      out.write(" - 스탭 2로 설정\r\n");
      out.write("\t<br>\r\n");
      out.write("\t");
      //  ct:forEach
      org.apache.jsp.tag.webforEach_tag _jspx_th_ct_005fforEach_005f2 = (new org.apache.jsp.tag.webforEach_tag());
      _jsp_instancemanager.newInstance(_jspx_th_ct_005fforEach_005f2);
      _jspx_th_ct_005fforEach_005f2.setJspContext(_jspx_page_context);
      // /el/foreach.jsp(56,1) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_ct_005fforEach_005f2.setItems(arr );
      _jspx_th_ct_005fforEach_005f2.doTag();
      _jsp_instancemanager.destroyInstance(_jspx_th_ct_005fforEach_005f2);
      out.write(" - 스트링 배열 입력시.\r\n");
      out.write("\t<br>\r\n");
      out.write("\t");
      //  ct:forEach
      org.apache.jsp.tag.webforEach_tag _jspx_th_ct_005fforEach_005f3 = (new org.apache.jsp.tag.webforEach_tag());
      _jsp_instancemanager.newInstance(_jspx_th_ct_005fforEach_005f3);
      _jspx_th_ct_005fforEach_005f3.setJspContext(_jspx_page_context);
      // /el/foreach.jsp(58,1) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_ct_005fforEach_005f3.setItems(brr );
      _jspx_th_ct_005fforEach_005f3.doTag();
      _jsp_instancemanager.destroyInstance(_jspx_th_ct_005fforEach_005f3);
      out.write("- 인트배열 입력시.\r\n");
      out.write("\t<br>\r\n");
      out.write("\t");
      //  ct:forEach
      org.apache.jsp.tag.webforEach_tag _jspx_th_ct_005fforEach_005f4 = (new org.apache.jsp.tag.webforEach_tag());
      _jsp_instancemanager.newInstance(_jspx_th_ct_005fforEach_005f4);
      _jspx_th_ct_005fforEach_005f4.setJspContext(_jspx_page_context);
      // /el/foreach.jsp(60,1) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_ct_005fforEach_005f4.setItems(crr );
      _jspx_th_ct_005fforEach_005f4.doTag();
      _jsp_instancemanager.destroyInstance(_jspx_th_ct_005fforEach_005f4);
      out.write("- 캐릭터배열 입력시.\r\n");
      out.write("\t<br>\r\n");
      out.write("\t");
      //  ct:forEach
      org.apache.jsp.tag.webforEach_tag _jspx_th_ct_005fforEach_005f5 = (new org.apache.jsp.tag.webforEach_tag());
      _jsp_instancemanager.newInstance(_jspx_th_ct_005fforEach_005f5);
      _jspx_th_ct_005fforEach_005f5.setJspContext(_jspx_page_context);
      // /el/foreach.jsp(62,1) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_ct_005fforEach_005f5.setItems(drr );
      _jspx_th_ct_005fforEach_005f5.doTag();
      _jsp_instancemanager.destroyInstance(_jspx_th_ct_005fforEach_005f5);
      out.write("- 어레이리스트 입력시.\r\n");
      out.write("\t<br>\r\n");
      out.write("\t");
      //  ct:forEach
      org.apache.jsp.tag.webforEach_tag _jspx_th_ct_005fforEach_005f6 = (new org.apache.jsp.tag.webforEach_tag());
      _jsp_instancemanager.newInstance(_jspx_th_ct_005fforEach_005f6);
      _jspx_th_ct_005fforEach_005f6.setJspContext(_jspx_page_context);
      // /el/foreach.jsp(64,1) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_ct_005fforEach_005f6.setItems(err );
      _jspx_th_ct_005fforEach_005f6.doTag();
      _jsp_instancemanager.destroyInstance(_jspx_th_ct_005fforEach_005f6);
      out.write("- 해쉬셋 입력시.\r\n");
      out.write("\t<br>\r\n");
      out.write("\t");
      //  ct:forEach
      org.apache.jsp.tag.webforEach_tag _jspx_th_ct_005fforEach_005f7 = (new org.apache.jsp.tag.webforEach_tag());
      _jsp_instancemanager.newInstance(_jspx_th_ct_005fforEach_005f7);
      _jspx_th_ct_005fforEach_005f7.setJspContext(_jspx_page_context);
      // /el/foreach.jsp(66,1) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_ct_005fforEach_005f7.setItems(frr );
      _jspx_th_ct_005fforEach_005f7.doTag();
      _jsp_instancemanager.destroyInstance(_jspx_th_ct_005fforEach_005f7);
      out.write("- Map 입력시.\r\n");
      out.write("\t<br>\r\n");
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

  private boolean _jspx_meth_ct_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ct:forEach
    org.apache.jsp.tag.webforEach_tag _jspx_th_ct_005fforEach_005f0 = (new org.apache.jsp.tag.webforEach_tag());
    _jsp_instancemanager.newInstance(_jspx_th_ct_005fforEach_005f0);
    _jspx_th_ct_005fforEach_005f0.setJspContext(_jspx_page_context);
    // /el/foreach.jsp(52,1) name = begin type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_ct_005fforEach_005f0.setBegin((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${0 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /el/foreach.jsp(52,1) name = end type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_ct_005fforEach_005f0.setEnd((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${10 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    _jspx_th_ct_005fforEach_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_ct_005fforEach_005f0);
    return false;
  }

  private boolean _jspx_meth_ct_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ct:forEach
    org.apache.jsp.tag.webforEach_tag _jspx_th_ct_005fforEach_005f1 = (new org.apache.jsp.tag.webforEach_tag());
    _jsp_instancemanager.newInstance(_jspx_th_ct_005fforEach_005f1);
    _jspx_th_ct_005fforEach_005f1.setJspContext(_jspx_page_context);
    // /el/foreach.jsp(54,1) name = begin type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_ct_005fforEach_005f1.setBegin((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${0 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /el/foreach.jsp(54,1) name = end type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_ct_005fforEach_005f1.setEnd((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${10 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /el/foreach.jsp(54,1) name = step type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_ct_005fforEach_005f1.setStep((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${2 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    _jspx_th_ct_005fforEach_005f1.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_ct_005fforEach_005f1);
    return false;
  }
}
