<%-- 
    Document   : product.jsp
    Created on : Apr 23, 2023, 11:11:04 PM
    Author     : PC
--%>
<%@page import="entity.SanPham"%>
<%@page import="entity.GioHang"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="dao.ProductDAOImp1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="product.css">
        <link rel="stylesheet" href="fonts/fontawesome-free-6.4.0-web/css/all.css">
        <link rel="stylesheet" href="fonts/themify-icons/themify-icons.css">
        <title>PRODUCT</title>
    </head>

    <body>
        <%
            GioHang cart = (GioHang) session.getAttribute("cart");
            if (cart == null) {
                cart = new GioHang();
                session.setAttribute("cart", cart);
            }
        %>
        <header>
            <img width="1200" height="44"
                 src="https://img.tgdd.vn/imgt/f_webp,fit_outside,quality_100/https://cdn.tgdd.vn/2023/03/banner/big4-1200-44-1200x44.png"
                 alt="Free Women">
        </header>
        <nav>
            <div class="container">
                <ul>
                    <li>
                        <a href="pageSevlet"><img width="170px" height="52px" src="//theme.hstatic.net/1000026716/1000440777/14/logo.svg?v=35511" alt="gearvn"></a>
                    </li>
                    <li>

                        <i class="ti-user"></i>
                        <c:if test="${sessionScope.user !=null}">
                            <a href="">${sessionScope.user.fname} ${sessionScope.user.lname}</a>
                        </c:if>
                        <c:if test="${sessionScope.user ==null}">
                            <a href="signin.jsp">ĐĂNG NHẬP</a>
                        </c:if>

                    </li>
                    <li>

                        <c:if test="${sessionScope.user !=null}">
                            <i class="fa-solid fa-right-from-bracket"></i>
                            <a href="logout.jsp">ĐĂNG XUẤT</a>
                        </c:if>
                        <c:if test="${sessionScope.user ==null}">
                            <img width="20px" height="20px" src="//theme.hstatic.net/1000026716/1000440777/14/ak1.png?v=35511">
                            <a href="signup.jsp">ĐĂNG KÍ</a>
                        </c:if>

                    </li>                    
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
        <!-- -----------------------------Menu Button ------------------------>
        <div class="multi-menu">
            <div class="container">
                <div class="multi-menu-content">
                    <ul>
                        <li><i class="fa-solid fa-list"></i>Danh mục sản phẩm</li>
                        <li><a href=""><i class="fa-solid fa-laptop"></i>Laptop</a><i class="fa-solid fa-caret-down"></i>
                            <div class="sub-menu">
                                <ul>
                                    <li>Thương hiệu</li>
                                    <li>ASUS</li>
                                    <li>GIGABYTE</li>
                                    <li>DELL</li>
                                    <li>ACER</li>
                                    <li>LENOVO</li>
                                </ul>

                            </div>
                        </li>
                        <li><a href=""><i class="fa-solid fa-laptop"></i>Laptop Gaming</a><i
                                class="fa-solid fa-caret-down"></i>
                            <div class="sub-menu">
                                <ul>
                                    <li>Thương hiệu</li>
                                    <li>ASUS</li>
                                    <li>GIGABYTE</li>
                                    <li>DELL</li>
                                    <li>ACER</li>
                                    <li>LENOVO</li>
                                </ul>

                            </div>
                        </li>
                        <li><a href=""><i class="fa-solid fa-computer"></i>PC</a><i class="fa-solid fa-caret-down"></i>
                            <div class="sub-menu">
                                <ul>
                                    <li>Thương hiệu</li>
                                    <li>ASUS</li>
                                    <li>GIGABYTE</li>
                                    <li>DELL</li>
                                    <li>ACER</li>
                                    <li>LENOVO</li>
                                </ul>

                            </div>
                        </li>
                        <li><a href=""><i class="fa-regular fa-keyboard"></i>Gaming Gear</a><i
                                class="fa-solid fa-caret-down"></i>
                            <div class="sub-menu">
                                <ul>
                                    <li>Phụ kiện</li>
                                    <li>Chuột gaming</li>
                                    <li>Bàn phím cơ</li>
                                    <li>Quạt tản nhiệt</li>
                                    <li>Tai nghe</li>
                                    <li>Lót chuột</li>
                                </ul>

                            </div>
                        </li>
                        <li><a href=""><i class="fa-solid fa-headphones"></i>Thiết bị, phụ kiện</a><i
                                class="fa-solid fa-caret-down"></i>
                            <div class="sub-menu">
                                <ul>
                                    <li>Thiết bị</li>
                                    <li>Card đồ hoạ</li>
                                    <li>Nguồn</li>
                                    <li>WIFI Adapter</li>
                                    <li>Router</li>
                                    <li>Loa</li>
                                </ul>

                            </div>
                        </li>
                        <li><a href=""><i class="fa-solid fa-microchip"></i>Linh kiện thay thế</a><i
                                class="fa-solid fa-caret-down"></i>
                            <div class="sub-menu">
                                <ul>
                                    <li>Linh kiện</li>
                                    <li>RAM</li>
                                    <li>SSD/HDD</li>
                                    <li>Cáp chuyển đổi</li>
                                    <li>Vỏ case</li>
                                </ul>

                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>

        <!--trang product-->
        <div class="container">
            <div class="header">


            </div>


        </div>
        <c:forEach items="${listSP}" var="o" >

            <div class="content-top">
                <div class="content-top-left">
                    <img src="${o.hinh_anh}"
                         class="fotorama__img" style="width: 600px; height: 600px; left: 0px; top: 0px;">
                </div>
                <div class="content-top-right">
                    <h1 class="product_name">
                        ${o.ten_san_pham}
                    </h1>
                    <p> <span class="font-size-18">✔ Bảo hành chính hãng 24 tháng. </span> </p>
                    <p> <span class="font-size-18">✔ Hỗ trợ đổi mới trong 7 ngày. </span></p>
                    <p><span class="font-size-18">✔ Windows bản quyền tích hợp. </span></p>
                    <p><span class="font-size-18">✔ Miễn phí giao hàng toàn quốc.</span></p>
                    <p>
                        <span style="color:#ff0000"><span style="font-size:20px"><u><strong>QUÀ TẶNG:</strong></u></span></span>
                    </p>
                    <p><strong><span class="font-size-18"><a class="a-product"
                                                             href="">🎁
                                    Voucher mua Ram Laptop
                                    trị giá 500,000đ ( T</a></span></strong><a class="a-product"
                                                                   href=""><strong><span class="font-size-18">ừ 01.04 đến
                                    30.04.2023)</span></strong></a></p>
                    <p><span class="font-size-18"><span style="color:#ff0000"><strong><u>ƯU ĐÃI KHI MUA KÈM LAPTOP TẠI
                                        GEARVN: </u></strong></span></span></p>
                    <p><span class="font-size-18">⭐ <a class="a-product"
                                                       href="">Mua
                                túi chống sốc chỉ với giá 49.000đ</a></span></p>
                    <p><span class="font-size-18">⭐<a class="a-product"
                                                      href="">
                                Giảm ngay 100.000đ khi
                                mua kèm đế tản nhiệt Havit F2072.</a></span></p>
                    <p><span class="font-size-18">⭐ <a class="a-product" href="">Giảm
                                ngay
                                100.000đ khi mua kèm Ram
                                Laptop.</a><br>⭐ <a class="a-product"
                                                href="">Giảm
                                đến 200.000đ khi mua kèm
                                Balo, túi chống sốc, phụ kiện.</a><br>⭐ <a class="a-product"
                                                                       href="">Giảm
                                ngay 30.000đ khi mua Đế tản nhiệt Laptop.</a></p>
                    <p><span class="font-size-18">Và còn rất nhiều ưu đãi khác. <a class="a-product"
                                                                                   href=""><strong>XEM NGAY CHI TIẾT TẠI
                                    ĐÂY</strong></a></span></p>
                    <hr>
                    <p><span class="font-size-18"><strong><span style="color:#ff0000">Hỗ trợ trả góp MPOS (Thẻ tín dụng)
                                    <span style="color:#ff0000">.</span></strong></span>
                    </p>
                    <div class="product_nav_btn">

                        <div class="product_sales_off pull-left">

                            <span class="price-text">Giá Cũ:</span><span class="product_price"><del>${o.getDon_gia() } đ</del></span><br>

                            <span class="price-text">Giá KM:</span><span class="product_sale_price">${ o.getDon_gia_giam()} đ </span>
                        </div>
                    </div>
                    <div class="form-group" style="text-align: center;
                         height: 40px;
                         width: 100px;
                         border-color: red;
                         border-radius: 8px;
                         background-color: gainsboro;">
                        <a  href="GioHangServlet?command=insert&ma_san_pham=${o.getMa_san_pham()}&cartID=<%=System.currentTimeMillis()%>"> <h3 class="dathang" >Đặt hàng</h3> </a>
                    </div>
                </div>

            </div>
        </c:forEach>
        <div class="content-two">
            <div>
                <ul class="nav nav-tabs" role="tablist">
                    <li class="active"> <strong>Mô tả sản phẩm</strong> </li>

                </ul>
            </div>
            <div class="tab-content">
                <div role="tabpanel" class="tab-pane active" id="chitiet">
                    <p></p>
                    <h2><span style="font-size:22px"><strong>THÔNG SỐ KĨ THUẬT: </strong></span></h2>
                    <div class="scroll-table">
                        <table id="tblGeneralAttribute" border="1" cellpadding="3" cellspacing="0"
                               class="table table-bordered">
                            <tbody>
                                <tr class="row-info">
                                    <td class="td-one">
                                        <span class="font-size-16"><strong>CPU</strong></span>
                                    </td>
                                    <td class="td-two">
                                        <span class="color-black"><span class="font-size-16">Intel® Core™ i7-12700H
                                                Processor
                                                2.3 GHz (24M Cache, up to 4.7 GHz, 14 cores: 6 P-cores and 8
                                                E-cores)</span></span>
                                    </td>
                                </tr>
                                <tr class="row-info">
                                    <td class="td-one">
                                        <span class="font-size-16"><strong>RAM</strong></span>
                                    </td>
                                    <td class="td-two">
                                        <span class="color-black"><span class="font-size-16">8GB DDR4 3200MHz (2x SO-DIMM
                                                socket, up to 32GB SDRAM)</span></span>
                                    </td>
                                </tr>
                                <tr class="row-info">
                                    <td class="td-one">
                                        <span class="font-size-16"><strong>Ổ cứng</strong></span>
                                    </td>
                                    <td class="td-two">
                                        <span class="color-black"><span class="font-size-16">512GB PCIe® 4.0 NVMe™ M.2 SSD
                                                (Còn
                                                trống 1 khe SSD M.2 PCIE)</span></span>
                                    </td>
                                </tr>
                                <tr class="row-info">
                                    <td class="td-one">
                                        <span class="font-size-16"><strong>Card đồ
                                                họa</strong></span>
                                    </td>
                                    <td class="td-two">
                                        <span class="color-black"><span class="font-size-16">NVIDIA® GeForce RTX™ 4060
                                                Laptop
                                                GPU 8GB GDDR6 , 2420MHz* at 140W (2370MHz Boost Clock+50MHz OC, 115W+25W
                                                Dynamic Boost) + Intel® Iris Xe Graphics, MUX Switch + NVIDIA® Advanced
                                                Optimus</span></span>
                                    </td>
                                </tr>
                                <tr class="row-info">
                                    <td class="td-one">
                                        <span class="font-size-16"><strong>Màn hình</strong></span>
                                    </td>
                                    <td class="td-two">
                                        <span class="font-size-16">15.6 inch FHD (1920 x
                                            1080) IPS, 144Hz, Wide View, 250nits, Narrow Bezel, Anti-Glare with 72% NTSC,
                                            <strong><span style="color:#ff0000">100% sRGB</span></strong></span>
                                    </td>
                                </tr>
                                <tr class="row-info">
                                    <td class="td-one">
                                        <span class="font-size-16"><strong><span class="color-black">Cổng giao
                                                    tiếp</span></strong></span>
                                    </td>
                                    <td class="td-two">
                                        <ul>
                                            <li><span class="color-black"><span class="font-size-16">1x Thunderbolt 4
                                                        support
                                                        DisplayPort</span></span></li>
                                            <li><span class="color-black"><span class="font-size-16">1x USB 3.2 Gen 2 Type-C
                                                        support DisplayPort™ / G-SYNC</span></span></li>
                                            <li><span class="color-black"><span class="font-size-16">2x USB 3.2 Gen 1
                                                        Type-A</span></span></li>
                                            <li><span class="color-black"><span class="font-size-16">1x RJ-45
                                                        LAN</span></span>
                                            </li>
                                            <li><span class="color-black"><span class="font-size-16">1x HDMI 2.1
                                                        FRL</span></span></li>
                                            <li><span class="color-black"><span class="font-size-16">1x COMBO audio
                                                        jack</span></span></li>
                                        </ul>
                                    </td>
                                </tr>
                                <tr class="row-info">
                                    <td class="td-one">
                                        <span class="font-size-16"><strong><span
                                                    class="color-black">Audio</span></strong></span>
                                    </td>
                                    <td class="td-two">
                                        <span class="color-black"><span class="font-size-16">Dolby Atmos</span></span>
                                    </td>
                                </tr>
                                <tr class="row-info">
                                    <td class="td-one">
                                        <span class="font-size-16"><strong>Bàn
                                                phím</strong></span>
                                    </td>
                                    <td class="td-two">
                                        <span class="color-black"><span class="font-size-16">Backlit Chiclet Keyboard 1-Zone
                                                RGB</span></span>
                                    </td>
                                </tr>
                                <tr class="row-info">
                                    <td class="td-one">
                                        <span class="font-size-16"><strong><span class="color-black">Chuẩn
                                                    LAN</span></strong></span>
                                    </td>
                                    <td class="td-two">
                                        <span class="color-black"><span class="font-size-16">10/100/1000 Mbps</span></span>
                                    </td>
                                </tr>
                                <tr class="row-info">
                                    <td class="td-one">
                                        <span class="font-size-16"><strong><span class="color-black">Chuẩn
                                                    WIFI</span></strong></span>
                                    </td>
                                    <td class="td-two">
                                        <span class="color-black"><span class="font-size-16">802.11AX (2X2)</span></span>
                                    </td>
                                </tr>
                                <tr class="row-info">
                                    <td class="td-one">
                                        <span class="font-size-16"><strong><span
                                                    class="color-black">Bluetooth</span></strong></span>
                                    </td>
                                    <td class="td-two">
                                        <span class="color-black"><span class="font-size-16">v5.2</span></span>
                                    </td>
                                </tr>
                                <tr class="row-info">
                                    <td class="td-one">
                                        <span class="font-size-16"><strong>Webcam</strong></span>
                                    </td>
                                    <td class="td-two">
                                        <span class="color-black"><span class="font-size-16">HD 720p</span></span>
                                    </td>
                                </tr>
                                <tr class="row-info">
                                    <td class="td-one">
                                        <span class="font-size-16"><strong><span class="color-black">Hệ điều
                                                    hành</span></strong></span>
                                    </td>
                                    <td class="td-two">
                                        <span class="font-size-16">Windows 11 Home</span>
                                    </td>
                                </tr>
                                <tr class="row-info">
                                    <td class="td-one">
                                        <span class="font-size-16"><strong><span
                                                    class="color-black">Pin</span></strong></span>
                                    </td>
                                    <td class="td-two">
                                        <span class="color-black"><span class="font-size-16">90WHrs, 4S1P, 4-cell
                                                Li-ion</span></span>
                                    </td>
                                </tr>
                                <tr class="row-info">
                                    <td class="td-one">
                                        <span class="font-size-16"><strong><span class="color-black">Trọng
                                                    lượng</span></strong></span>
                                    </td>
                                    <td class="td-two">
                                        <span class="color-black"><span class="font-size-16">2.2 kg</span></span>
                                    </td>
                                </tr>
                                <tr class="row-info">
                                    <td class="td-one">
                                        <span class="font-size-16"><strong><span class="color-black">Màu
                                                    sắc</span></strong></span>
                                    </td>
                                    <td class="td-two">
                                        <span class="color-black"><span class="font-size-16">Jaeger Gray</span></span>
                                    </td>
                                </tr>
                                <tr class="row-info">
                                    <td class="td-one">
                                        <span class="font-size-16"><strong><span class="color-black">Kích
                                                    thước</span></strong></span>
                                    </td>
                                    <td class="td-two">
                                        <span class="color-black"><span class="font-size-16">35.4 x 25.1 x 2.24 ~ 2.49
                                                cm</span></span>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                    <p></p>
                    <p></p>
                    <p></p>
                    <p></p>
                    <p></p>
                </div>
                <div role="tabpanel" class="tab-pane" id="dacdiem">
                    <p></p>
                </div>
                <div role="tabpanel" class="tab-pane" id="hrvproducttabs">
                    <p>


                    </p>
                </div>
            </div>

        </div>

        <!-- Comment Session -->
        <% String email = (String) session.getAttribute("email"); %>

        <% if (email != null) {%>
        <div class="comment-session">
            <div class="comment-box">
                <form action="addCommentControl" method="post">
                    <div class="user">
                        <div class="image">
                            <img src="https://cdn-icons-png.flaticon.com/512/21/21104.png" alt="">

                        </div>

                        <input name="username" type="text" value="${email}">


                    </div>

                    <textarea name="comment" id="" cols="30" rows="10" placeholder="Your comment"></textarea>
                    <!--                <button class="submit">Comment</button>-->
                    <input type="submit" class="submit" value="Comment">

                </form>

            </div>
            <div class="post-comment">
                <c:forEach items="${listC}" var="o">
                    <div class="list">
                        <div class="user">
                            <div class="user-img">
                                <img src="https://cdn-icons-png.flaticon.com/512/21/21104.png" alt="">
                            </div>
                            <div class="user-meta">
                                <div class="name">${o.username} </div>

                            </div>
                        </div>
                        <div class="content-comment">${o.content}</div>
                    </div>

                </c:forEach>


            </div>
            <% } else { %>

            <a href="signin.jsp" style="color: red; margin-left: 50px; font-weight: 100px; padding: 10px 10px; margin-bottom: 20px;">Vui Lòng đăng nhập để bình luận</a>
            <% }%>


            <footer class="footer">
                <div class="col-1">
                    <h3>CÔNG TY TNHH THƯƠNG MẠI GEARVN</h3><br>
                    <h3>EMAIL: CSKH@GEARVN.COM</h3><br>
                    <b>HỆ THỐNG TỔNG ĐÀI MIỄN PHÍ:</b>
                    <p class="f-listtel__content">
                        <i class="fa-solid fa-phone"></i> <span>Gọi mua:</span> <a href="tel:18001060">1800.1060</a> (8:30 -
                        20:00)
                    </p>
                    <p class="f-listtel__content">
                        <i class="fa-solid fa-phone"></i> <span>Khiếu nại:</span> <a href="tel:18001060">1800.1062</a> (8:30 -
                        20:00)
                    </p>
                    <p class="f-listtel__content">
                        <i class="fa-solid fa-phone"></i> <span>Bảo hành:</span> <a href="tel:18001060">1800.1064</a> (8:00 -
                        20:00)
                    </p>
                </div>
                <div class="col-2">
                    <h3>HỆ THỐNG CỬA HÀNG:</h3>
                    <p>
                        <b>Showroom HN</b> "(Làm việc từ 08h00 - 20h00)" <br>
                        <i class="fa-solid fa-map-location-dot"></i> Địa chỉ 1: 162 - 164 Thái Hà, Phường Trung Liệt, Quận Đống
                        Đa,
                        Hà Nội <br>
                        <i class="fa-solid fa-map-location-dot"></i> Địa chỉ 2: 460 Minh Khai, Phường Vĩnh Tuy, Quận Hai Bà
                        Trưng,
                        Hà Nội <br>
                        <b>Showrom HCM</b> "(Làm việc từ 08h00 - 20h00)" <br>
                        <i class="fa-solid fa-map-location-dot"></i> Địa chỉ 1: 78-80-82 Hoàng Hoa Thám, Phường 12, Quận Tân
                        Bình.
                        <br>
                        <i class="fa-solid fa-map-location-dot"></i> Địa chỉ 2: 905 Kha Vạn Cân, Phường Linh Tây, Thành phố Thủ
                        Đức.
                        <br>
                        <i class="fa-solid fa-map-location-dot"></i> Địa chỉ 3: 1081 - 1083 Trần Hưng Đạo, Phường 5, Quận 5.
                        <br>
                        <i class="fa-solid fa-map-location-dot"></i> Địa chỉ 4: 415 An Dương Vương, Phường 10, Quận 6. <br>
                    </p>
                    <h3>TRUNG TÂM BẢO HÀNH:</h3>
                    <p><i class="fa-solid fa-map-location-dot"></i> Địa chỉ : 436A/71 đường 3/2, Phường 12, Quận 10, Hồ Chí
                        Minh.
                    </p>
                </div>
                <div class="col-3">

                    <p>

                    </p>
                </div>
            </footer>
            <footer class="footer-copyright">
                <div class="copyright">
                    <section>
                        <p>
                            © 2018. Công ty cổ phần GearVN. GPDKKD: 0303217354 do sở KH &amp; ĐT TP.HCM cấp ngày 02/01/2007.
                            GPMXH:
                            238/GP-BTTTT do Bộ Thông Tin và Truyền Thông cấp ngày 04/06/2020.<br>
                            Địa chỉ: 128 Trần Quang Khải, P. Tân Định, Q.1, TP.Hồ Chí Minh. Chịu trách nhiệm nội dung: Team 09.
                            <a rel="nofollow" href="/thoa-thuan-su-dung-trang-mxh">Xem chính sách sử dụng</a>
                        </p>
                    </section>
                </div>
            </footer>
            <div></div>
        </div>



        <script src="main.js"></script>
    </body>

</html>