/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2023-12-11 21:53:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class doisong_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>BookHabor&nbsp;|&nbsp;Đời Sống</title>\r\n");
      out.write("\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("<style>\r\n");
      out.write("</style>\r\n");
      out.write("<link rel=\"icon\" href=\"img/logo/logo.png\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("	<div class=\"py-3 py-md-5 bg-light\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-md-12\">\r\n");
      out.write("					<h4 class=\"mb-4\">Đời Sống</h4>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-3\">\r\n");
      out.write("					<div class=\"product-card\">\r\n");
      out.write("						<div class=\"product-card-img\">\r\n");
      out.write("							<label class=\"stock bg-success\">In Stock</label> <img\r\n");
      out.write("								src=\"https://salt.tikicdn.com/cache/750x750/media/catalog/producttmp/25/4d/52/6e5a9b48c1316dc3ccc55df2c955ec24.jpg.webp\"\r\n");
      out.write("								alt=\"Laptop\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"product-card-body\">\r\n");
      out.write("							<p class=\"product-brand\">Nhà Xuất Bản Tổng hợp TP.HCM</p>\r\n");
      out.write("							<h5 class=\"product-name\">\r\n");
      out.write("								<a href=\"\"> Sách Thay Đổi Cuộc Sống Với Nhân Số Học </a>\r\n");
      out.write("							</h5>\r\n");
      out.write("							<div>\r\n");
      out.write("								<span class=\"selling-price\">166,000₫</span> <span\r\n");
      out.write("									class=\"original-price\">200,000₫</</span>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mt-2\">\r\n");
      out.write("								<a href=\"\" class=\"btn btn1\">Add To Cart</a> <a href=\"\"\r\n");
      out.write("									class=\"btn btn1\"> <i class=\"fa fa-heart\"></i>\r\n");
      out.write("								</a> <a href=\"\" class=\"btn btn1\"> View </a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-3\">\r\n");
      out.write("					<div class=\"product-card\">\r\n");
      out.write("						<div class=\"product-card-img\">\r\n");
      out.write("							<label class=\"stock bg-success\">In Stock</label> <img\r\n");
      out.write("								src=\"https://salt.tikicdn.com/cache/750x750/ts/product/f1/4a/64/dcb604fb1c221fa3b555586b42bd59ed.jpg.webp\"\r\n");
      out.write("								alt=\"Red MI Note 8\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"product-card-body\">\r\n");
      out.write("							<p class=\"product-brand\">Nhà Xuất Bản Tri Thức</p>\r\n");
      out.write("							<h5 class=\"product-name\">\r\n");
      out.write("								<a href=\"\"> Cơ Học Lượng Tử Và Thuyết Tương Đối </a>\r\n");
      out.write("							</h5>\r\n");
      out.write("							<div>\r\n");
      out.write("								<span class=\"selling-price\">215,000₫</span> <span\r\n");
      out.write("									class=\"original-price\">300,000₫</span>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mt-2\">\r\n");
      out.write("								<a href=\"\" class=\"btn btn1\">Add To Cart</a> <a href=\"\"\r\n");
      out.write("									class=\"btn btn1\"> <i class=\"fa fa-heart\"></i>\r\n");
      out.write("								</a> <a href=\"\" class=\"btn btn1\"> View </a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-3\">\r\n");
      out.write("					<div class=\"product-card\">\r\n");
      out.write("						<div class=\"product-card-img\">\r\n");
      out.write("							<label class=\"stock bg-success\">In Stock</label> <img\r\n");
      out.write("								src=\"https://salt.tikicdn.com/cache/750x750/ts/product/38/9d/61/237d4df1ffb225d9a44c6c62e601916c.jpg.webp\"\r\n");
      out.write("								alt=\"Mens Shirt\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"product-card-body\">\r\n");
      out.write("							<p class=\"product-brand\">Nhà Xuất Bản Thế Giới</p>\r\n");
      out.write("							<h5 class=\"product-name\">\r\n");
      out.write("								<a href=\"\"> Sách Minh Triết Trong Đời Sống (Tái Bản 2021)</a>\r\n");
      out.write("							</h5>\r\n");
      out.write("							<div>\r\n");
      out.write("								<span class=\"selling-price\">108,500₫</span> <span\r\n");
      out.write("									class=\"original-price\">150,000</span>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mt-2\">\r\n");
      out.write("								<a href=\"\" class=\"btn btn1\">Add To Cart</a> <a href=\"\"\r\n");
      out.write("									class=\"btn btn1\"> <i class=\"fa fa-heart\"></i>\r\n");
      out.write("								</a> <a href=\"\" class=\"btn btn1\"> View </a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-3\">\r\n");
      out.write("					<div class=\"product-card\">\r\n");
      out.write("						<div class=\"product-card-img\">\r\n");
      out.write("							<label class=\"stock bg-success\">In Stock</label> <img\r\n");
      out.write("								src=\"https://salt.tikicdn.com/cache/750x750/media/catalog/producttmp/7d/06/d8/df16d1f8bbe59bf561650c6f9ae61338.jpg.webp\"\r\n");
      out.write("								alt=\"Head Phone\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"product-card-body\">\r\n");
      out.write("							<p class=\"product-brand\">First News - Trí Việt/p>\r\n");
      out.write("							<h5 class=\"product-name\">\r\n");
      out.write("								<a href=\"\"> Trở Về Từ Cõi Sáng (Tái Bản)</a>\r\n");
      out.write("							</h5>\r\n");
      out.write("							<div>\r\n");
      out.write("								<span class=\"selling-price\">70,000₫</span> <span\r\n");
      out.write("									class=\"original-price\">120,000₫</span>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mt-2\">\r\n");
      out.write("								<a href=\"\" class=\"btn btn1\">Add To Cart</a> <a href=\"\"\r\n");
      out.write("									class=\"btn btn1\"> <i class=\"fa fa-heart\"></i>\r\n");
      out.write("								</a> <a href=\"\" class=\"btn btn1\"> View </a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"py-3 py-md-5 bg-light\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-md-12\">\r\n");
      out.write("					<h4 class=\"mb-4\"></h4>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-3\">\r\n");
      out.write("					<div class=\"product-card\">\r\n");
      out.write("						<div class=\"product-card-img\">\r\n");
      out.write("							<label class=\"stock bg-success\">In Stock</label> <img\r\n");
      out.write("								src=\"https://salt.tikicdn.com/cache/750x750/ts/product/f5/4b/93/67ecaa8a2fb7155df2c621fb93e47843.jpg.webp\"\r\n");
      out.write("								alt=\"Laptop\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"product-card-body\">\r\n");
      out.write("							<p class=\"product-brand\">Nhà Xuất Bản Hồng Đức</p>\r\n");
      out.write("							<h5 class=\"product-name\">\r\n");
      out.write("								<a href=\"\">Sách Làm Chủ Cuộc Đời (Tái Bản 2020) </a>\r\n");
      out.write("							</h5>\r\n");
      out.write("							<div>\r\n");
      out.write("								<span class=\"selling-price\">50,300₫ </span> <span\r\n");
      out.write("									class=\"original-price\">70,300₫ </span>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mt-2\">\r\n");
      out.write("								<a href=\"\" class=\"btn btn1\">Add To Cart</a> <a href=\"\"\r\n");
      out.write("									class=\"btn btn1\"> <i class=\"fa fa-heart\"></i>\r\n");
      out.write("								</a> <a href=\"\" class=\"btn btn1\"> View </a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-3\">\r\n");
      out.write("					<div class=\"product-card\">\r\n");
      out.write("						<div class=\"product-card-img\">\r\n");
      out.write("							<label class=\"stock bg-success\">In Stock</label> <img\r\n");
      out.write("								src=\"https://salt.tikicdn.com/cache/750x750/ts/product/83/e2/62/649a2a3335e07bc133cf1e8b5adc29f4.jpg.webp\"\r\n");
      out.write("								alt=\"Red MI Note 8\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"product-card-body\">\r\n");
      out.write("							<p class=\"product-brand\">Nhà Xuất Bản Dân Trí</p>\r\n");
      out.write("							<h5 class=\"product-name\">\r\n");
      out.write("								<a href=\"\">  Tâm Lý Học Hẹn Hò - Nghệ Thuật Giao Tiếp Trong Tình Yêu </a>\r\n");
      out.write("							</h5>\r\n");
      out.write("							<div>\r\n");
      out.write("								<span class=\"selling-price\">90,300₫</span> <span\r\n");
      out.write("									class=\"original-price\">110,000₫</span>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mt-2\">\r\n");
      out.write("								<a href=\"\" class=\"btn btn1\">Add To Cart</a> <a href=\"\"\r\n");
      out.write("									class=\"btn btn1\"> <i class=\"fa fa-heart\"></i>\r\n");
      out.write("								</a> <a href=\"\" class=\"btn btn1\"> View </a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-3\">\r\n");
      out.write("					<div class=\"product-card\">\r\n");
      out.write("						<div class=\"product-card-img\">\r\n");
      out.write("							<label class=\"stock bg-success\">In Stock</label> <img\r\n");
      out.write("								src=\"https://salt.tikicdn.com/cache/750x750/ts/product/0a/15/ea/4e181a1dcfd2d16840c1fe242b914ba1.png.webp\"\r\n");
      out.write("								alt=\"Mens Shirt\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"product-card-body\">\r\n");
      out.write("							<p class=\"product-brand\">Nhà Xuất Bản Thanh Niên</p>\r\n");
      out.write("							<h5 class=\"product-name\">\r\n");
      out.write("								<a href=\"\"> Tâm Lý Học Mối Quan Hệ </a>\r\n");
      out.write("							</h5>\r\n");
      out.write("							<div>\r\n");
      out.write("								<span class=\"selling-price\">70,000₫ </span> <span\r\n");
      out.write("									class=\"original-price\">100,000₫ </span>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mt-2\">\r\n");
      out.write("								<a href=\"\" class=\"btn btn1\">Add To Cart</a> <a href=\"\"\r\n");
      out.write("									class=\"btn btn1\"> <i class=\"fa fa-heart\"></i>\r\n");
      out.write("								</a> <a href=\"\" class=\"btn btn1\"> View </a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-3\">\r\n");
      out.write("					<div class=\"product-card\">\r\n");
      out.write("						<div class=\"product-card-img\">\r\n");
      out.write("							<label class=\"stock bg-success\">In Stock</label> <img\r\n");
      out.write("								src=\"https://salt.tikicdn.com/cache/750x750/ts/product/09/2b/e4/e220a9a28a35a7c6ed3336e89c09178b.jpg.webp\"\r\n");
      out.write("								alt=\"Head Phone\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"product-card-body\">\r\n");
      out.write("							<p class=\"product-brand\">Nhà Xuất Bản Thế Giới</p>\r\n");
      out.write("							<h5 class=\"product-name\">\r\n");
      out.write("								<a href=\"\"> Không Phải Sói Nhưng Cũng Đừng Là Cừu </a>\r\n");
      out.write("							</h5>\r\n");
      out.write("							<div>\r\n");
      out.write("								<span class=\"selling-price\">89.000₫</span> <span\r\n");
      out.write("									class=\"original-price\">120.000₫</span>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mt-2\">\r\n");
      out.write("								<a href=\"\" class=\"btn btn1\">Add To Cart</a> <a href=\"\"\r\n");
      out.write("									class=\"btn btn1\"> <i class=\"fa fa-heart\"></i>\r\n");
      out.write("								</a> <a href=\"\" class=\"btn btn1\"> View </a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
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
