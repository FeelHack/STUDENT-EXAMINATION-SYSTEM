/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.30
 * Generated at: 2020-03-10 20:18:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import com.connection.ConnectionClass;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public final class ViewQuestion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("com.connection.ConnectionClass");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

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
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write(" <!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("   \r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\r\n");
      out.write("    <!-- Optional JavaScript -->\r\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/1737af4a09.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   <style>\r\n");
      out.write("      table,th,tr,td\r\n");
      out.write("      {\r\n");
      out.write("          border:2px solid black;\r\n");
      out.write("      }\r\n");
      out.write("   </style>\r\n");
      out.write("   \r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <body style=\"background-color: beige;\">\r\n");
      out.write("    <nav id=\"navbar-example2\" class=\"navbar navbar-light bg-light\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"admin.jsp\">Student_Support</a>\r\n");
      out.write("\r\n");
      out.write("        <i class=\"fas fa-user-circle fa-8x\" style=\"text-align: center;\"></i>\r\n");
      out.write("        <ul class=\"nav nav-pills\">\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"admin.jsp\">Home</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item dropdown\">\r\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">MyProfile</a>\r\n");
      out.write("            <div class=\"dropdown-menu\">\r\n");
      out.write("              <a class=\"dropdown-item\" href=\"#one\">View Profile</a>\r\n");
      out.write("              <a class=\"dropdown-item\" href=\"#two\">Edit My Profile</a>\r\n");
      out.write("              <div role=\"separator\" class=\"dropdown-divider\"></div>\r\n");
      out.write("              <a class=\"dropdown-item\" href=\"../logout.jsp\">Signout</a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <div class=\"spinner-grow text-primary\" role=\"status\">\r\n");
      out.write("        <span class=\"sr-only\">Loading...</span>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"spinner-grow text-secondary\" role=\"status\">\r\n");
      out.write("        <span class=\"sr-only\">Loading...</span>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"spinner-grow text-success\" role=\"status\">\r\n");
      out.write("        <span class=\"sr-only\">Loading...</span>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"spinner-grow text-danger\" role=\"status\">\r\n");
      out.write("        <span class=\"sr-only\">Loading...</span>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"spinner-grow text-warning\" role=\"status\">\r\n");
      out.write("        <span class=\"sr-only\">Loading...</span>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"spinner-grow text-info\" role=\"status\">\r\n");
      out.write("        <span class=\"sr-only\">Loading...</span>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"spinner-grow text-light\" role=\"status\">\r\n");
      out.write("        <span class=\"sr-only\">Loading...</span>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"spinner-grow text-dark\" role=\"status\">\r\n");
      out.write("        <span class=\"sr-only\">Loading...</span>\r\n");
      out.write("      </div>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"alert alert-success\" role=\"alert\" style=\"text-align: center;\">\r\n");
      out.write("        <h4 class=\"alert-heading\">Well Come To Admin Page</h4>\r\n");
      out.write("        <p>Aww yeah, Fially i am confidence about myself know  i can do anythig what ever i want </p>\r\n");
      out.write("      </div> \r\n");
      out.write("         <table>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                        <th>Serial No</th>\r\n");
      out.write("                        <th>Question</th>\r\n");
      out.write("                        <th>Option1</th>\r\n");
      out.write("                        <th>Option2</th>\r\n");
      out.write("                        <th>Option3</th>\r\n");
      out.write("                        <th>Option4</th>\r\n");
      out.write("                        <th>Answer</th>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  \r\n");
      out.write("              ");
 
              
                  Connection con=ConnectionClass.createConnection();
                  PreparedStatement pst=con.prepareStatement("select *from Question");
                  ResultSet rs=pst.executeQuery();
             
                  while(rs.next())
                  {
               	   
      out.write("\r\n");
      out.write("               \t   \r\n");
      out.write("               \t          <tr>\r\n");
      out.write("               \t                  <td>");
      out.print(rs.getString("SerialNo") );
      out.write("</td>\r\n");
      out.write("               \t                  <td>");
      out.print(rs.getString("Question") );
      out.write("</td>\r\n");
      out.write("               \t                  <td>");
      out.print(rs.getString("Option1") );
      out.write("</td>\r\n");
      out.write("               \t                  <td>");
      out.print(rs.getString("Option2") );
      out.write("</td>\r\n");
      out.write("               \t                  <td>");
      out.print(rs.getString("Option3") );
      out.write("</td>\r\n");
      out.write("               \t                  <td>");
      out.print(rs.getString("Option4") );
      out.write("</td>\r\n");
      out.write("               \t                  <td>");
      out.print(rs.getString("Answer") );
      out.write("</td>\r\n");
      out.write("               \t          </tr>\r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("             ");
} 
      out.write("\r\n");
      out.write("                  \r\n");
      out.write("         </table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
