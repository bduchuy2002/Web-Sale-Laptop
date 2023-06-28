/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import entity.SanPham;

/**
 *
 * @author PC
 */
public interface ProductDAO {
    public ArrayList<SanPham> getListProductByCategory(String ma_danh_muc);
    public ArrayList<SanPham> getChiTietSanPham(String ma_san_pham);
    public ArrayList<SanPham> getALL();
    public SanPham getChiTietSanPham1(String ma_san_pham);
    public ArrayList<SanPham> searchByName(String txtSearch);
    public ArrayList<SanPham> searchByNameThuongHieu(String txtSearch , String ma_danh_muc);
    public int getNumberPage();
    public ArrayList<SanPham> getPageProDuct(int index);
}
