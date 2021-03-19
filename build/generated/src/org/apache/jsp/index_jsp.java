package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Paquete.Personajes;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"estilos.css\" type=\"text/css\"><link>\n");
      out.write("        <script src=\"JavaScript.js\"></script>\n");
      out.write("        <title>Pagina Principal</title>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"startTime()\">\n");
      out.write("    <header>\n");
      out.write("        <h1 class=\"titulo\">Pagina Principal</h1>\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"index.jsp\">Pagina Principal</a></li>\n");
      out.write("            <li><a href=\"listar2.jsp\">Personajes</a></li>\n");
      out.write("            \n");
      out.write("                <div id=\"clockdate\">\n");
      out.write("                    <div class=\"clockdate-wrapper\">\n");
      out.write("                        <div id=\"clock\"></div>\n");
      out.write("                        <div id=\"date\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("         \n");
      out.write("        </ul>\n");
      out.write("    </header>\n");
      out.write("    \n");
      out.write("    <section>\n");
      out.write("        <svg version=\"1.1\" id=\"Ebene_1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" \n");
      out.write("   width=\"600px\" height=\"100px\" viewBox=\"0 0 600 100\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write("<![CDATA[\n");
      out.write("\n");
      out.write("  text {\n");
      out.write("    filter: url(#filter);\n");
      out.write("    fill: white;\n");
      out.write("      font-family: 'Share Tech Mono', sans-serif;\n");
      out.write("      font-size: 100px;\n");
      out.write("    -webkit-font-smoothing: antialiased;\n");
      out.write("    -moz-osx-font-smoothing: grayscale;\n");
      out.write("        }\n");
      out.write("]]>\n");
      out.write("</style>\n");
      out.write("  <defs>\n");
      out.write("\n");
      out.write("    <filter id=\"filter\">\n");
      out.write("        <feFlood flood-color=\"black\" result=\"black\" />\n");
      out.write("        <feFlood flood-color=\"red\" result=\"flood1\" />\n");
      out.write("        <feFlood flood-color=\"limegreen\" result=\"flood2\" />\n");
      out.write("      <feOffset in=\"SourceGraphic\" dx=\"3\" dy=\"0\" result=\"off1a\"/>\n");
      out.write("      <feOffset in=\"SourceGraphic\" dx=\"2\" dy=\"0\" result=\"off1b\"/>\n");
      out.write("      <feOffset in=\"SourceGraphic\" dx=\"-3\" dy=\"0\" result=\"off2a\"/>\n");
      out.write("      <feOffset in=\"SourceGraphic\" dx=\"-2\" dy=\"0\" result=\"off2b\"/>\n");
      out.write("        <feComposite in=\"flood1\" in2=\"off1a\" operator=\"in\"  result=\"comp1\" />\n");
      out.write("        <feComposite in=\"flood2\" in2=\"off2a\" operator=\"in\" result=\"comp2\" />\n");
      out.write("\n");
      out.write("        <feMerge x=\"0\" width=\"100%\" result=\"merge1\">\n");
      out.write("        <feMergeNode in = \"black\" />\n");
      out.write("        <feMergeNode in = \"comp1\" />\n");
      out.write("        <feMergeNode in = \"off1b\" />\n");
      out.write("\n");
      out.write("        <animate \n");
      out.write("          attributeName=\"y\" \n");
      out.write("            id = \"y\"\n");
      out.write("            dur =\"4s\"\n");
      out.write("            \n");
      out.write("            values = '104px; 104px; 30px; 105px; 30px; 2px; 2px; 50px; 40px; 105px; 105px; 20px; 6ßpx; 40px; 104px; 40px; 70px; 10px; 30px; 104px; 102px'\n");
      out.write("\n");
      out.write("            keyTimes = '0; 0.362; 0.368; 0.421; 0.440; 0.477; 0.518; 0.564; 0.593; 0.613; 0.644; 0.693; 0.721; 0.736; 0.772; 0.818; 0.844; 0.894; 0.925; 0.939; 1'\n");
      out.write("\n");
      out.write("            repeatCount = \"indefinite\" />\n");
      out.write(" \n");
      out.write("        <animate attributeName=\"height\" \n");
      out.write("            id = \"h\" \n");
      out.write("            dur =\"4s\"\n");
      out.write("            \n");
      out.write("            values = '10px; 0px; 10px; 30px; 50px; 0px; 10px; 0px; 0px; 0px; 10px; 50px; 40px; 0px; 0px; 0px; 40px; 30px; 10px; 0px; 50px'\n");
      out.write("\n");
      out.write("            keyTimes = '0; 0.362; 0.368; 0.421; 0.440; 0.477; 0.518; 0.564; 0.593; 0.613; 0.644; 0.693; 0.721; 0.736; 0.772; 0.818; 0.844; 0.894; 0.925; 0.939; 1'\n");
      out.write("\n");
      out.write("            repeatCount = \"indefinite\" />\n");
      out.write("        </feMerge>\n");
      out.write("      \n");
      out.write("\n");
      out.write("      <feMerge x=\"0\" width=\"100%\" y=\"60px\" height=\"65px\" result=\"merge2\">\n");
      out.write("        <feMergeNode in = \"black\" />\n");
      out.write("        <feMergeNode in = \"comp2\" />\n");
      out.write("        <feMergeNode in = \"off2b\" />\n");
      out.write("\n");
      out.write("        <animate attributeName=\"y\" \n");
      out.write("            id = \"y\"\n");
      out.write("            dur =\"4s\"\n");
      out.write("            values = '103px; 104px; 69px; 53px; 42px; 104px; 78px; 89px; 96px; 100px; 67px; 50px; 96px; 66px; 88px; 42px; 13px; 100px; 100px; 104px;' \n");
      out.write("\n");
      out.write("            keyTimes = '0; 0.055; 0.100; 0.125; 0.159; 0.182; 0.202; 0.236; 0.268; 0.326; 0.357; 0.400; 0.408; 0.461; 0.493; 0.513; 0.548; 0.577; 0.613; 1'\n");
      out.write("\n");
      out.write("            repeatCount = \"indefinite\" />\n");
      out.write(" \n");
      out.write("        <animate attributeName=\"height\" \n");
      out.write("            id = \"h\"\n");
      out.write("            dur = \"4s\"\n");
      out.write("          \n");
      out.write("          values = '0px; 0px; 0px; 16px; 16px; 12px; 12px; 0px; 0px; 5px; 10px; 22px; 33px; 11px; 0px; 0px; 10px'\n");
      out.write("\n");
      out.write("            keyTimes = '0; 0.055; 0.100; 0.125; 0.159; 0.182; 0.202; 0.236; 0.268; 0.326; 0.357; 0.400; 0.408; 0.461; 0.493; 0.513;  1'\n");
      out.write("             \n");
      out.write("            repeatCount = \"indefinite\" />\n");
      out.write("        </feMerge>\n");
      out.write("      \n");
      out.write("            <feMerge>\n");
      out.write("              <feMergeNode in=\"SourceGraphic\" />  \n");
      out.write("\n");
      out.write("              <feMergeNode in=\"merge1\" /> \n");
      out.write("            <feMergeNode in=\"merge2\" />\n");
      out.write("\n");
      out.write("              </feMerge>\n");
      out.write("            </filter>\n");
      out.write("\n");
      out.write("        </defs>\n");
      out.write("\n");
      out.write("      <g>\n");
      out.write("        <text x=\"0\" y=\"100\">Jose Joaquin</text>\n");
      out.write("        <text x=\"0\" y=\"200\">Garrido Vargas</text>\n");
      out.write("      </g>\n");
      out.write("      </svg>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("       ");
 
            // Avoid Java Code in JSP - This is only for ease of testing
            Map<String, Personajes> personaje = new HashMap<String, Personajes>();
            personaje.put("Rafael", new Personajes("Nadal", 1986, 06, 03, "Tenista", "https://estaticos.marie-claire.es/media/cache/760x570_thumb/uploads/images/article/5fa29bc15cafe812d2d168e5/nadal-cuadrada_1.jpg"));
            personaje.put("Elon", new Personajes("Musk", 1971, 06, 28, "Emprendedor", "https://thumbor.forbes.com/thumbor/fit-in/416x416/filters%3Aformat%28jpg%29/https%3A%2F%2Fspecials-images.forbesimg.com%2Fimageserve%2F5f47d4de7637290765bce495%2F0x0.jpg%3Fbackground%3D000000%26cropX1%3D1398%26cropX2%3D3908%26cropY1%3D594%26cropY2%3D3102"));
            personaje.put("Albert", new Personajes("Enstein", 1879, 03, 14, "Fisico", "https://www.fundacionaquae.org/wp-content/uploads/2014/11/AlbertEinstein.jpg"));
            personaje.put("F. Javier", new Personajes("Alvarez", 1996, 07, 02, "Cantante", "https://yt3.ggpht.com/ytc/AAUvwniriKOHq9wy8k7vWafWTVtiLUONUhP2vhz-LRHY=s900-c-k-c0x00ffffff-no-rj"));
            personaje.put("Emma", new Personajes("Watson", 1990, 04, 15, "Actriz", "https://www.tuenlinea.com/wp-content/uploads/2018/08/Conoce-a-la-chica-que-es-id%C3%A9ntica-a-Emma-Watson-1.jpg"));
           
            // put the hashmap as pageContext attribute
            application.setAttribute("map", personaje);
        
      out.write("     \n");
      out.write("            \n");
      out.write("    <footer>\n");
      out.write("        <div id=\"pie\">2021 &copy; PracticaJSP01</div>\n");
      out.write("    </footer>\n");
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
