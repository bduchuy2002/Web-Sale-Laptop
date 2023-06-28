<%-- 
    Document   : signup
    Created on : May 25, 2023, 2:45:20 PM
    Author     : admin
--%>

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
    <title>Thegioididong</title>
</head>
<body>
    <header>
        <img width="1200" height="44" src="https://img.tgdd.vn/imgt/f_webp,fit_outside,quality_100/https://cdn.tgdd.vn/2023/03/banner/big4-1200-44-1200x44.png" alt="Free Women">
    </header>
    <nav>
        <div class="container">
            <ul>
                <li>
                    <a href="pageServlet"><img width="170px" height="52px" src="//theme.hstatic.net/1000026716/1000440777/14/logo.svg?v=35511" alt="gearvn"></a></li>
                <li>
                    <input type="text" placeholder="Nhập mã hoặc tên sản phẩm"> 
                    <i class="ti-search"></i>
                </li>
                <li>
                    <img width="20px" height="20px" src="//theme.hstatic.net/1000026716/1000440777/14/ak1.png?v=35511">
                    <a href="signup.jsp">ĐĂNG KÍ</a>
                </li>
                <li>
                    <i class="ti-user"></i>
                    <a href="signin.jsp">ĐĂNG NHẬP</a>
                </li>
                <li>
                    <i class="ti-stats-down"></i> 
                    <a href="">KHUYẾN MÃI</a>
                </li>
                <li>
                    <i class="ti-shopping-cart"></i>
                    <a href="giohang.jsp">GIỎ HÀNG</a>
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

    <!-- ----------------------Signup----------------- -->
    <div class="content_container">
        <div class="img_a"><img src="https://theme.hstatic.net/1000026716/1000440777/14/stk-bn-left.png?v=35775" alt="" width="150"></div>
    <section class="signup_container">
        <div class="signup">
            <span class="">
                <h1 class="createaccount">Tạo tài khoản</h1>
            </span>
            <div class="Userbox">
                <form id="register" action="signup" method="POST">
                    <div id="Họ">
                        <img width="20" height="20px" src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/User_font_awesome.svg/1024px-User_font_awesome.svg.png" alt="">
                    <input type="text" name="firstname" id="firstname" placeholder="Họ" autofocus>
                    </div><br>
                    <div id="Tên">
                        <img width="20" height="20px" src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/User_font_awesome.svg/1024px-User_font_awesome.svg.png" alt="">
                        <input type="text" name="lastname" id="lastname" placeholder="Tên">
                    </div><br>
                    <div id="Email">
                        <img width="20" height="20px" src="https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Envelope_font_awesome.svg/1024px-Envelope_font_awesome.svg.png" alt="">
                        <input type="email" name="email" id="Email" placeholder="email">
                    </div><br>
                    <div id="phone">
                        <img width="20" height="20px" src="https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/Phone_font_awesome.svg/1200px-Phone_font_awesome.svg.png" alt="">
                        <input type="tel" name="phone" id="phone" placeholder="Số điện thoại">
                    </div><br>
                    <div id="password">
                        <img width="20" height="20px" src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/Lock_font_awesome.svg/512px-Lock_font_awesome.svg.png" alt="">
                        <input type="password" name="password" id="password" placeholder="Mật Khẩu">
                    </div><br>
                    <div class="register">
                        <input type="submit" value="Đăng ký" name="Signup">
                        <button><a href="http://127.0.0.1:5500/WebProjectTeam09-main/index.jsp"></a>Quay về</button>
                    </div>
                </form>
            </div>
        </div>
    </section>
    <div class="img_b"><img src="https://theme.hstatic.net/1000026716/1000440777/14/stk-bn-right.png?v=35775" alt="" width="150"></div>
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
        <h3></h3>
        <p>
            
        </p>
    </div>

    <script>
        // Function to validate the form
function validateForm() {
  var firstname = document.getElementById('firstname').value;
  var lastname = document.getElementById('lastname').value;
  var email = document.getElementById('Email').value;
  var phone = document.getElementById('phone').value;
  var password = document.getElementById('password').value;

  // Validate first name and last name
  if (firstname === '' || lastname === '') {
    alert('Vui lòng nhập họ và tên.');
    return false;
  }

  // Validate email format
  var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  if (!email.match(emailRegex)) {
    alert('Vui lòng nhập email hợp lệ.');
    return false;
  }

  // Validate phone number
  if (phone.length < 10) {
    alert('Vui lòng nhập số điện thoại có ít nhất 10 số.');
    return false;
  }

  // Validate password format
  var passwordRegex = /^(?=.*\d)(?=.*[A-Z]).{6,}$/;
  if (!password.match(passwordRegex)) {
    alert('Vui lòng nhập mật khẩu có ít nhất 6 ký tự bao gồm số và chữ in hoa.');
    return false;
  }

  return true; // Form is valid
}

// Add form submission event listener
var form = document.getElementById('register');
form.addEventListener('submit', function(event) {
  if (!validateForm()) {
    event.preventDefault(); // Prevent form submission if validation fails
  }
});

    </script>
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