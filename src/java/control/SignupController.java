package control;

import databases.DBContext;
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
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SignupController", urlPatterns = ("/signup"))
public class SignupController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String password = request.getParameter("password");

            if (firstname != null && !firstname.isEmpty() && lastname != null && !lastname.isEmpty()
                    && email != null && !email.isEmpty() && password != null && !password.isEmpty() && phone != null && !phone.isEmpty()) {
                if (registerUser(firstname, lastname, phone, email, password)) {
//                    out.println("Đăng ký thành công");
                
                response.sendRedirect("pageServlet");
                
                } else {
                    out.println("Lỗi khi đăng ký");
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
            Logger.getLogger(SignupController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private boolean isEmailExists(Connection connection, String email) throws SQLException {
        String selectQuery = "SELECT * FROM Users WHERE email = ?";
        PreparedStatement statement = connection.prepareStatement(selectQuery);
        statement.setString(1, email);
        ResultSet resultSet = statement.executeQuery();
        return resultSet.next();
    }

    private boolean registerUser(String firstname, String lastname, String phone, String email, String password) throws Exception {
         Connection conn = null;
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            if (conn!= null) {
                if (isEmailExists(conn, email)) {
                    System.out.println("Email đã tồn tại");
                    return false;
                }
                String insertQuery = "INSERT INTO Users (user_id, firstname, lastname, email, phone_number, password, role) VALUES (?,?, ?, ?, ?, ?,0)";
                PreparedStatement statement = conn.prepareStatement(insertQuery);
                // Tạo một đối tượng Random
                Random random = new Random();

                // Tạo một số nguyên ngẫu nhiên trong khoảng từ 0 đến 100
                int randomNumber = random.nextInt(101);

                statement.setInt(1,randomNumber);
                statement.setString(2, firstname);
                statement.setString(3, lastname);
                statement.setString(4, email);
                statement.setString(5, phone);
                statement.setString(6, password);
                
                statement.executeUpdate();
                return true;
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
