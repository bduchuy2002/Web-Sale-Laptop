<%-- 
    Document   : giohang.jsp
    Created on : Apr 23, 2023, 11:14:32 PM
    Author     : PC
--%>

<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.TreeMap"%>
<%@page import="entity.SanPham"%>
<%@page import="entity.GioHang"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge"> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="/WebProjectTeam09/fonts/themify-icons/themify-icons.css">
        <link rel="stylesheet" href="/WebProjectTeam09//fonts/fontawesome-free-6.4.0-web/css/all.css">
        <title>Giỏ hàng</title>
        <style>
            table, th, td{
                border: 1px solid gainsboro;
                border-collapse: collapse;
            }
            tr{
                height: 50px;
            }
            .carttable{
                margin-top: 20px;
                margin-bottom: 20px;
            }

        </style>
    </head>
    <body>
        <%
            GioHang cart = (GioHang) session.getAttribute("cart");
            if (cart == null) {
                cart = new GioHang();
                session.setAttribute("cart", cart);
            }
            TreeMap<SanPham, Integer> list = cart.getList();
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(0);
        %>
        <header>
            <a href=""><img width="1200" height="44" src="https://img.tgdd.vn/imgt/f_webp,fit_outside,quality_100/https://cdn.tgdd.vn/2023/03/banner/big4-1200-44-1200x44.png" alt="Free Women"></a>
        </header>
        <!--    <nav>
                <div class="container">
                    <ul>
                        <li>
                            <img width="170px" height="52px" src="//theme.hstatic.net/1000026716/1000440777/14/logo.svg?v=35511" alt="gearvn"></li>
                        <li>
                            <input type="text" placeholder="Nhập mã hoặc tên sản phẩm"> 
                            <i class="ti-search"></i>
                        </li>
                        <li>
                            <img width="20px" height="20px" src="//theme.hstatic.net/1000026716/1000440777/14/ak1.png?v=35511">
                            <a href="">ĐĂNG KÍ</a>
                        </li>
                        <li>
                            <i class="ti-user"></i>
                            <a href="">ĐĂNG NHẬP</a>
                        </li>
                        <li>
                            <i class="ti-stats-down"></i> 
                            <a href="">KHUYẾN MÃI</a>
                        </li>
                        <li>
                            <i class="ti-shopping-cart"></i>
                            <a href="">GIỎ HÀNG</a>
                        </li>
                    </ul>
        
                </div>
            </nav>-->
       <nav>
            <div class="container">
                <ul>
                    <li>
                        <a href="index.jsp"><img width="170px" height="52px" src="//theme.hstatic.net/1000026716/1000440777/14/logo.svg?v=35511" alt="gearvn"></a>
                    </li>
                    <% String email = (String) session.getAttribute("email"); %>
                    <% if (email != null) {%>
                    <li>
                        <form action="searchServlet" method="post">
                        <input name="txt"  type="text" placeholder="Nhập mã hoặc tên sản phẩm"> 
                        <button type="submit">
                            <i class="ti-search"></i>
                        </button>
                    </form>
                    </li>
                    <li>
                        <i class="ti-user"></i>
                        <a>Xin chào <%= email%></a>
                    </li>
                    
                    <li>
                    <i class="ti-power-off"></i>
                    <a href="logout.jsp">ĐĂNG XUẤT</a>
                    </li>
                    <% } else { %>
                    
                    <li>
                        <img width="20px" height="20px" src="//theme.hstatic.net/1000026716/1000440777/14/ak1.png?v=35511">
                        <a href="signup.jsp">ĐĂNG KÍ</a>
                    </li>
                    <li>
                        <i class="ti-user"></i>
                        <a href="signin.jsp">ĐĂNG NHẬP</a>
                    </li>
                    <% }%>
                    <li>
                        <i class="ti-stats-down"></i> 
                        <a href="">KHUYẾN MÃI</a>
                    </li>
                    <li>
                        <i class="ti-shopping-cart"></i>
                        <a href="cart.jsp">GIỎ HÀNG</a>
                    </li>
                </ul>
            </div>
        </nav>
        <!-- ----------------------Menu bar----------------- -->
        <section class="menu-bar">
            <div class="container">
                <div class="menu-bar-content">
                    <ul>
                        <li class="first-none">
                            <a href="">
                                <i class="fa-solid fa-phone-volume"></i>
                                Tổng đài 
                            </a>
                        </li>
                        <li>
                            <a href="">
                                <i class="fa-brands fa-youtube"></i>
                                Videos
                            </a>
                        </li>
                        <li>
                            <a href="">
                                <i class="fa-regular fa-newspaper"></i>
                                Tin công nghệ 
                            </a>
                        </li>
                        <li>
                            <a href="">
                                <i class="fa-brands fa-wpforms"></i>
                                Tuyển dụng 
                            </a>
                        </li>
                        <li>
                            <a href="">
                                <i class="fa-solid fa-map-location-dot"></i>
                                Hệ thống showroom
                            </a>
                        </li>
                        <li></li>
                        <li></li>
                    </ul>
                </div>
            </div>
        </section>


        <!---------Bảng danh sách món đồ được thêm vào giỏ hàng----------->
        <table style="width: 95%; margin: auto; padding: 10px 10px" class="carttable">
            <thead>
                <tr>        
                    <td style="text-align: center; width: 14%;"><b>Sản phẩm</b></td>
                    <td style="text-align: center; width: 40%;"><b>Tên sản phẩm</b></td>
                    <td style="text-align: center; width: 20%;"><b>Đơn giá</b></td>               
                    <td style="text-align: center; width: 10%;"><b>Số lượng</b></td>  
                    <td style="text-align: center; width: 20%;"><b>Thành tiền</b></td>
                    <td style="text-align: center; width: 10%;"><b>Xóa</b></td>           
                </tr> 
            </thead>
            <tbody> 
           
               <% double totalPrice = 0; %>
                <%
                    for (Map.Entry<SanPham, Integer> sp : list.entrySet()) {

                %>
                <tr>
                    <td style="text-align: center;">
                        <img style="width: 50px;" src="<%=sp.getKey().getHinh_anh()%>" alt=""></a> 
                    </td>

                    <td style="text-align: center;">                    
                        <p name="product_name"><%=sp.getKey().getTen_san_pham()%></p>
                    </td>

                    <td style="text-align: center;">
                        <p><%=nf.format(sp.getKey().getDon_gia_giam2())%><sup>vnđ</sup>
                        </p>
                    </td>

                    <td style="text-align: center;">
                        <div>
                            <a href="GioHangServlet?command=plus&ma_san_pham=<%=sp.getKey().getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>"><b>+</b></a>
                            <input type="text" value="<%=sp.getValue()%>" autocomplete="off" size="2" disable="" >
                            <a href="GioHangServlet?command=sub&ma_san_pham=<%=sp.getKey().getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>"><b>-</b></a>
                        </div>
                    </td> 
                    <td style="text-align: center;">
                        <p><%=nf.format(sp.getValue() * sp.getKey().getDon_gia_giam2())%><sup>vnđ</sup>
                        </p>
                    </td>
                    <td style="text-align: center;">
                        <div>
                            <a style="color: red" href="GioHangServlet?command=remove&ma_san_pham=<%=sp.getKey().getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>">X</a>
                        </div>                   
                    </td>
                </tr>
                <% totalPrice = totalPrice + (sp.getValue() * sp.getKey().getDon_gia_giam2()); %> <!-<!-- tinh tong tien hang -->
                <%
                    }
                %>
                <tr>
                    <th colspan="2"><b>Tổng tiền</b></th>
                    <td style="text-align: center;">
                        <p name="price"><%=nf.format(totalPrice)%><sup>vnđ</sup>
                        </p>
                    </td>
                    <td colspan="3">
                        <form action="thanhtoan.jsp">
                            <button type="submit" style="width: 100%; background-color: red; height: 50px; border-color: red; border-radius: 8px; float: right; color: white;">Thanh toán</button>
                        </form>
                    </td>
                </tr>  
           
                
            </tbody>


        </table>
        <h2 style="padding:10px 10px; text-align: center"><a style="text-decoration: none; color: orange" href="pageServlet">Tiếp tục mua sắm</a></h2>

        <footer class="footer">
            <div class="col-1">
                <h3>CÔNG TY TNHH THƯƠNG MẠI GEARVN</h3><br>
                <h3>EMAIL: CSKH@GEARVN.COM</h3><br>
                <b>HỆ THỐNG TỔNG ĐÀI MIỄN PHÍ:</b>
                <p class="f-listtel__content">
                    <i class="fa-solid fa-phone"></i> <span>Gọi mua:</span> <a href="tel:18001060">1800.1060</a> (8:30 - 20:00)
                </p>
                <p class="f-listtel__content">
                    <i class="fa-solid fa-phone"></i> <span>Khiếu nại:</span> <a href="tel:18001060">1800.1062</a> (8:30 - 20:00)
                </p>
                <p class="f-listtel__content">
                    <i class="fa-solid fa-phone"></i> <span>Bảo hành:</span> <a href="tel:18001060">1800.1064</a> (8:00 - 20:00)
                </p>
            </div>
            <div class="col-2">
                <h3>HỆ THỐNG CỬA HÀNG:</h3>
                <p>
                    <b>Showroom HN</b> "(Làm việc từ 08h00 - 20h00)" <br>
                    <i class="fa-solid fa-map-location-dot"></i> Địa chỉ 1: 162 - 164 Thái Hà, Phường Trung Liệt, Quận Đống Đa, Hà Nội <br>
                    <i class="fa-solid fa-map-location-dot"></i> Địa chỉ 2: 460 Minh Khai, Phường Vĩnh Tuy, Quận Hai Bà Trưng, Hà Nội <br>
                    <b>Showrom HCM</b> "(Làm việc từ 08h00 - 20h00)" <br>
                    <i class="fa-solid fa-map-location-dot"></i> Địa chỉ 1: 78-80-82 Hoàng Hoa Thám, Phường 12, Quận Tân Bình. <br>
                    <i class="fa-solid fa-map-location-dot"></i> Địa chỉ 2: 905 Kha Vạn Cân, Phường Linh Tây, Thành phố Thủ Đức. <br>
                    <i class="fa-solid fa-map-location-dot"></i> Địa chỉ 3: 1081 - 1083 Trần Hưng Đạo, Phường 5, Quận 5. <br>
                    <i class="fa-solid fa-map-location-dot"></i> Địa chỉ 4: 415 An Dương Vương, Phường 10, Quận 6. <br>
                </p>
                <h3>TRUNG TÂM BẢO HÀNH:</h3>
                <p><i class="fa-solid fa-map-location-dot"></i> Địa chỉ : 436A/71 đường 3/2, Phường 12, Quận 10, Hồ Chí Minh.</p>
            </div>
            <div class="col-3">
                <h3>PROJECT WEB TEAM 09</h3>
                <p>

                </p>
            </div>
        </footer>
        <footer class="footer-copyright">
            <div class="copyright">
                <section>
                    <p>
                        © 2018. Công ty cổ phần GearVN. GPDKKD: 0303217354 do sở KH &amp; ĐT TP.HCM cấp ngày 02/01/2007. GPMXH: 238/GP-BTTTT do Bộ Thông Tin và Truyền Thông cấp ngày 04/06/2020.<br>
                        Địa chỉ: 128 Trần Quang Khải, P. Tân Định, Q.1, TP.Hồ Chí Minh. Chịu trách nhiệm nội dung: Team 09. <a rel="nofollow" href="/thoa-thuan-su-dung-trang-mxh">Xem chính sách sử dụng</a>
                    </p>
                </section>
            </div>
        </footer>
        <script language="JavaScript" type="text/javascript" src="main.js"></script>
    </body>
</html>
