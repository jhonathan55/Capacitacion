package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href=\"ccs/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>Login!</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"col-md-5 mx-auto mt-5 ml-3\">\n");
      out.write("            <div class=\"card\">   \n");
      out.write("                <h5 class=\"card-header\">Login</h5>\n");
      out.write("                <div class=\"card-body formulary\">\n");
      out.write("                    <form action=\"Validar\" method=\"POST\" class=\"was-validated mt-5\" name=\"frmLogin\" id=\"frmLogin\">\n");
      out.write("                        <div class=\"mb-6\">\n");
      out.write("                            <label for=\"txtRut\">Rut</label>\n");
      out.write("                            <div class=\"input-group is-invalid\">\n");
      out.write("                                <input type=\"text\" class=\"form-control is-invalid\" aria-describedby=\"validatedInputGroupPrepend\" \n");
      out.write("                                       id=\"txtRut\" name=\"txtRut\"required>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"rut\" class=\"form-text\">Debes ingresar los 8 primeros digitos de tu rut</div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-2\">\n");
      out.write("                            <label for=\"txtpass\">Password</label>\n");
      out.write("                            <div class=\"input-group is-invalid\">\n");
      out.write("                                <input type=\"password\" class=\"form-control is-invalid\" aria-describedby=\"validatedInputGroupPrepend\" id=\"txtPass\" name=\"txtPass\"required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <p class=\"badge badge-pill badge-danger mt-3\">");
      out.print( request.getAttribute("res"));
      out.write("</p><br>\n");
      out.write("                        <div class=\"checkbox mb-1\">\n");
      out.write("                            <label>\n");
      out.write("                                <input type=\"checkbox\" value=\"remember-me\"> Remember me\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"registro\" class=\"mt-3\">Resgistrarse</a> <br>\n");
      out.write("\n");
      out.write("                        <button type=\"submit\" value=\"Ingresar\" name=\"btnIngresar\" id=\"btnIngresar\" class=\"btn btn-primary mt-3\">Ingresar</button>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"js/main.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- Optional JavaScript; choose one of the two! -->\n");
      out.write("\n");
      out.write("        <!-- Option 1: Bootstrap Bundle with Popper -->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <!-- Option 2: Separate Popper and Bootstrap JS -->\n");
      out.write("        <!--\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js\" integrity=\"sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js\" integrity=\"sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        -->\n");
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
