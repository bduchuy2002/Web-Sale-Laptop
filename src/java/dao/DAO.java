/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import databases.DBContext;
import entity.Category;
import entity.Product;
import entity.TaiKhoan;
import entity.comment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author trinh
 */
public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    // DAO COMMENTS
    public List<comment> getAllcomment() {
        List<comment> list = new ArrayList<>();
        String query = "select * from comment";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new comment(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    /*
    comment_id
    user_id
    product_id
    comment_content
     */
    public void insertComment(String username, String content) {
        String query = "INSERT INTO comment (username, content) VALUES (?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, content);

            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    /*DAO ORDER */
    public void insertOders(String fullname, String email, String phone, String address, String price ) {
        String query = "INSERT INTO donhang (fullname, email, phone, address, price) VALUES (?,?,?,?,?)";
        
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, fullname);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setString(4, address);
            ps.setString(5, price);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    /*DAO ADMIN*/

    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * FROM Products ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getInt(8)));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        String query = "SELECT * FROM Categories";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Product> getProductByCID(String cid) {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * FROM Products WHERE category_id=?;";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getInt(8)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Category getCategoryByCID(String cid) {
        String query = "SELECT * FROM Categories WHERE category_id=?;";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Category(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Product getProductByID(String pid) {
        String query = "SELECT * FROM Products WHERE product_id=?;";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getInt(8));

            }
        } catch (Exception e) {
        }
        return null;
    }

    public void deleteProduct(String pid) {
        String query = "DELETE FROM Products WHERE product_id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void insertProduct(String pid, String cid, String pname, String pimage, int quantity, int price, int price_sale, int sale, String mo_ta) {
        String query = "INSERT INTO Products (product_id, category_id, product_name, img_url,quantity, price,don_gia_giam, giam_gia, mo_ta) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            ps.setString(2, cid);
            ps.setString(3, pname);
            ps.setString(4, pimage);
            ps.setInt(5, quantity);
            ps.setInt(6, price);           
            ps.setInt(7, price_sale);           
            ps.setInt(8, sale);           
            ps.setString(9, mo_ta);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void editProduct(String pid, String cid, String pname, String pimage, int quantity, int price, int price_sale, int sale) {
        String query = "UPDATE Products SET product_name=?,img_url= ?,price=?,don_gia_giam=?,giam_gia=?,quantity=? WHERE product_id=?";

        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pname);
            ps.setString(2, pimage);
            ps.setInt(3, price);
            ps.setInt(4, price_sale);
            ps.setInt(5, sale);
            ps.setInt(6, quantity);
            ps.setString(7, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    
    //    ------------------DAO USER---------------------
    public TaiKhoan login(String email, String password){
        String query ="SELECT * FROM Users WHERE email=? AND password =?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, password);
            rs = ps.executeQuery();
           while (rs.next()) {
                return new TaiKhoan(rs.getInt(1), 
                        rs.getString(2), 
                        rs.getString(3), 
                        rs.getString(4), 
                        rs.getString(5), 
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(8));
            }
            
        } catch (Exception e) {
        }
        return null;
    }
  
}


//      // DAO PRODUCT
//       
//    public ArrayList<SanPham> getChiTietSanPham(String ma_san_pham) throws Exception {
//        
//        
//        String sql="SELECT * FROM Products WHERE product_id = '"+ma_san_pham+"'";
//        ArrayList<SanPham> arr = new ArrayList<>(); 
//        
//        try {
//            conn = new DBContext().getConnection();//mo ket noi voi sql
//            ps = conn.prepareStatement(sql);
//            rs = ps.executeQuery();
//           
//            while(rs.next()){
//                SanPham sp = new SanPham();
//                sp.setMa_san_pham(rs.getString("product_id"));
//                DanhMuc dm=new DanhMuc(rs.getString("category_id"),"","");
//                sp.setDanh_muc(dm);
//                sp.setTen_san_pham(rs.getString("product_name"));
//                sp.setHinh_anh(rs.getString("img_url"));
//                sp.setSo_luong(rs.getInt("quantity"));
//                sp.setMo_ta(rs.getString("mo_ta"));
//                sp.setDon_gia(rs.getString("price"));
//                sp.setDon_gia_giam(rs.getString("don_gia_giam"));
//                sp.setGiam_gia(rs.getInt("giam_gia"));
//                arr.add(sp);
//            }
//            
//        } catch (SQLException ex) {
//            
//        }
//        return arr;
//    
//    }
//    
//    public ArrayList<SanPham> getListProductByCategory(String ma_danh_muc) throws Exception {
////        Connection cons = DBContext.getConnection();
//        String sql="SELECT * FROM Products WHERE category_id ='"+ma_danh_muc+"' ";
//        ArrayList<SanPham> arr = new ArrayList<>(); 
//        try {
////            PreparedStatement ps = cons.prepareStatement(sql);
////            ResultSet rs = ps.executeQuery();
//            conn = new DBContext().getConnection();//mo ket noi voi sql
//            ps = conn.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while(rs.next()){
//                SanPham sp = new SanPham();
//                sp.setMa_san_pham(rs.getString("ma_san_pham"));
//                DanhMuc dm = new DanhMuc(rs.getString("ma_danh_muc"),"","");
//                sp.setDanh_muc(dm);
//                sp.setTen_san_pham(rs.getString("ten_san_pham"));
//                sp.setHinh_anh(rs.getString("hinh_anh"));
//                sp.setSo_luong(rs.getInt("so_luong"));
//                sp.setMo_ta(rs.getString("mo_ta"));
//                sp.setDon_gia(rs.getString("don_gia"));
//                sp.setDon_gia_giam(rs.getString("don_gia_giam"));
//                sp.setGiam_gia(rs.getInt("giam_gia"));
//                arr.add(sp);
//                
//            }
//            
//        } catch (SQLException ex) {
////            Logger.getLogger(ProductDAOImp1.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return arr;
//    } 
// DAO DANHMUC
//    public ArrayList<DanhMuc> getListDanhMucCha() throws Exception {
////        Connection connection = DBContext.getConnection();
//        String sql="SELECT * FROM Categories WHERE category_father=''";
//        ArrayList<DanhMuc> arr = new ArrayList<>();
//        
//        try {
////            PreparedStatement ps =connection.prepareStatement(sql);
////            ResultSet rs = ps.executeQuery();
//            conn = new DBContext().getConnection();//mo ket noi voi sql
//            ps = conn.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while(rs.next()){
//            DanhMuc dm = new DanhMuc();
//            dm.setMa_danh_muc(rs.getString("ma_danh_muc"));
//            dm.setTen_danh_muc(rs.getString("ten_danh_muc"));
//            dm.setDanh_muc_cha(rs.getString("danh_muc_cha"));
//            arr.add(dm);
//            
//            
//        }
//            
//        } catch (SQLException ex) {
////            Logger.getLogger(DanhMucDaoImp1.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return arr;
//    }
//
//    
//    public ArrayList<DanhMuc> getListDanhMucCon(String ma_danh_muc) throws Exception {
////        Connection connection = DBContext.getConnection();
//        String sql="SELECT * FROM Categories WHERE category_father='"+ma_danh_muc+"'";
//        ArrayList<DanhMuc> arr = new ArrayList<>();
//        
//        try {
////            PreparedStatement ps =connection.prepareStatement(sql);
////            ResultSet rs = ps.executeQuery();
//            conn = new DBContext().getConnection();//mo ket noi voi sql
//            ps = conn.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while(rs.next()){
//            DanhMuc dm = new DanhMuc();
//            dm.setMa_danh_muc(rs.getString("ma_danh_muc"));
//            dm.setTen_danh_muc(rs.getString("ten_danh_muc"));
//            dm.setDanh_muc_cha(rs.getString("danh_muc_cha"));
//            arr.add(dm);
//            
//            
//        }
//            
//            
//        } catch (SQLException ex) {
////            Logger.getLogger(DanhMucDaoImp1.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return arr;
//    }
//}

