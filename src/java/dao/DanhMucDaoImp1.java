/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

//import com.mysql.jdbc.Connection;
import databases.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import entity.DanhMuc;
import java.sql.Connection;

/**
 *
 * @author PC
 */
public class DanhMucDaoImp1 implements DanhMucDao{
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    @Override
    public ArrayList<DanhMuc> getListDanhMucCha() {
//        Connection connection = DBConnect.getConnection();
        String sql="SELECT * FROM Categories WHERE category_father=''";
        ArrayList<DanhMuc> arr = new ArrayList<>();
        
        try {
//            PreparedStatement ps =connection.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
            DanhMuc dm = new DanhMuc();
            dm.setMa_danh_muc(rs.getString("category_id"));
            dm.setTen_danh_muc(rs.getString("category_name"));
            dm.setDanh_muc_cha(rs.getString("category_father"));
            arr.add(dm);
            
            
        }
            
        } catch (Exception ex) {
//            Logger.getLogger(DanhMucDaoImp1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }

    @Override
    public ArrayList<DanhMuc> getListDanhMucCon(String ma_danh_muc) {
//        Connection connection = DBConnect.getConnection();
        String sql="SELECT * FROM Categories WHERE category_father='"+ma_danh_muc+"'";
        ArrayList<DanhMuc> arr = new ArrayList<>();
        
        try {
//            PreparedStatement ps =connection.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
            DanhMuc dm = new DanhMuc();
            dm.setMa_danh_muc(rs.getString("category_id"));
            dm.setTen_danh_muc(rs.getString("category_name"));
            dm.setDanh_muc_cha(rs.getString("category_father"));
            arr.add(dm);
            
            
        }
            
            
        } catch (Exception ex) {
//            Logger.getLogger(DanhMucDaoImp1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
    
    
}
