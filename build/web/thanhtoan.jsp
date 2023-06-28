<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.TreeMap"%>
<%@page import="entity.GioHang"%>
<%@page import="java.util.Map"%>
<%@page import="entity.SanPham"%>
<%@page import="entity.SanPham"%>
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
    <title>Thanh toán đơn hàng</title>
    <style>
        .letrai{
            width: 7%;
            height: 1000px;
            float: left;
        }
        
        .thongtingiaohang{
            width: 40%;
            height: 1000px;
            float: left;
            
        }
        .middle{
            width: 6%;
            height: 1000px;
            float: left;
           
        }
        .thongtindonhang{
            width: 42%;
            height: 1000px;
            float: left;
            background-color: whitesmoke;
        }
        .lephai{
            width: 5%;
            height: 1000px;
            float: right;
            background-color: whitesmoke
        }
        .button{
            float: right;
            background-color: springgreen; 
            height: 50px; 
            border-color: springgreen; 
            border-radius: 8px;
            margin: 10px 10px;
        }
        tr{
            height: 80px;
        }
        table td{
            text-align: center;
            border-bottom: 2px solid;
            border-bottom-color: white;
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
    <div class="letrai"></div>
     <div class="thongtindonhang">
        <h2>Thông tin đơn hàng</h2>
        <table style="width: 95%; margin: 10px">       
        <tbody>
        <% double totalPrice = 0; %>
        <%
            for (Map.Entry<SanPham, Integer> sp : list.entrySet()) {
            
        %>
            <tr>
                <td style="text-align: center;">
                    <img style="width: 50px;" src="<%=sp.getKey().getHinh_anh()%>" alt=""></a>
                    <p><%=sp.getKey().getTen_san_pham()%></p><span style="color: blue;">x</span><p><%=sp.getValue()%></p>
                </td>              
                               
                <td style="text-align: center;">
                    <p><%=nf.format(sp.getValue() * sp.getKey().getDon_gia_giam2())%><sup>vnđ</sup></p>
                </td>              
            </tr>
            <% totalPrice = totalPrice + (sp.getValue() * sp.getKey().getDon_gia_giam2()); %> <!<!-- tinh tong tien -->
            <% 
                }
            %>
            <tr>
                <td>Phí vận chuyển</td>
                <td>Miễn phí</td>
            </tr>
            <tr>
                <td><b>Tổng cộng</b></td>
                <td>
                    <p name="total_price"><%=nf.format(totalPrice)%><sup>vnđ</sup></p>
                </td>               
            </tr> 
        </tbody>
            
        
    </table>
    </div>
    
    <div class="middle"></div>
   <div class="thongtingiaohang">
        <h1>GEARVN.com</h1>
        <h3>Thông tin giao hàng</h3>
<!--        <div><span>Bạn đã có tài khoản?</span>
        <span><a href="signin.jsp" style="text-decoration: none; color: blue;">Đăng Nhập</a></span></div><br>-->
        
<form name="myForm" onsubmit="return validateForm()" action="addOders" method="post" >
            
            <div><input type="text" id="fullName" name="fullname" placeholder="Họ và tên" style="width: 100%; height: 40px; border-radius: 5px;"></div><br>
            <div><input type="email" id="email" name="email" placeholder="Email" style="width: 65%; height: 40px; border-radius: 5px;">
            <input type="tel" id="phone" name="phone" placeholder="Số điện thoại" style="width: fit-content; height: 40px; float: right; border-radius: 5px;"></div><br>
            <div><input name="address" type="text" placeholder="Địa chỉ" style="width: 100%; height: 40px; border-radius: 5px;"></div>
        
        
            <div style="padding: 20px 0px">
                <h3>Phương thức vận chuyển</h3>
                <p>Giao hàng tận nơi</p>
            </div>
            <div>
                <h3>Phương thức thanh toán</h3>           
                <p>Thanh toán khi nhận hàng(COD)</p>
                <p>Tổng giá:</p>
                <input name="price" value="<%=nf.format(totalPrice)%>">
            </div>
            <div>
                <!--<input type="submit" class="submit" value="Hoàn tất đơn hàng">-->
                <button class="button" type="submit"><b>Hoàn tất đơn hàng</b></button>
                <button class="button"><a href="pageServlet">Tiếp tục mua sắm</a></button>

            </div>
        </form>
    </div>
    <div class="lephai"></div>
    <script>
            function validateForm() {
              // Lấy giá trị từ form
              var fullName = document.forms["myForm"]["fullName"].value;
              var email = document.forms["myForm"]["email"].value;
              var phone = document.forms["myForm"]["phone"].value;
              var phoneLength = phone.length;

              // Kiểm tra họ và tên
              if (fullName === "") {
                alert("Họ và tên không được để trống");
                return false;
              }

              // Kiểm tra email
              if (email === "" || !email.includes("@") || !email.includes(".")) {
                alert("Email không hợp lệ");
                return false;
              }

              // Kiểm tra số điện thoại
              if (phoneLength !== 10) {
                alert("Số điện thoại không hợp lệ");
                return false;
              }
              else {
                  alert("Đặt hàng thành công");
                  return true;
              }
            }
        </script>
</body>
</html>