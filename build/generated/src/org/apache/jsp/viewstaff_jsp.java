package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import com.DBConnection;
import java.sql.Connection;

public final class viewstaff_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>View Staff members</h1>\n");
      out.write("        \n");
      out.write("        ");

                try {
                    DBConnection d = new DBConnection();
                    Connection c = d.getconnection();

                    Statement st = c.createStatement();
                    ResultSet rs = st.executeQuery("select * from staff_member;");
                    while(rs.next()){
            
      out.write("\n");
      out.write("            <form>\n");
      out.write("                <p>staffID</p>\n");
      out.write("                <input type=\"text\" name=\"staffid\" value=\"");
      out.print(rs.getString("staff_id"));
      out.write("\"/>\n");
      out.write("                <p>firstname</p>\n");
      out.write("                <input type=\"text\" name=\"firstname\" value=\"");
      out.print(rs.getString("first_name"));
      out.write("\"/>\n");
      out.write("                <p>lastname</p>\n");
      out.write("                <input type=\"text\" name=\"lastname\" value=\"");
      out.print(rs.getString("last_name"));
      out.write("\"/>\n");
      out.write("                <p>password</p>\n");
      out.write("                <input type=\"text\" name=\"password\" value=\"");
      out.print(rs.getString("password"));
      out.write("\"/>\n");
      out.write("            </form>\n");
      out.write("        ");
}}catch(Exception e){
                System.out.println(e);
                }
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
