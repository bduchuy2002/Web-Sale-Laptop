/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author PC
 */
public class DanhMuc {
    private String ma_danh_muc;
    private String ten_danh_muc;
    private String Danh_muc_cha;

    public DanhMuc() {
    }

    public DanhMuc(String ma_danh_muc, String ten_danh_muc, String Danh_muc_cha) {
        this.ma_danh_muc = ma_danh_muc;
        this.ten_danh_muc = ten_danh_muc;
        this.Danh_muc_cha = Danh_muc_cha;
    }

    public String getMa_danh_muc() {
        return ma_danh_muc;
    }

    public void setMa_danh_muc(String ma_danh_muc) {
        this.ma_danh_muc = ma_danh_muc;
    }

    public String getTen_danh_muc() {
        return ten_danh_muc;
    }

    public void setTen_danh_muc(String ten_danh_muc) {
        this.ten_danh_muc = ten_danh_muc;
    }

    public String getDanh_muc_cha() {
        return Danh_muc_cha;
    }

    public void setDanh_muc_cha(String Danh_muc_cha) {
        this.Danh_muc_cha = Danh_muc_cha;
    }
    
}
