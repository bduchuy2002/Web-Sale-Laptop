package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.DanhMuc;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_step_end_begin;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_step_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_forEach_var_step_end_begin.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> \n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("   \n");
      out.write("    <link rel=\"stylesheet\" href=\"fonts/themify-icons/themify-icons.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"fonts/fontawesome-free-6.4.0-web/css/all.css\">\n");
      out.write("    <title>Gear VN Team 09</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("        nav ul li:nth-child(2) i{\n");
      out.write("            position: inherit ;\n");
      out.write("        }\n");
      out.write("        .list-products{\n");
      out.write("            justify-content: flex-start;\n");
      out.write("        }\n");
      out.write("        ul.horizontal-list {\n");
      out.write("  list-style-type: none;\n");
      out.write("  padding: 0;\n");
      out.write("  margin: 0;\n");
      out.write("  display: flex;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul.horizontal-list li {\n");
      out.write("  margin-right: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul.horizontal-list li:last-child {\n");
      out.write("  margin-right: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul.horizontal-list li a {\n");
      out.write("    background-color: #ccc;\n");
      out.write("    padding: 12px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul.horizontal-list li a:hover {\n");
      out.write("   background-color: #505050;\n");
      out.write("  text-decoration: underline;\n");
      out.write("}\n");
      out.write(".page{\n");
      out.write("    margin:24px; \n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <header>\n");
      out.write("        <img width=\"1200\" height=\"44\" src=\"https://img.tgdd.vn/imgt/f_webp,fit_outside,quality_100/https://cdn.tgdd.vn/2023/03/banner/big4-1200-44-1200x44.png\" alt=\"Free Women\">\n");
      out.write("    </header>\n");
      out.write("   <nav>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"pageServlet\"><img width=\"170px\" height=\"52px\" src=\"//theme.hstatic.net/1000026716/1000440777/14/logo.svg?v=35511\" alt=\"gearvn\"></a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li>\n");
      out.write("                        <form action=\"searchServlet\" method=\"post\">\n");
      out.write("                        <input name=\"txt\"  type=\"text\" placeholder=\"Nhập mã hoặc tên sản phẩm\"> \n");
      out.write("                        <button type=\"submit\">\n");
      out.write("                            <i class=\"ti-search\"></i>\n");
      out.write("                        </button>\n");
      out.write("                    </form>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("\n");
      out.write("                            <i class=\"ti-user\"></i>\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                         \n");
      out.write("                            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            \n");
      out.write("                        </li>\n");
      out.write("                    <li>\n");
      out.write("                        <i class=\"ti-stats-down\"></i> \n");
      out.write("                        <a href=\"\">KHUYẾN MÃI</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <i class=\"ti-shopping-cart\"></i>\n");
      out.write("                        <a href=\"cart.jsp\">GIỎ HÀNG</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    <!-- ----------------------Menu bar----------------- -->\n");
      out.write("    <section class=\"menu-bar\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"menu-bar-content\">\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"first-none\">\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            <i class=\"fa-solid fa-phone-volume\"></i>\n");
      out.write("                            Tổng đài \n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            <i class=\"fa-brands fa-youtube\"></i>\n");
      out.write("                            Videos\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            <i class=\"fa-regular fa-newspaper\"></i>\n");
      out.write("                            Tin công nghệ \n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            <i class=\"fa-brands fa-wpforms\"></i>\n");
      out.write("                            Tuyển dụng \n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            <i class=\"fa-solid fa-map-location-dot\"></i>\n");
      out.write("                            Hệ thống showroom\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!------------------------ Multi Menu ----------------------->\n");
      out.write("    <div class = \"multi-menu\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"multi-menu-content\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><i class=\"fa-solid fa-list\"></i>Danh mục sản phẩm</li>\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                   \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- --------------------------Slider show ---------------------------->\n");
      out.write("    <section class=\"slider\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"slider-content\">\n");
      out.write("                <div class=\"slider-content-left\">\n");
      out.write("                    <div class=\"slider-content-left-top-container\">\n");
      out.write("                        <div class=\"slider-content-left-top\">\n");
      out.write("                            <a href=\"\">\n");
      out.write("                            <img src=\"img/slideshow_1.jpg\" alt=\"\">\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"\">\n");
      out.write("                                <img src=\"img/slideshow_2.jpg\" alt=\"\">\n");
      out.write("                                </a>\n");
      out.write("                            <a href=\"\">\n");
      out.write("                                <img src=\"img/slideshow_3.jpg\" alt=\"\">\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"\">\n");
      out.write("                                <img src=\"img/slideshow_4.jpg\" alt=\"\">\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"\">\n");
      out.write("                                <img src=\"img/slideshow_5.jpg\" alt=\"\">\n");
      out.write("                                </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"slider-content-left-top-arrow\">\n");
      out.write("                            <i class=\"fa-solid fa-chevron-left\"></i>\n");
      out.write("                            <i class=\"fa-solid fa-chevron-right\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"slider-content-left-bottom\">\n");
      out.write("                        <li class=\"active\">Thông tin 1</li>\n");
      out.write("                        <li>Thông tin 2</li>\n");
      out.write("                        <li>Thông tin 3</li>\n");
      out.write("                        <li>Thông tin 4</li>\n");
      out.write("                        <li>Thông tin 5</li>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"slider-content-left-bottom-img\">\n");
      out.write("                        <li><a href=\"\"><img src=\"img/solid1.jpg\" alt=\"\"></a></li>\n");
      out.write("                        <li><a href=\"\"><img src=\"img/solid3.jpg\" alt=\"\"></a></li>\n");
      out.write("                        <!-- <li><a href=\"\"><img src=\"img/solid2.jpg\" alt=\"\"></a></li> -->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"slider-content-right\">\n");
      out.write("                    <li><a href=\"\"><img src=\"img/solid2.jpg\" alt=\"\"></a></li>\n");
      out.write("                    <li><a href=\"\"><img src=\"img/solid4.jpg\" alt=\"\"></a></li>\n");
      out.write("                    <li><a href=\"\"><img src=\"img/solid5.jpg\" alt=\"\"></a></li>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- -----------------Banner ------------------------ -->\n");
      out.write("    <div class=\"banner\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("           <div class=\"banner-content\">\n");
      out.write("            <ul>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        <img src=\"img/xxxbanner1.jpg\" alt=\"\">\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        <img src=\"img/xxxbanner2.jpg\" alt=\"\">\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        <img src=\"img/xxxbanner3.jpg\" alt=\"\">\n");
      out.write("                    </a>\n");
      out.write("                </li\n");
      out.write("                ><li>\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        <img src=\"img/xxxbanner4.jpg\" alt=\"\">\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("           </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- ----------------- Slider Product------------------>\n");
      out.write("<!--    <div class=\"slider-product\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"heading-product\">\n");
      out.write("                <h2>\n");
      out.write("                    LAPTOP\n");
      out.write("                </h2>\n");
      out.write("                <a href=\"\">Xem tất cả <i class=\"fa-solid fa-chevron-right\"></i></a>\n");
      out.write("            </div>\n");
      out.write("       </div>\n");
      out.write("    </div>-->\n");
      out.write("    <div class=\"slider-product\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"heading-product\">\n");
      out.write("                <h2>\n");
      out.write("                    LAPTOP \n");
      out.write("                </h2>\n");
      out.write("                <a href=\"\">Xem tất cả <i class=\"fa-solid fa-chevron-right\"></i></a>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"list-products\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<!--                <li>\n");
      out.write("                    <div class=\"product-item\">\n");
      out.write("                        <div class=\"product-top\">\n");
      out.write("                            <a href=\"\" class=\"product-thumb\">\n");
      out.write("                                <img src=\"img/product_2.jpg\" alt=\"\">\n");
      out.write("                            </a>\n");
      out.write("                             Mua ngay \n");
      out.write("                            <a href=\"\" class=\"buy-btn\">Đặt hàng ngay!</a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-info\">\n");
      out.write("                            <h4 href=\"\" class=\"product-name\">Laptop gaming Gigabyte G5 GD 51VN123SO</h4>\n");
      out.write("                            <div class=\"product-price\">\n");
      out.write("                                <h3 href=\"\">19,490,000₫</h3>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"product-item\">\n");
      out.write("                        <div class=\"product-top\">\n");
      out.write("                            <a href=\"\" class=\"product-thumb\">\n");
      out.write("                                <img src=\"img/product_2.jpg\" alt=\"\">\n");
      out.write("                            </a>\n");
      out.write("                             Mua ngay \n");
      out.write("                            <a href=\"\" class=\"buy-btn\">Đặt hàng ngay!</a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-info\">\n");
      out.write("                            <h4 href=\"\" class=\"product-name\">Laptop gaming Gigabyte G5 GD 51VN123SO</h4>\n");
      out.write("                            <div class=\"product-price\">\n");
      out.write("                                <h3 href=\"\">19,490,000₫</h3>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"product-item\">\n");
      out.write("                        <div class=\"product-top\">\n");
      out.write("                            <a href=\"\" class=\"product-thumb\">\n");
      out.write("                                <img src=\"img/product_2.jpg\" alt=\"\">\n");
      out.write("                            </a>\n");
      out.write("                             Mua ngay \n");
      out.write("                            <a href=\"\" class=\"buy-btn\">Đặt hàng ngay!</a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-info\">\n");
      out.write("                            <h4 href=\"\" class=\"product-name\">Laptop gaming Gigabyte G5 GD 51VN123SO</h4>\n");
      out.write("                            <div class=\"product-price\">\n");
      out.write("                                <h3 href=\"\">19,490,000₫</h3>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"product-item\">\n");
      out.write("                        <div class=\"product-top\">\n");
      out.write("                            <a href=\"\" class=\"product-thumb\">\n");
      out.write("                                <img src=\"img/product_2.jpg\" alt=\"\">\n");
      out.write("                            </a>\n");
      out.write("                             Mua ngay \n");
      out.write("                            <a href=\"\" class=\"buy-btn\">Đặt hàng ngay!</a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-info\">\n");
      out.write("                            <h4 href=\"\" class=\"product-name\">Laptop gaming Gigabyte G5 GD 51VN123SO</h4>\n");
      out.write("                            <div class=\"product-price\">\n");
      out.write("                                <h3 href=\"\">19,490,000₫</h3>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"product-item\">\n");
      out.write("                        <div class=\"product-top\">\n");
      out.write("                            <a href=\"\" class=\"product-thumb\">\n");
      out.write("                                <img src=\"img/product_2.jpg\" alt=\"\">\n");
      out.write("                            </a>\n");
      out.write("                             Mua ngay \n");
      out.write("                            <a href=\"\" class=\"buy-btn\">Đặt hàng ngay!</a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-info\">\n");
      out.write("                            <h4 href=\"\" class=\"product-name\">Laptop gaming Gigabyte G5 GD 51VN123SO</h4>\n");
      out.write("                            <div class=\"product-price\">\n");
      out.write("                                <h3 href=\"\">19,490,000₫</h3>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"product-item\">\n");
      out.write("                        <div class=\"product-top\">\n");
      out.write("                            <a href=\"\" class=\"product-thumb\">\n");
      out.write("                                <img src=\"img/product_2.jpg\" alt=\"\">\n");
      out.write("                            </a>\n");
      out.write("                             Mua ngay \n");
      out.write("                            <a href=\"\" class=\"buy-btn\">Đặt hàng ngay!</a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-info\">\n");
      out.write("                            <h4 href=\"\" class=\"product-name\">Laptop gaming Gigabyte G5 GD 51VN123SO</h4>\n");
      out.write("                            <div class=\"product-price\">\n");
      out.write("                                <h3 href=\"\">19,490,000₫</h3>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"product-item\">\n");
      out.write("                        <div class=\"product-top\">\n");
      out.write("                            <a href=\"\" class=\"product-thumb\">\n");
      out.write("                                <img src=\"img/product_2.jpg\" alt=\"\">\n");
      out.write("                            </a>\n");
      out.write("                             Mua ngay \n");
      out.write("                            <a href=\"\" class=\"buy-btn\">Đặt hàng ngay!</a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-info\">\n");
      out.write("                            <h4 href=\"\" class=\"product-name\">Laptop gaming Gigabyte G5 GD 51VN123SO</h4>\n");
      out.write("                            <div class=\"product-price\">\n");
      out.write("                                <h3 href=\"\">19,490,000₫</h3>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>-->\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"page\">\n");
      out.write("        <ul class=\"horizontal-list\" style=\"margin-left:450px;\">\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            \n");
      out.write("       </ul>\n");
      out.write("    </div>\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <div class=\"col-1\">\n");
      out.write("            <h3>CÔNG TY TNHH THƯƠNG MẠI GEARVN</h3><br>\n");
      out.write("            <h3>EMAIL: CSKH@GEARVN.COM</h3><br>\n");
      out.write("            <b>HỆ THỐNG TỔNG ĐÀI MIỄN PHÍ:</b>\n");
      out.write("            <p class=\"f-listtel__content\">\n");
      out.write("                <i class=\"fa-solid fa-phone\"></i> <span>Gọi mua:</span> <a href=\"tel:18001060\">1800.1060</a> (8:30 - 20:00)\n");
      out.write("            </p>\n");
      out.write("            <p class=\"f-listtel__content\">\n");
      out.write("                <i class=\"fa-solid fa-phone\"></i> <span>Khiếu nại:</span> <a href=\"tel:18001060\">1800.1062</a> (8:30 - 20:00)\n");
      out.write("            </p>\n");
      out.write("            <p class=\"f-listtel__content\">\n");
      out.write("                <i class=\"fa-solid fa-phone\"></i> <span>Bảo hành:</span> <a href=\"tel:18001060\">1800.1064</a> (8:00 - 20:00)\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-2\">\n");
      out.write("            <h3>HỆ THỐNG CỬA HÀNG:</h3>\n");
      out.write("            <p>\n");
      out.write("                <b>Showroom HN</b> \"(Làm việc từ 08h00 - 20h00)\" <br>\n");
      out.write("                <i class=\"fa-solid fa-map-location-dot\"></i> Địa chỉ 1: 162 - 164 Thái Hà, Phường Trung Liệt, Quận Đống Đa, Hà Nội <br>\n");
      out.write("                <i class=\"fa-solid fa-map-location-dot\"></i> Địa chỉ 2: 460 Minh Khai, Phường Vĩnh Tuy, Quận Hai Bà Trưng, Hà Nội <br>\n");
      out.write("                <b>Showrom HCM</b> \"(Làm việc từ 08h00 - 20h00)\" <br>\n");
      out.write("                <i class=\"fa-solid fa-map-location-dot\"></i> Địa chỉ 1: 78-80-82 Hoàng Hoa Thám, Phường 12, Quận Tân Bình. <br>\n");
      out.write("                <i class=\"fa-solid fa-map-location-dot\"></i> Địa chỉ 2: 905 Kha Vạn Cân, Phường Linh Tây, Thành phố Thủ Đức. <br>\n");
      out.write("                <i class=\"fa-solid fa-map-location-dot\"></i> Địa chỉ 3: 1081 - 1083 Trần Hưng Đạo, Phường 5, Quận 5. <br>\n");
      out.write("                <i class=\"fa-solid fa-map-location-dot\"></i> Địa chỉ 4: 415 An Dương Vương, Phường 10, Quận 6. <br>\n");
      out.write("            </p>\n");
      out.write("            <h3>TRUNG TÂM BẢO HÀNH:</h3>\n");
      out.write("            <p><i class=\"fa-solid fa-map-location-dot\"></i> Địa chỉ : 436A/71 đường 3/2, Phường 12, Quận 10, Hồ Chí Minh.</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-3\">\n");
      out.write("            \n");
      out.write("            <p>\n");
      out.write("                \n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <footer class=\"footer-copyright\">\n");
      out.write("        <div class=\"copyright\">\n");
      out.write("            <section>\n");
      out.write("                <p>\n");
      out.write("                    © 2018. Công ty cổ phần GearVN. GPDKKD: 0303217354 do sở KH &amp; ĐT TP.HCM cấp ngày 02/01/2007. GPMXH: 238/GP-BTTTT do Bộ Thông Tin và Truyền Thông cấp ngày 04/06/2020.<br>\n");
      out.write("                    Địa chỉ: 128 Trần Quang Khải, P. Tân Định, Q.1, TP.Hồ Chí Minh. Chịu trách nhiệm nội dung: Team 09. <a rel=\"nofollow\" href=\"/thoa-thuan-su-dung-trang-mxh\">Xem chính sách sử dụng</a>\n");
      out.write("                </p>\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <script language=\"JavaScript\" type=\"text/javascript\" src=\"main.js\"></script>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user !=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <a href=\"\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.fname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(' ');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.lname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user ==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <a href=\"signin.jsp\">ĐĂNG NHẬP</a>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user !=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <i class=\"fa-solid fa-right-from-bracket\"></i>\n");
        out.write("                                <a href=\"logout.jsp\">ĐĂNG XUẤT</a>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user ==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <img width=\"20px\" height=\"20px\" src=\"//theme.hstatic.net/1000026716/1000440777/14/ak1.png?v=35511\">\n");
        out.write("                                <a href=\"signup.jsp\">ĐĂNG KÍ</a>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.isAdmin ==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li>\n");
        out.write("                                <a href=\"thongke\">\n");
        out.write("                                    <i class=\"search-icon ti-bar-chart-alt\"></i>\n");
        out.write("\n");
        out.write("                                    Thống kê\n");
        out.write("                                </a>\n");
        out.write("                            </li>\n");
        out.write("                            <li>\n");
        out.write("                                <a href=\"admin\">\n");
        out.write("                                    <i class=\"fa-solid fa-briefcase\"></i>\n");
        out.write("\n");
        out.write("                                    Manager\n");
        out.write("                                </a>\n");
        out.write("                            </li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listD}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                          <li><a href=\"danhmuc?ma_danh_muc=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.ma_danh_muc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"fa-solid fa-laptop\"></i>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ o.ten_danh_muc }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a><i class=\"fa-solid fa-caret-down\"></i>\n");
          out.write("                        <div class=\"sub-menu\">\n");
          out.write("                            <ul class=\"hienthi\">\n");
          out.write("                                ");
          if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                            </ul>\n");
          out.write("                           \n");
          out.write("                        </div>\n");
          out.write("                    </li>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_step_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_forEach_1.setBegin(0);
    _jspx_th_c_forEach_1.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listDMC.getListDanhMucCon(o.ma_danh_muc).size()-1}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_1.setStep(1);
    _jspx_th_c_forEach_1.setVar("i");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <li><a href=\"thuonghieu?ma_danh_muc=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listDMC.getListDanhMucCon(o.ma_danh_muc).get(i).ma_danh_muc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listDMC.getListDanhMucCon(o.ma_danh_muc).get(i).ten_danh_muc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                                \n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_step_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listTC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("o");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <li>\n");
          out.write("                    <div class=\"product-item\">\n");
          out.write("                        <div class=\"product-top\">\n");
          out.write("                            <a href=\"product?ma_san_pham=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.ma_san_pham}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"product-thumb\">\n");
          out.write("                                <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.getHinh_anh()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                            </a>\n");
          out.write("                            <!-- Mua ngay -->\n");
          out.write("                            <a href=\"product?ma_san_pham=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.ma_san_pham}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"buy-btn\">Đặt hàng ngay!</a>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"product-info\">\n");
          out.write("                            <h4 href=\"\" class=\"product-name\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.ten_san_pham}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                            <div class=\"product-price\">\n");
          out.write("                                <h3 href=\"product?ma_san_pham=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.ma_san_pham}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.don_gia_giam}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("đ</h3>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </li>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setBegin(1);
    _jspx_th_c_forEach_3.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${numberPage}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_3.setVar("i");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <li><a href=\"pageServlet?index=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Trang ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }
}
