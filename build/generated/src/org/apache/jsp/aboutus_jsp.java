package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <style>\n");
      out.write("            body, html {\n");
      out.write("                height: 100%;\n");
      out.write("                margin: 0;\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            * {\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bg-image {\n");
      out.write("                /* The image used */\n");
      out.write("                background-image: url(\"images/aboutus.jpg\");\n");
      out.write("\n");
      out.write("                /* Add the blur effect */\n");
      out.write("                filter: blur(8px);\n");
      out.write("                -webkit-filter: blur(8px);\n");
      out.write("\n");
      out.write("                /* Full height */\n");
      out.write("                height: 100%; \n");
      out.write("\n");
      out.write("                /* Center and scale the image nicely */\n");
      out.write("                background-position: center;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Position text in the middle of the page/image */\n");
      out.write("            .bg-text {\n");
      out.write("                background-color: rgb(0,0,0); /* Fallback color */\n");
      out.write("                background-color: rgba(0,0,0, 0.4); /* Black w/opacity/see-through */\n");
      out.write("                color: white;\n");
      out.write("                font-weight: bold;\n");
      out.write("                border: 3px solid #f1f1f1;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 55%;\n");
      out.write("                left: 50%;\n");
      out.write("                transform: translate(-50%, -50%);\n");
      out.write("                z-index: 0;\n");
      out.write("                width: 80%;\n");
      out.write("                padding: 20px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .col-container {\n");
      out.write("                display: flex;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            .col {\n");
      out.write("                flex: 1;\n");
      out.write("                padding: 16px;\n");
      out.write("            }\n");
      out.write("            #div1 {\n");
      out.write("                font-size:48px;\n");
      out.write("                transform: rotate(90deg);\n");
      out.write("            }\n");
      out.write("            #div2 {\n");
      out.write("                font-size:48px;\n");
      out.write("            }\n");
      out.write("            #div3 {\n");
      out.write("                font-size:48px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                margin: 0;\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav {\n");
      out.write("                overflow: hidden;\n");
      out.write("                background-color: #333;\n");
      out.write("                max-height: 60px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav a {\n");
      out.write("                float: left;\n");
      out.write("                display: block;\n");
      out.write("                color: #f2f2f2;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 14px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-size: 17px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav a:hover {\n");
      out.write("                background-color: #ddd;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav a.active {\n");
      out.write("                background-color: #04AA6D;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav .icon {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media screen and (max-width: 600px) {\n");
      out.write("                .topnav a:not(:first-child) {display: none;}\n");
      out.write("                .topnav a.icon {\n");
      out.write("                    float: right;\n");
      out.write("                    display: block;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media screen and (max-width: 600px) {\n");
      out.write("                .topnav.responsive {position: relative;}\n");
      out.write("                .topnav.responsive .icon {\n");
      out.write("                    position: absolute;\n");
      out.write("                    right: 0;\n");
      out.write("                    top: 0;\n");
      out.write("                }\n");
      out.write("                .topnav.responsive a {\n");
      out.write("                    float: none;\n");
      out.write("                    display: block;\n");
      out.write("                    text-align: left;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"topnav\" id=\"myTopnav\">\n");
      out.write("            <a><img src=\"./images/pngwing.com.png\"/></a>\n");
      out.write("            <a class=\"active\">Online Staff Management System</a>\n");
      out.write("            <a href=\"index.jsp\"><i class=\"fa fa-fw fa-home\"></i> Home</a> \n");
      out.write("            <a href=\"aboutus.jsp\"><i class=\"fa fa-fw fa-search\"></i> About</a>\n");
      out.write("            <button onclick=\"document.getElementById('id01').style.display = 'block'\" class=\"w3-button w3-green w3-large\" style=\"margin-top:5px; margin-left: 50%\"><i class=\"fa fa-fw fa-user\"></i>Login Here!</button>\n");
      out.write("            <a href=\"javascript:void(0);\" class=\"icon\" onclick=\"myFunction()\">\n");
      out.write("                <i class=\"fa fa-bars\"></i>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"id01\" class=\"w3-modal\">\n");
      out.write("            <div class=\"w3-modal-content w3-card-4 w3-animate-zoom\" style=\"max-width:600px\">\n");
      out.write("\n");
      out.write("                <div class=\"w3-center\"><br>\n");
      out.write("                    <span onclick=\"document.getElementById('id01').style.display = 'none'\" class=\"w3-button w3-xlarge w3-transparent w3-display-topright\" title=\"Close Modal\">×</span>\n");
      out.write("                    <img src=\"./images/icons8_person_127px.png\" alt=\"Avatar\" style=\"width:30%\" class=\"w3-circle w3-margin-top\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <form class=\"w3-container\" action=\"/action_page.php\">\n");
      out.write("                    <div class=\"w3-section\">\n");
      out.write("                        <label><b>Username</b></label>\n");
      out.write("                        <input class=\"w3-input w3-border w3-margin-bottom\" type=\"text\" placeholder=\"Enter Username\" name=\"usrname\" required>\n");
      out.write("                        <label><b>Password</b></label>\n");
      out.write("                        <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Enter Password\" name=\"psw\" required>\n");
      out.write("                        <button class=\"w3-button w3-block w3-green w3-section w3-padding\" type=\"submit\">Login</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <div class=\"w3-container w3-border-top w3-padding-16 w3-light-grey\">\n");
      out.write("                    <button onclick=\"document.getElementById('id01').style.display = 'none'\" type=\"button\" class=\"w3-button w3-red\">Cancel</button>\n");
      out.write("                    <span class=\"w3-right w3-padding w3-hide-small\">Forgot <a href=\"#\">password?</a></span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function myFunction() {\n");
      out.write("                var x = document.getElementById(\"myTopnav\");\n");
      out.write("                if (x.className === \"topnav\") {\n");
      out.write("                    x.className += \" responsive\";\n");
      out.write("                } else {\n");
      out.write("                    x.className = \"topnav\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div class=\"bg-image\"></div>\n");
      out.write("\n");
      out.write("        <div class=\"bg-text\">\n");
      out.write("            <img src=\"images/About-Us-PNG-Isolated-File.png\" alt=\"img\"/>\n");
      out.write("            <div class=\"col-container\">\n");
      out.write("                <div class=\"col\" style=\"background: transparent\">\n");
      out.write("                    <div id=\"div1\" class=\"fa\"></div>&nbsp;&nbsp;<span style=\"font-size: 35px\">What We Do?</span><br/><br/><br/>\n");
      out.write("                    <i style=\"font-size:20px\" class=\"fa\">&#xf044;</i> <font>Make you easy-to-use online filing cabinet</font><br/><br/>\n");
      out.write("                    <i style=\"font-size:20px\" class=\"fa\">&#xf044;</i> <font>allows you to securely store employee records</font><br/><br/>\n");
      out.write("                    <i style=\"font-size:20px\" class=\"fa\">&#xf044;</i> <font>All HR data is securely stored and encrypted on our servers</font><br/><br/>\n");
      out.write("                    <i style=\"font-size:20px\" class=\"fa\">&#xf044;</i> <font>Employees can access their own records, saving you time</font><br/><br/>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col\" style=\"background:transparent\">\n");
      out.write("                    <div id=\"div2\" class=\"fa\"></div>&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"font-size: 35px\">Who We Are?</span><br/><br/><br/>\n");
      out.write("                    <i style=\"font-size:20px\" class=\"fa\">&#xf044;</i> <font>This is an all-in-one HR Suite built for small, local businesses</font><br/><br/>\n");
      out.write("                    <i style=\"font-size:20px\" class=\"fa\">&#xf044;</i> <font>Founded in 2022 by SLIIT Undergraduates</font><br/><br/>\n");
      out.write("                    <i style=\"font-size:20px\" class=\"fa\">&#xf044;</i> <font>Key features include job posting management, tracking incoming candidates, and a full-scale applicant tracking system (ATS)</font><br/><br/>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col\" style=\"background:transparent\">\n");
      out.write("                    <div id=\"div3\" class=\"fa\"></div>&nbsp;&nbsp;<span style=\"font-size: 35px\">Our Services</span><br/><br/><br/>\n");
      out.write("                    <i style=\"font-size:20px\" class=\"fa\">&#xf044;</i> <font>Pre-populated sample data</font><br/><br/>\n");
      out.write("                    <i style=\"font-size:20px\" class=\"fa\">&#xf044;</i> <font>Full access to try out all features of the platform</font><br/><br/>\n");
      out.write("                    <i style=\"font-size:20px\" class=\"fa\">&#xf044;</i> <font>Login as a Controller, Manager or Employee</font><br/><br/>\n");
      out.write("                    <i style=\"font-size:20px\" class=\"fa\">&#xf044;</i> <font>Personalised screen share tour and demonstration with our client care team</font><br/><br/>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <style>\n");
      out.write("            .footer {\n");
      out.write("                position: fixed;\n");
      out.write("                left: 0;\n");
      out.write("                bottom: 0;\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: #333333;\n");
      out.write("                color: white;\n");
      out.write("                text-align: center;\n");
      out.write("                box-sizing: initial;\n");
      out.write("                font-size: 25px;\n");
      out.write("            }.fa {\n");
      out.write("                padding: 5px;\n");
      out.write("                font-size: 40px;\n");
      out.write("                width: 40px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                margin: 5px 2px;\n");
      out.write("                border-radius: 50%;\n");
      out.write("            }\n");
      out.write("            .fa:hover {\n");
      out.write("                opacity: 0.7;\n");
      out.write("            }\n");
      out.write("            .fa-facebook {\n");
      out.write("                background: #3B5998;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .fa-twitter {\n");
      out.write("                background: #55ACEE;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .fa-google {\n");
      out.write("                background: #dd4b39;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .fa-linkedin {\n");
      out.write("                background: #007bb5;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .fa-instagram {\n");
      out.write("                background: #125688;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .fa-snapchat-ghost {\n");
      out.write("                background: #fffc00;\n");
      out.write("                color: white;\n");
      out.write("                text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <a href=\"https://www.facebook.com/\" class=\"fa fa-facebook\"></a>\n");
      out.write("            <a href=\"https://www.twitter.com\" class=\"fa fa-twitter\"></a>\n");
      out.write("            <a href=\"https://www.google.com\" class=\"fa fa-google\"></a>\n");
      out.write("            <a href=\"https://www.linkedin.com\" class=\"fa fa-linkedin\"></a>\n");
      out.write("            <a href=\"https://www.instagram.com\" class=\"fa fa-instagram\"></a>\n");
      out.write("            <a href=\"https://www.snapchat.com\" class=\"fa fa-snapchat-ghost\"></a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html> \n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function hand() {\n");
      out.write("                var a;\n");
      out.write("                a = document.getElementById(\"div1\");\n");
      out.write("                a.innerHTML = \"&#xf25a;\";\n");
      out.write("                setTimeout(function () {\n");
      out.write("                    a.innerHTML = \"&#xf256;\";\n");
      out.write("                }, 500);\n");
      out.write("            }\n");
      out.write("            hand();\n");
      out.write("            setInterval(hand, 1000);\n");
      out.write("\n");
      out.write("            function openfolder() {\n");
      out.write("                var a;\n");
      out.write("                a = document.getElementById(\"div2\");\n");
      out.write("                a.innerHTML = \"&#xf114;\";\n");
      out.write("                setTimeout(function () {\n");
      out.write("                    a.innerHTML = \"&#xf115;\";\n");
      out.write("                }, 500);\n");
      out.write("            }\n");
      out.write("            openfolder();\n");
      out.write("            setInterval(openfolder, 1000);\n");
      out.write("\n");
      out.write("            function smile() {\n");
      out.write("                var a;\n");
      out.write("                a = document.getElementById(\"div3\");\n");
      out.write("                a.innerHTML = \"&#xf118;\";\n");
      out.write("                setTimeout(function () {\n");
      out.write("                    a.innerHTML = \"&#xf11a;\";\n");
      out.write("                }, 500);\n");
      out.write("            }\n");
      out.write("            smile();\n");
      out.write("            setInterval(smile, 1000);\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
