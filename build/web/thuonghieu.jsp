<%-- 
    Document   : thuonghieu.jsp
    Created on : Apr 23, 2023, 11:14:12 PM
    Author     : PC
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="entity.SanPham"%>
<%@page import="dao.DAO"%>
<%@page import="java.text.NumberFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="thuonghieu.css">
        <link rel="stylesheet" href="themify-icons/themify-icons.css">
        <link rel="stylesheet" href="/WebProjectTeam09/fonts/themify-icons/themify-icons.css">
        <link rel="stylesheet" href="/WebProjectTeam09//fonts/fontawesome-free-6.4.0-web/css/all.css">
        <title>Document</title>
    </head>
    <body>
        <nav>
            <div class="container">
                <ul>
                    <li>
                        <a href="pageServlet"><img width="170px" height="52px" src="//theme.hstatic.net/1000026716/1000440777/14/logo.svg?v=35511" alt="gearvn"></a>
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
        <!------------------------ Multi Menu ----------------------->
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

                        <!--                    <li><a href=""><i class="fa-solid fa-laptop"></i>Laptop Gaming</a><i class="fa-solid fa-caret-down"></i>
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
                                            <li><a href=""><i class="fa-regular fa-keyboard"></i>Gaming Gear</a><i class="fa-solid fa-caret-down"></i>
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
                                            <li><a href=""><i class="fa-solid fa-headphones"></i>Thiết bị, phụ kiện</a><i class="fa-solid fa-caret-down"></i>
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
                                            <li><a href=""><i class="fa-solid fa-microchip"></i>Linh kiện thay thế</a><i class="fa-solid fa-caret-down"></i>
                                                <div class="sub-menu">
                                                    <ul>
                                                        <li>Linh kiện</li>
                                                        <li>RAM</li>
                                                        <li>SSD/HDD</li>
                                                        <li>Cáp chuyển đổi</li>
                                                        <li>Vỏ case</li>
                                                    </ul>
                                                   
                                                </div>
                                            </li>-->
                    </ul>
                </div>
            </div>
        </div>
    </div>

    <div class="noindex" style="height: 5000px;">
        <section class="light_section">  
            <div id="collection" class="container">
                <div class="banner-collection-header">
                    <img src="img/banner_asus.webp" alt=""style="height: 300px; width: 100%; object-fit: contain;">
                </div>
                <div class="col-sm-12">
                    <h1 class="title-box-colection">Laptop</h1>
                    <div class="row">
                        <div id="main-content">
                            <div id="breadcrumb">
                                <div class="main">
                                    <div class="breadcrumbs container">
                                        <span class="showHere">Bạn đang ở: </span>
                                        <a href="pageServlet" class="pathway" style="text-decoration: underline; color: blue;">Trang chủ</a>
                                        <i class="ti-angle-double-right"></i>
                                        <span>Laptop </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="row">
                                    <div class="col-sm-12 wrap-sort-by">
                                        <div class="browse-tags pull-right">
                                            <span>Sắp xếp theo:</span>
                                            <span class="custom-dropdown">
                                                <select name="" id="">
                                                    <option value="tentang">Tên: A-Z</option>
                                                    <option value="tengiam">Tên: Z-A</option>
                                                    <option value="giatang">Giá: Tăng dần</option>
                                                    <option value="giagiam">Giá: Giảm dần</option>
                                                    <option value="cunhat">Cũ nhất</option>
                                                    <option value="moinhat">Mới nhất</option>
                                                </select> 
                                            </span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-12 product-list">
                                <div class="row content-product-list">
                                    <c:forEach items="${listS}" var="o">

                                        <div class="col-sm-4 col-xs-12 col-fix20">


                                            <div class="product-row">
                                                <a href="product?ma_san_pham=${o.ma_san_pham}"></a>
                                                <div class="product-row-img">
                                                    <a href="product?ma_san_pham=${o.ma_san_pham}" >
                                                        <img class="product-row-thumbnail" src="${o.hinh_anh}" alt="Asus">
                                                    </a>
                                                    <div class="product-row-price-hover">
                                                        <a href="product?ma_san_pham=${o.ma_san_pham}">
                                                            <div class="product-row-note pull-left">Click để xem chi tiết</div>
                                                        </a>
                                                        <a href="product?ma_san_pham=${o.ma_san_pham}" class="product-row-dh pull-right">Đặt hàng</a>
                                                    </div>
                                                </div>
                                                <h2 class="product-row-name">${o.ten_san_pham}</h2>
                                                <div class="product-row-info">
                                                    <div class="product-row-price pull-left">
                                                        <del>${o.getDon_gia()}đ</del>
                                                        <br>
                                                        <span class="product-row-sale">${o.don_gia_giam}đ</span>
                                                    </div>
                                                    <div class="clearfix">
                                                    </div>
                                                    <div class="new-product-percent">-${ o.giam_gia}%</div>
                                                </div>
                                            </div>

                                        </div>
                                    </c:forEach>
                                </div> 
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </section>
    </div>

</body>
</html>
