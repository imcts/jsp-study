/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.54
 * Generated at: 2014-08-08 08:35:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.el;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sum_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/tags/sum3.tag", Long.valueOf(1407486949094L));
    _jspx_dependants.put("/WEB-INF/tags/sum.tag", Long.valueOf(1407485520649L));
    _jspx_dependants.put("/WEB-INF/tags/sum2.tag", Long.valueOf(1407486229595L));
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      //  ct:sum
      org.apache.jsp.tag.websum_tag _jspx_th_ct_005fsum_005f0 = (new org.apache.jsp.tag.websum_tag());
      _jsp_instancemanager.newInstance(_jspx_th_ct_005fsum_005f0);
      _jspx_th_ct_005fsum_005f0.setJspContext(_jspx_page_context);
      // /el/sum.jsp(12,1) name = end type = java.lang.Integer reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_ct_005fsum_005f0.setEnd(new java.lang.Integer(10));
      // /el/sum.jsp(12,1) name = st type = java.lang.Integer reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_ct_005fsum_005f0.setSt(new java.lang.Integer(1));
      _jspx_th_ct_005fsum_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_ct_005fsum_005f0, null));
      _jspx_th_ct_005fsum_005f0.doTag();
      _jsp_instancemanager.destroyInstance(_jspx_th_ct_005fsum_005f0);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<br>////////////////////////////////////////////<br>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      //  ct:sum2
      org.apache.jsp.tag.websum2_tag _jspx_th_ct_005fsum2_005f0 = (new org.apache.jsp.tag.websum2_tag());
      _jsp_instancemanager.newInstance(_jspx_th_ct_005fsum2_005f0);
      java.util.HashMap _jspx_th_ct_005fsum2_005f0_aliasMap = new java.util.HashMap();
      _jspx_th_ct_005fsum2_005f0_aliasMap.put("res", "aaa");
      _jspx_th_ct_005fsum2_005f0.setJspContext(_jspx_page_context, _jspx_th_ct_005fsum2_005f0_aliasMap);
      // /el/sum.jsp(18,1) name = end type = java.lang.Integer reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_ct_005fsum2_005f0.setEnd(new java.lang.Integer(10));
      // /el/sum.jsp(18,1) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_ct_005fsum2_005f0.setVar("aaa");
      // /el/sum.jsp(18,1) name = st type = java.lang.Integer reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_ct_005fsum2_005f0.setSt(new java.lang.Integer(1));
      _jspx_th_ct_005fsum2_005f0.doTag();
      _jsp_instancemanager.destroyInstance(_jspx_th_ct_005fsum2_005f0);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aaa }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<br>////////////////////////////////////////////<br>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      //  ct:sum3
      org.apache.jsp.tag.websum3_tag _jspx_th_ct_005fsum3_005f0 = (new org.apache.jsp.tag.websum3_tag());
      _jsp_instancemanager.newInstance(_jspx_th_ct_005fsum3_005f0);
      java.util.HashMap _jspx_th_ct_005fsum3_005f0_aliasMap = new java.util.HashMap();
      _jspx_th_ct_005fsum3_005f0_aliasMap.put("res", "bbb");
      _jspx_th_ct_005fsum3_005f0.setJspContext(_jspx_page_context, _jspx_th_ct_005fsum3_005f0_aliasMap);
      // /el/sum.jsp(24,1) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_ct_005fsum3_005f0.setVar("bbb");
      _jspx_th_ct_005fsum3_005f0.setJspBody(new Helper( 1, _jspx_page_context, _jspx_th_ct_005fsum3_005f0, null));
      _jspx_th_ct_005fsum3_005f0.doTag();
      _jsp_instancemanager.destroyInstance(_jspx_th_ct_005fsum3_005f0);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bbb }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</body> \r\n");
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

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, javax.servlet.jsp.JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public void invoke0( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("\r\n");
      out.write("\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sss }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write('\r');
      out.write('\n');
      out.write('	');
      return;
    }
    public void invoke1( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("\r\n");
      out.write("\t\t10\r\n");
      out.write("\t");
      return;
    }
    public void invoke( java.io.Writer writer )
      throws javax.servlet.jsp.JspException
    {
      javax.servlet.jsp.JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        Object _jspx_saved_JspContext = this.jspContext.getELContext().getContext(javax.servlet.jsp.JspContext.class);
        this.jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
        }
        jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,_jspx_saved_JspContext);
      }
      catch( java.lang.Throwable e ) {
        if (e instanceof javax.servlet.jsp.SkipPageException)
            throw (javax.servlet.jsp.SkipPageException) e;
        throw new javax.servlet.jsp.JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
