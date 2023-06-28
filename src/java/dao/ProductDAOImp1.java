/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import databases.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import entity.DanhMuc;
import entity.SanPham;
import java.sql.Connection;

/**
 *
 * @author PC
 */
public class ProductDAOImp1 implements ProductDAO{
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    @Override
    public ArrayList<SanPham> getListProductByCategory(String ma_danh_muc) {
//        Connection cons = DBContext.getConnection();
        String sql="SELECT * FROM Products WHERE category_id ='"+ma_danh_muc+"' ";
        ArrayList<SanPham> arr = new ArrayList<>(); 
        try {
//            PreparedStatement ps = cons.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                SanPham sp = new SanPham();
                sp.setMa_san_pham(rs.getString("product_id"));
                DanhMuc dm=new DanhMuc(rs.getString("category_id"),"","");
                sp.setDanh_muc(dm);
                sp.setTen_san_pham(rs.getString("product_name"));
                sp.setHinh_anh(rs.getString("img_url"));
                sp.setSo_luong(rs.getInt("quantity"));
                sp.setMo_ta(rs.getString("mo_ta"));
                sp.setDon_gia(rs.getDouble("price"));
                sp.setDon_gia_giam(rs.getDouble("don_gia_giam"));
                sp.setGiam_gia(rs.getInt("giam_gia"));
                arr.add(sp);
                
            }
            
        } catch (Exception ex) {
            
        }
        return arr;
    } 

    
    @Override
    public ArrayList<SanPham> getChiTietSanPham(String ma_san_pham) {
        
//        Connection cons = DBContext.getConnection();
        String sql="SELECT * FROM Products WHERE product_id = '"+ma_san_pham+"'";
        ArrayList<SanPham> arr = new ArrayList<>(); 
        
        try {
//            PreparedStatement ps = cons.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                SanPham sp = new SanPham();
                sp.setMa_san_pham(rs.getString("product_id"));
                DanhMuc dm=new DanhMuc(rs.getString("category_id"),"","");
                sp.setDanh_muc(dm);
                sp.setTen_san_pham(rs.getString("product_name"));
                sp.setHinh_anh(rs.getString("img_url"));
                sp.setSo_luong(rs.getInt("quantity"));
                sp.setMo_ta(rs.getString("mo_ta"));
                sp.setDon_gia(rs.getDouble("price"));
                sp.setDon_gia_giam(rs.getDouble("don_gia_giam"));
                sp.setGiam_gia(rs.getInt("giam_gia"));
                arr.add(sp);
                
            }
            
        } catch (Exception ex) {
             
        }
        return arr;
    
    }
    
    @Override
    public SanPham getChiTietSanPham1(String ma_san_pham) {
//        Connection cons = DBContext.getConnection();
        String sql="SELECT * FROM Products WHERE product_id = '"+ma_san_pham+"'";
        SanPham sp = new SanPham();
        try {
//            PreparedStatement ps = cons.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                sp.setMa_san_pham(rs.getString("product_id"));
                DanhMuc dm=new DanhMuc(rs.getString("category_id"),"","");
                sp.setDanh_muc(dm);
                sp.setTen_san_pham(rs.getString("product_name"));
                sp.setHinh_anh(rs.getString("img_url"));
                sp.setSo_luong(rs.getInt("quantity"));
                sp.setMo_ta(rs.getString("mo_ta"));
                sp.setDon_gia(rs.getDouble("price"));
                sp.setDon_gia_giam(rs.getDouble("don_gia_giam"));
                sp.setGiam_gia(rs.getInt("giam_gia"));
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAOImp1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ProductDAOImp1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sp;
    }

    
    @Override
    public ArrayList<SanPham> searchByName(String txtSearch)  {
//        Connection cons = DBContext.getConnection();
        String sql="SELECT * FROM Products WHERE [product_name] LIKE ? ";
        ArrayList<SanPham> arr = new ArrayList<>(); 
        
        try {
//            PreparedStatement ps = cons.prepareStatement(sql);
//            ps.setString(1,"%" + txtSearch + "%");
//            ResultSet rs = ps.executeQuery();
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            ps.setString(1,"%'" + txtSearch + "'%");
            rs = ps.executeQuery();
           
            while(rs.next()){
                SanPham sp = new SanPham();
                sp.setMa_san_pham(rs.getString("product_id"));
                DanhMuc dm=new DanhMuc(rs.getString("category_id"),"","");
                sp.setDanh_muc(dm);
                sp.setTen_san_pham(rs.getString("product_name"));
                sp.setHinh_anh(rs.getString("img_url"));
                sp.setSo_luong(rs.getInt("quantity"));
                sp.setMo_ta(rs.getString("mo_ta"));
                sp.setDon_gia(rs.getDouble("don_gia"));
                sp.setDon_gia_giam(rs.getDouble("don_gia_giam"));
                sp.setGiam_gia(rs.getInt("giam_gia"));
                
            }
            
        } catch (SQLException ex) {
             Logger.getLogger(ProductDAOImp1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ProductDAOImp1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }

    
    @Override
    public ArrayList<SanPham> getALL()  {
//         Connection cons = DBContext.getConnection();
        String sql="SELECT * FROM Products ";
        ArrayList<SanPham> arr = new ArrayList<>(); 
        
        try {
//            PreparedStatement ps = cons.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//           
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                SanPham sp = new SanPham();
                sp.setMa_san_pham(rs.getString("product_id"));
                DanhMuc dm=new DanhMuc(rs.getString("category_id"),"","");
                sp.setDanh_muc(dm);
                sp.setTen_san_pham(rs.getString("product_name"));
                sp.setHinh_anh(rs.getString("img_url"));
                sp.setSo_luong(rs.getInt("quantity"));
                sp.setMo_ta(rs.getString("mo_ta"));
                sp.setDon_gia(rs.getDouble("price"));
                sp.setDon_gia_giam(rs.getDouble("don_gia_giam"));
                sp.setGiam_gia(rs.getInt("giam_gia"));
                arr.add(sp);
                
            }
            
        } catch (SQLException ex) {
             Logger.getLogger(ProductDAOImp1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ProductDAOImp1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }

    
    @Override
    public ArrayList<SanPham> searchByNameThuongHieu(String txtSearch , String ma_danh_muc) {
//        Connection cons = DBContext.getConnection();
        String sql="SELECT * FROM Products WHERE product_name LIKE ? and category_id =?";
        ArrayList<SanPham> arr = new ArrayList<>(); 
        
        try {
//            PreparedStatement ps = cons.prepareStatement(sql);
//            ps.setString(1,"%" + txtSearch + "%");
//            ps.setString(2,ma_danh_muc);
//            ResultSet rs = ps.executeQuery();
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            ps.setString(1,"%" + txtSearch + "%");
            ps.setString(2,ma_danh_muc);
            rs = ps.executeQuery();
            while(rs.next()){
                SanPham sp = new SanPham();
                sp.setMa_san_pham(rs.getString("product_id"));
                DanhMuc dm=new DanhMuc(rs.getString("category_id"),"","");
                sp.setDanh_muc(dm);
                sp.setTen_san_pham(rs.getString("product_name"));
                sp.setHinh_anh(rs.getString("img_url"));
                sp.setSo_luong(rs.getInt("quantity"));
                sp.setMo_ta(rs.getString("mo_ta"));
                sp.setDon_gia(rs.getDouble("price"));
                sp.setDon_gia_giam(rs.getDouble("don_gia_giam"));
                sp.setGiam_gia(rs.getInt("giam_gia"));
                arr.add(sp);
                
            }
            
        } catch (SQLException ex) {
             Logger.getLogger(ProductDAOImp1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ProductDAOImp1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }

    
    @Override
    public int getNumberPage()  {
//        Connection cons = DBContext.getConnection();
        String sql = "SELECT count(*) FROM Products";
        
        
        try {
//            PreparedStatement ps = cons.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
             conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                int total = rs.getInt(1);
                int countPage = 0;
                countPage = total/16;
                if(total % 16  !=0){
                    countPage++;
                }
                return countPage;
                
            }
            
        } catch (SQLException ex) {
             Logger.getLogger(ProductDAOImp1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ProductDAOImp1.class.getName()).log(Level.SEVERE, null, ex);
        }
       return 0;
    }

    
    @Override
    public ArrayList<SanPham> getPageProDuct(int index)  {
//      Connection cons = DBContext.getConnection();
        String sql="SELECT * FROM Products ORDER BY product_id OFFSET ? ROWS FETCH NEXT 8 ROWS ONLY";
        ArrayList<SanPham> arr = new ArrayList<>(); 
        
        try {
//            PreparedStatement ps = cons.prepareStatement(sql);
//            ps.setInt(1,(index-1) * 8);
//            
//            ResultSet rs = ps.executeQuery();
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            ps.setInt(1,(index-1) * 8);            
            rs = ps.executeQuery();
            while(rs.next()){
                SanPham sp = new SanPham();
                sp.setMa_san_pham(rs.getString("product_id"));
                DanhMuc dm=new DanhMuc(rs.getString("category_id"),"","");
                sp.setDanh_muc(dm);
                sp.setTen_san_pham(rs.getString("product_name"));
                sp.setHinh_anh(rs.getString("img_url"));
                sp.setSo_luong(rs.getInt("quantity"));
                sp.setMo_ta(rs.getString("mo_ta"));
                sp.setDon_gia(rs.getDouble("price"));
                sp.setDon_gia_giam(rs.getDouble("don_gia_giam"));
                sp.setGiam_gia(rs.getInt("giam_gia"));
                arr.add(sp);
                
            }
            
        } catch (SQLException ex) {
             Logger.getLogger(ProductDAOImp1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ProductDAOImp1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;       
    }
    
}

