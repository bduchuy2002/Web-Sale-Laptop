/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package control;

import dao.DAO;
import databases.DBContext;
import entity.TaiKhoan;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.reflect.Array.get;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;

/**
 *
 * @author admin
 */
@WebServlet(name = "LoginController", urlPatterns = ("/login"))
public class LoginController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            // DAO phân quyền
            DAO dao = new DAO();
            TaiKhoan u = dao.login(email, password);
            
            
            // Kiểm tra tính hợp lệ của dữ liệu
            if (email != null && !email.isEmpty() && password != null && !password.isEmpty()) {
                // Thực hiện đăng nhập
                if (authenticateUser(email, password)) {
//                    out.println("Đăng nhập thành công");
//                    out.println("<br>");
//                    out.println("<a href=\"index.jsp\"><button>Quay về trang chủ</button></a>");
                HttpSession session = request.getSession();
                session.setAttribute("email", email);
                session.setAttribute("user", u);
                response.sendRedirect("pageServlet");
                } else {
                    out.println("Email hoặc mật khẩu không chính xác");
                }
            } else {
                out.println("Bạn cần nhập đầy đủ thông tin");
            }
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean authenticateUser(String email, String password) throws Exception {
        Connection conn = null;
        
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            if (conn != null) {
                // Tạo câu lệnh SELECT để kiểm tra đăng nhập
                String selectQuery = "SELECT * FROM Users WHERE email = ? AND password = ?";

                // Tạo PreparedStatement và thiết lập giá trị
                PreparedStatement statement = conn.prepareStatement(selectQuery);
                statement.setString(1, email);
                statement.setString(2, password);

                // Thực hiện câu lệnh SELECT
                ResultSet resultSet = statement.executeQuery();
                
                // Kiểm tra kết quả của câu lệnh SELECT
                if (resultSet.next()) {
                    // Tồn tại người dùng với email và mật khẩu đúng, đăng nhập thành công
                    return true;
                }
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
