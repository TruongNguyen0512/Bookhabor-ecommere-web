/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2023-12-11 08:36:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.khachhang;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import models.KhachHang;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/khachhang/footer.jsp", Long.valueOf(1701967315376L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("models.KhachHang");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<title>Bookstore</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" >\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" ></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js\" integrity=\"sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/home.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- header -->\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Page content -->\r\n");
      out.write("	<div class=\"container mt-4\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<!-- Menu left -->\r\n");
      out.write("		\r\n");
      out.write("			<!-- End Menu left -->\r\n");
      out.write("\r\n");
      out.write("			<!-- Slider and Products -->\r\n");
      out.write("			<div class=\"product_silder col-lg-9\">\r\n");
      out.write("				<!-- Slider -->\r\n");
      out.write("				<div id=\"carouselExampleIndicators\" class=\"carousel slide mb-4\"\r\n");
      out.write("					data-bs-ride=\"true\">\r\n");
      out.write("					<div class=\"carousel-indicators\">\r\n");
      out.write("						<button type=\"button\" data-bs-target=\"#carouselExampleIndicators\"\r\n");
      out.write("							data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\"\r\n");
      out.write("							aria-label=\"Slide 1\"></button>\r\n");
      out.write("						<button type=\"button\" data-bs-target=\"#carouselExampleIndicators\"\r\n");
      out.write("							data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\r\n");
      out.write("						<button type=\"button\" data-bs-target=\"#carouselExampleIndicators\"\r\n");
      out.write("							data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"carousel-inner\">\r\n");
      out.write("						<div class=\"carousel-item active\">\r\n");
      out.write("							<img src=\"img/slider/1.png\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"carousel-item\">\r\n");
      out.write("							<img src=\"img/slider/2.png\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"carousel-item\">\r\n");
      out.write("							<img src=\"img/slider/3.png\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<button class=\"carousel-control-prev\" type=\"button\"\r\n");
      out.write("						data-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"prev\">\r\n");
      out.write("						<span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("						<span class=\"visually-hidden\">Previous</span>\r\n");
      out.write("					</button>\r\n");
      out.write("					<button class=\"carousel-control-next\" type=\"button\"\r\n");
      out.write("						data-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"next\">\r\n");
      out.write("						<span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("						<span class=\"visually-hidden\">Next</span>\r\n");
      out.write("					</button>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- End Slider -->\r\n");
      out.write("				<!-- Products -->\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"product col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("						<div class=\"card h-100\">\r\n");
      out.write("							<a href=\"khachhang/cuocdoidangsong.jsp\"><img class=\"card-img-top\" src=\"img/product/cuocdoidangsong.jpg\"\r\n");
      out.write("								alt=\"\"></a>\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h4 class=\"card-title\">\r\n");
      out.write("									<a href=\"khachhang/cuocdoidangsong.jsp\">Thiết Kế Cuộc Đời Đáng Sống</a>\r\n");
      out.write("								</h4>\r\n");
      out.write("								<h5>50.000</h5>\r\n");
      out.write("								<p class=\"card-text\">Sản phẩm thoáng mát, có độ bền tốt, giữ\r\n");
      out.write("									màu sắc tốt.</p>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"card-footer\">\r\n");
      out.write("								<small class=\"text-muted\">&#9733; &#9733; &#9733;\r\n");
      out.write("									&#9733; &#9734;</small>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"product col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("						<div class=\"card h-100\">\r\n");
      out.write("							<a href=\"khachhang/hoangtube.jsp\"><img class=\"card-img-top\" src=\"img/product/hoangtube.jpg\"\r\n");
      out.write("								alt=\"\" ></a>\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h4 class=\"card-title\">\r\n");
      out.write("									<a href=\"khachhang/hoangtube.jsp\">Hoàng Tử Bé</a>\r\n");
      out.write("								</h4>\r\n");
      out.write("								<h5>50.000</h5>\r\n");
      out.write("								<p class=\"card-text\">Sản phẩm thoáng mát, có độ bền tốt, giữ\r\n");
      out.write("									màu sắc tốt.</p>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"card-footer\">\r\n");
      out.write("								<small class=\"text-muted\">&#9733; &#9733; &#9733;\r\n");
      out.write("									&#9733; &#9734;</small>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<div class=\"product col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("						<div class=\"card h-100\">\r\n");
      out.write("							<a href=\"khachhang/luocsuthoigian.jsp\"><img class=\"card-img-top\" src=\"img/product/luocsuthoigian.jpg\"\r\n");
      out.write("								alt=\"\" ></a>\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h4 class=\"card-title\">\r\n");
      out.write("									<a href=\"khachhang/luocsuthoigian.jsp\">Lược Sử Thời Gian</a>\r\n");
      out.write("								</h4>\r\n");
      out.write("								<h5>50.000</h5>\r\n");
      out.write("								<p class=\"card-text\">Sản phẩm thoáng mát, có độ bền tốt, giữ\r\n");
      out.write("									màu sắc tốt.</p>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"card-footer\">\r\n");
      out.write("								<small class=\"text-muted\">&#9733; &#9733; &#9733;\r\n");
      out.write("									&#9733; &#9734;</small>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"product col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("						<div class=\"card h-100\">\r\n");
      out.write("							<a href=\"khachhang/daututhongminh.jsp\"><img class=\"card-img-top\" src=\"img/product/daututhongminh.jpg\"\r\n");
      out.write("								alt=\"\" ></a>\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h4 class=\"card-title\">\r\n");
      out.write("									<a href=\"khachhang/daututhongminh.jsp\">Đầu Tư Thông Minh</a>\r\n");
      out.write("								</h4>\r\n");
      out.write("								<h5>50.000</h5>\r\n");
      out.write("								<p class=\"card-text\">Sản phẩm thoáng mát, có độ bền tốt, giữ\r\n");
      out.write("									màu sắc tốt.</p>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"card-footer\">\r\n");
      out.write("								<small class=\"text-muted\">&#9733; &#9733; &#9733;\r\n");
      out.write("									&#9733; &#9734;</small>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"product col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("						<div class=\"card h-100\">\r\n");
      out.write("							<a href=\"khachhang/dongiantinhyeu.jsp\"><img class=\"card-img-top\" src=\"img/product/biquyetdongianhoatinhyeu.jpg\"\r\n");
      out.write("								alt=\"\"></a>\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("								<h4 class=\"card-title\">\r\n");
      out.write("									<a href=\"khachhang/dongiantinhyeu.jsp\">Bí Quyết Đơn Giản Hóa Tình Yêu</a>\r\n");
      out.write("								</h4>\r\n");
      out.write("								<h5>50.000</h5>\r\n");
      out.write("								<p class=\"card-text\">Sản phẩm thoáng mát, có độ bền tốt, giữ\r\n");
      out.write("									màu sắc tốt.</p>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"card-footer\">\r\n");
      out.write("								<small class=\"text-muted\">&#9733; &#9733; &#9733;\r\n");
      out.write("									&#9733; &#9734;</small>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- End Products -->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- End Slider and Products -->\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- End Page content -->\r\n");
      out.write("\r\n");
      out.write("	<!-- footer -->\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!-- Footer -->\r\n");
      out.write("	<footer class=\"py-3 my-4\">\r\n");
      out.write("		<ul class=\"nav justify-content-center border-bottom pb-3 mb-3\">\r\n");
      out.write("			<li class=\"nav-item\"><a href=\"#\"\r\n");
      out.write("				class=\"nav-link px-2 text-muted\">Trag chủ</a></li>\r\n");
      out.write("			<li class=\"nav-item\"><a href=\"#\"\r\n");
      out.write("				class=\"nav-link px-2 text-muted\">Quy định giao hàng</a></li>\r\n");
      out.write("			<li class=\"nav-item\"><a href=\"#\"\r\n");
      out.write("				class=\"nav-link px-2 text-muted\">Quy định trả hàng</a></li>\r\n");
      out.write("			<li class=\"nav-item\"><a href=\"#\"\r\n");
      out.write("				class=\"nav-link px-2 text-muted\">Liên hệ</a></li>\r\n");
      out.write("			<li class=\"nav-item\"><a href=\"#\"\r\n");
      out.write("				class=\"nav-link px-2 text-muted\">Blogs</a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("		<p class=\"text-center text-muted\">© 2023 bookHabor.vn, Inc</p>\r\n");
      out.write("	</footer>\r\n");
      out.write("<!-- End footer -->");
      out.write("\r\n");
      out.write("	\r\n");
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
