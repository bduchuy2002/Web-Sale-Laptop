<%-- 
    Document   : index.jsp
    Created on : Apr 23, 2023, 11:13:57 PM
    Author     : PC
--%>




<%@page import="entity.DanhMuc"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge"> 
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
   
    <link rel="stylesheet" href="fonts/themify-icons/themify-icons.css">
    <link rel="stylesheet" href="fonts/fontawesome-free-6.4.0-web/css/all.css">
    <title>Gear VN Team 09</title>
</head>
<body>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <style>
        nav ul li:nth-child(2) i{
            position: inherit ;
        }
        .list-products{
            justify-content: flex-start;
        }
        ul.horizontal-list {
  list-style-type: none;
  padding: 0;
  margin: 0;
  display: flex;
}

ul.horizontal-list li {
  margin-right: 10px;
}

ul.horizontal-list li:last-child {
  margin-right: 0;
}

ul.horizontal-list li a {
    background-color: #ccc;
    padding: 12px;
  text-decoration: none;
  color: #333;
}

ul.horizontal-list li a:hover {
   background-color: #505050;
  text-decoration: underline;
}
.page{
    margin:24px; 
}

    </style>
    <header>
        <img width="1200" height="44" src="https://img.tgdd.vn/imgt/f_webp,fit_outside,quality_100/https://cdn.tgdd.vn/2023/03/banner/big4-1200-44-1200x44.png" alt="Free Women">
    </header>
   <nav>
            <div class="container">
                <ul>
                    <li>
                        <a href="pageServlet"><img width="170px" height="52px" src="//theme.hstatic.net/1000026716/1000440777/14/logo.svg?v=35511" alt="gearvn"></a>
                    </li>
                    
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
                    <c:if test="${sessionScope.user.isAdmin ==1}">
                                <li>
                                <a href="thongke">
                                    <i class="search-icon ti-bar-chart-alt"></i>

                                    Thống kê
                                </a>
                            </li>
                            <li>
                                <a href="admin">
                                    <i class="fa-solid fa-briefcase"></i>

                                    Manager
                                </a>
                            </li>
                            </c:if>
                </ul>
            </div>
        </div>
    </section>
    <!------------------------ Multi Menu ----------------------->
    <div class = "multi-menu">
        <div class="container">
            <div class="multi-menu-content">
                <ul>
                    <li><i class="fa-solid fa-list"></i>Danh mục sản phẩm</li>
                    <c:forEach items="${listD}" var="o">
                          <li><a href="danhmuc?ma_danh_muc=${o.ma_danh_muc}"><i class="fa-solid fa-laptop"></i>${ o.ten_danh_muc }</a><i class="fa-solid fa-caret-down"></i>
                        <div class="sub-menu">
                            <ul class="hienthi">
                                <c:forEach begin="0" end="${listDMC.getListDanhMucCon(o.ma_danh_muc).size()-1}"  step="1" var="i">
                                    <li><a href="thuonghieu?ma_danh_muc=${listDMC.getListDanhMucCon(o.ma_danh_muc).get(i).ma_danh_muc}"> ${listDMC.getListDanhMucCon(o.ma_danh_muc).get(i).ten_danh_muc}</a></li>
                                
                                </c:forEach>
                            </ul>
                           
                        </div>
                    </li>
                    </c:forEach>
                   
                </ul>
            </div>
        </div>
    </div>
    <!-- --------------------------Slider show ---------------------------->
    <section class="slider">
        <div class="container">
            <div class="slider-content">
                <div class="slider-content-left">
                    <div class="slider-content-left-top-container">
                        <div class="slider-content-left-top">
                            <a href="">
                            <img src="img/slideshow_1.jpg" alt="">
                            </a>
                            <a href="">
                                <img src="img/slideshow_2.jpg" alt="">
                                </a>
                            <a href="">
                                <img src="img/slideshow_3.jpg" alt="">
                            </a>
                            <a href="">
                                <img src="img/slideshow_4.jpg" alt="">
                            </a>
                            <a href="">
                                <img src="img/slideshow_5.jpg" alt="">
                                </a>
                        </div>
                        <div class="slider-content-left-top-arrow">
                            <i class="fa-solid fa-chevron-left"></i>
                            <i class="fa-solid fa-chevron-right"></i>
                        </div>
                    </div>
                    <div class="slider-content-left-bottom">
                        <li class="active">Thông tin 1</li>
                        <li>Thông tin 2</li>
                        <li>Thông tin 3</li>
                        <li>Thông tin 4</li>
                        <li>Thông tin 5</li>
                    </div>
                    <div class="slider-content-left-bottom-img">
                        <li><a href=""><img src="img/solid1.jpg" alt=""></a></li>
                        <li><a href=""><img src="img/solid3.jpg" alt=""></a></li>
                        <!-- <li><a href=""><img src="img/solid2.jpg" alt=""></a></li> -->

                    </div>
                </div>
                <div class="slider-content-right">
                    <li><a href=""><img src="img/solid2.jpg" alt=""></a></li>
                    <li><a href=""><img src="img/solid4.jpg" alt=""></a></li>
                    <li><a href=""><img src="img/solid5.jpg" alt=""></a></li>
                </div>
            </div>
        </div>
    </section>
    <!-- -----------------Banner ------------------------ -->
    <div class="banner">
        <div class="container">
           <div class="banner-content">
            <ul>
                <li>
                    <a href="">
                        <img src="img/xxxbanner1.jpg" alt="">
                    </a>
                </li>
                <li>
                    <a href="">
                        <img src="img/xxxbanner2.jpg" alt="">
                    </a>
                </li>
                <li>
                    <a href="">
                        <img src="img/xxxbanner3.jpg" alt="">
                    </a>
                </li
                ><li>
                    <a href="">
                        <img src="img/xxxbanner4.jpg" alt="">
                    </a>
                </li>
            </ul>
           </div>
        </div>

    </div>
    <!-- ----------------- Slider Product------------------>
<!--    <div class="slider-product">
        <div class="container">
            <div class="heading-product">
                <h2>
                    LAPTOP
                </h2>
                <a href="">Xem tất cả <i class="fa-solid fa-chevron-right"></i></a>
            </div>
       </div>
    </div>-->
    <div class="slider-product">
        <div class="container">
            <div class="heading-product">
                <h2>
                    LAPTOP 
                </h2>
                <a href="">Xem tất cả <i class="fa-solid fa-chevron-right"></i></a>
            </div>
            <ul class="list-products">
                <c:forEach items="${listTC}" var="o">
                <li>
                    <div class="product-item">
                        <div class="product-top">
                            <a href="product?ma_san_pham=${o.ma_san_pham}" class="product-thumb">
                                <img src="${o.getHinh_anh()}" alt="">
                            </a>
                            <!-- Mua ngay -->
                            <a href="product?ma_san_pham=${o.ma_san_pham}" class="buy-btn">Đặt hàng ngay!</a>
                        </div>
                        <div class="product-info">
                            <h4 href="" class="product-name">${o.ten_san_pham}</h4>
                            <div class="product-price">
                                <h3 href="product?ma_san_pham=${o.ma_san_pham}">${o.don_gia_giam}đ</h3>
                            </div>
                        </div>
                    </div>
                </li>
                </c:forEach>
<!--                <li>
                    <div class="product-item">
                        <div class="product-top">
                            <a href="" class="product-thumb">
                                <img src="img/product_2.jpg" alt="">
                            </a>
                             Mua ngay 
                            <a href="" class="buy-btn">Đặt hàng ngay!</a>

                        </div>
                        <div class="product-info">
                            <h4 href="" class="product-name">Laptop gaming Gigabyte G5 GD 51VN123SO</h4>
                            <div class="product-price">
                                <h3 href="">19,490,000₫</h3>
                            </div>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="product-item">
                        <div class="product-top">
                            <a href="" class="product-thumb">
                                <img src="img/product_2.jpg" alt="">
                            </a>
                             Mua ngay 
                            <a href="" class="buy-btn">Đặt hàng ngay!</a>

                        </div>
                        <div class="product-info">
                            <h4 href="" class="product-name">Laptop gaming Gigabyte G5 GD 51VN123SO</h4>
                            <div class="product-price">
                                <h3 href="">19,490,000₫</h3>
                            </div>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="product-item">
                        <div class="product-top">
                            <a href="" class="product-thumb">
                                <img src="img/product_2.jpg" alt="">
                            </a>
                             Mua ngay 
                            <a href="" class="buy-btn">Đặt hàng ngay!</a>

                        </div>
                        <div class="product-info">
                            <h4 href="" class="product-name">Laptop gaming Gigabyte G5 GD 51VN123SO</h4>
                            <div class="product-price">
                                <h3 href="">19,490,000₫</h3>
                            </div>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="product-item">
                        <div class="product-top">
                            <a href="" class="product-thumb">
                                <img src="img/product_2.jpg" alt="">
                            </a>
                             Mua ngay 
                            <a href="" class="buy-btn">Đặt hàng ngay!</a>

                        </div>
                        <div class="product-info">
                            <h4 href="" class="product-name">Laptop gaming Gigabyte G5 GD 51VN123SO</h4>
                            <div class="product-price">
                                <h3 href="">19,490,000₫</h3>
                            </div>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="product-item">
                        <div class="product-top">
                            <a href="" class="product-thumb">
                                <img src="img/product_2.jpg" alt="">
                            </a>
                             Mua ngay 
                            <a href="" class="buy-btn">Đặt hàng ngay!</a>

                        </div>
                        <div class="product-info">
                            <h4 href="" class="product-name">Laptop gaming Gigabyte G5 GD 51VN123SO</h4>
                            <div class="product-price">
                                <h3 href="">19,490,000₫</h3>
                            </div>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="product-item">
                        <div class="product-top">
                            <a href="" class="product-thumb">
                                <img src="img/product_2.jpg" alt="">
                            </a>
                             Mua ngay 
                            <a href="" class="buy-btn">Đặt hàng ngay!</a>

                        </div>
                        <div class="product-info">
                            <h4 href="" class="product-name">Laptop gaming Gigabyte G5 GD 51VN123SO</h4>
                            <div class="product-price">
                                <h3 href="">19,490,000₫</h3>
                            </div>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="product-item">
                        <div class="product-top">
                            <a href="" class="product-thumb">
                                <img src="img/product_2.jpg" alt="">
                            </a>
                             Mua ngay 
                            <a href="" class="buy-btn">Đặt hàng ngay!</a>

                        </div>
                        <div class="product-info">
                            <h4 href="" class="product-name">Laptop gaming Gigabyte G5 GD 51VN123SO</h4>
                            <div class="product-price">
                                <h3 href="">19,490,000₫</h3>
                            </div>
                        </div>
                    </div>
                </li>-->
                
            </ul>
        </div>
    </div>
    <div class="page">
        <ul class="horizontal-list" style="margin-left:450px;">
            <c:forEach begin="1" end="${numberPage}" var="i">
                <li><a href="pageServlet?index=${i}">Trang ${i}</a></li>
            </c:forEach>
            
       </ul>
    </div>
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