/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.53
 * Generated at: 2022-07-01 14:24:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Client;

public final class Connexion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1656680582897L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1656685006090L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("model.Client");
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link href=\"CSS/Style.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/common_styles.css\">\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<header>\r\n");
      out.write("<a href=\"Accueil.jsp\" class=\"d-flex justify-content-center\"><img src=\"https://zupimages.net/up/22/26/nfnq.jpg\" height=\"200\"></a>\r\n");
      out.write("<nav class=\"navbar-dark bg-primary \">\r\n");
      out.write("      <ul class=\"nav justify-content-around\">\r\n");
      out.write("        <li class=\"nav-item\"> <a class=\"nav-link\" href=\"Accueil.jsp\">Accueil</a></li>\r\n");
      out.write("        <li class=\"nav-item\"> <a class=\"nav-link\" href=\"Menu\">Menu</a> </li>\r\n");
      out.write("        ");
 
       	Client c = (Client)session.getAttribute("client");
       	if (c == null){
       		out.print("<li class='nav-item'> <a class='nav-link' href='Connexion.jsp'>Connexion/Inscription</a> </li>");
       	} else {
       		out.print("<li class='nav-item'> <a class='nav-link' href='ServletAccesCommande'>Commande</a> </li>");
       		out.print("<li class='nav-item'> <a class='nav-link' href='ServletDeconnexion'>Deconnexion</a> </li>");
       	}
       
       	
      out.write("\r\n");
      out.write("      </ul>\r\n");
      out.write("</nav>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  <h2>Connexion/Inscription</h2>\r\n");
      out.write("  \r\n");
      out.write("  <hr>\r\n");
      out.write("  \r\n");
      out.write("  <h3>Déjà client ? Connectez-vous:</h3>\r\n");
      out.write("\t<form action = \"ServletConnexion\">\r\n");
      out.write("\t\t<label for=\"identifiant\">Identifiant</label>\r\n");
      out.write("\t\t<input name = \"identifiant\" type = \"number\" placeholder=\"00000000\" required/><br><br>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<label for=\"mdp\">Mot de passe</label>\r\n");
      out.write("\t\t<input name = \"mdp\" type = \"password\" required/><br><br>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<input type = \"submit\" value =\"Se connecter\" class=\"btn btn-primary\"/>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t\r\n");
      out.write("\t<h3>Première visite ? Inscrivez-vous:</h3>\r\n");
      out.write("\t<form action = \"ServletInscription\">\r\n");
      out.write("\t\t<label for=\"nom\">Nom</label>\r\n");
      out.write("\t\t<input name = \"nom\" type = \"text\" placeholder=\"Votre nom\" required/><br><br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<label for=\"prenom\">Prenom</label>\r\n");
      out.write("\t\t<input name = \"prenom\" type = \"text\" placeholder=\"Votre prenom\" required/><br><br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<label for=\"adresse\">Adresse</label>\r\n");
      out.write("\t\t<input name = \"adresse\" type = \"text\" placeholder=\"Votre adresse\" required/><br><br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<label for=\"mdp\">Mot de passe</label>\r\n");
      out.write("\t\t<input name = \"mdp\" type = \"password\" required/><br><br>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<input type = \"submit\" value =\"S'inscrire\" class=\"btn btn-primary\"/>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<footer class=\"text-center text-white\" style=\"background-color: #f1f1f1;\">\r\n");
      out.write("  <!-- Grid container -->\r\n");
      out.write("  <div class=\"container pt-4\">\r\n");
      out.write("    <!-- Section: Social media -->\r\n");
      out.write("    <section class=\"mb-4\">\r\n");
      out.write("      <!-- Facebook -->\r\n");
      out.write("      <a\r\n");
      out.write("        class=\"btn btn-link btn-floating btn-lg text-dark m-1\"\r\n");
      out.write("        href=\"#!\"\r\n");
      out.write("        role=\"button\"\r\n");
      out.write("        data-mdb-ripple-color=\"dark\"\r\n");
      out.write("        ><i class=\"fab fa-facebook-f\"></i\r\n");
      out.write("      ></a>\r\n");
      out.write("\r\n");
      out.write("      <!-- Twitter -->\r\n");
      out.write("      <a\r\n");
      out.write("        class=\"btn btn-link btn-floating btn-lg text-dark m-1\"\r\n");
      out.write("        href=\"#!\"\r\n");
      out.write("        role=\"button\"\r\n");
      out.write("        data-mdb-ripple-color=\"dark\"\r\n");
      out.write("        ><i class=\"fab fa-twitter\"></i\r\n");
      out.write("      ></a>\r\n");
      out.write("\r\n");
      out.write("      <!-- Google -->\r\n");
      out.write("      <a\r\n");
      out.write("        class=\"btn btn-link btn-floating btn-lg text-dark m-1\"\r\n");
      out.write("        href=\"#!\"\r\n");
      out.write("        role=\"button\"\r\n");
      out.write("        data-mdb-ripple-color=\"dark\"\r\n");
      out.write("        ><i class=\"fab fa-google\"></i\r\n");
      out.write("      ></a>\r\n");
      out.write("\r\n");
      out.write("      <!-- Instagram -->\r\n");
      out.write("      <a\r\n");
      out.write("        class=\"btn btn-link btn-floating btn-lg text-dark m-1\"\r\n");
      out.write("        href=\"#!\"\r\n");
      out.write("        role=\"button\"\r\n");
      out.write("        data-mdb-ripple-color=\"dark\"\r\n");
      out.write("        ><i class=\"fab fa-instagram\"></i\r\n");
      out.write("      ></a>\r\n");
      out.write("\r\n");
      out.write("      <!-- Linkedin -->\r\n");
      out.write("      <a\r\n");
      out.write("        class=\"btn btn-link btn-floating btn-lg text-dark m-1\"\r\n");
      out.write("        href=\"#!\"\r\n");
      out.write("        role=\"button\"\r\n");
      out.write("        data-mdb-ripple-color=\"dark\"\r\n");
      out.write("        ><i class=\"fab fa-linkedin\"></i\r\n");
      out.write("      ></a>\r\n");
      out.write("      <!-- Github -->\r\n");
      out.write("      <a\r\n");
      out.write("        class=\"btn btn-link btn-floating btn-lg text-dark m-1\"\r\n");
      out.write("        href=\"#!\"\r\n");
      out.write("        role=\"button\"\r\n");
      out.write("        data-mdb-ripple-color=\"dark\"\r\n");
      out.write("        ><i class=\"fab fa-github\"></i\r\n");
      out.write("      ></a>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- Section: Social media -->\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Grid container -->\r\n");
      out.write("\r\n");
      out.write("  <!-- Copyright -->\r\n");
      out.write("  <div class=\"text-center text-dark p-3\" style=\"background-color: rgba(0, 0, 0, 0.2);\">\r\n");
      out.write("    © 2020 Copyright:\r\n");
      out.write("    <a class=\"text-dark\" href=\"https://mdbootstrap.com/\">MDBootstrap.com</a>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Copyright -->\r\n");
      out.write("</footer>");
      out.write("\r\n");
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
