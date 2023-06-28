/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import entity.DanhMuc;

/**
 *
 * @author PC
 */
public interface DanhMucDao {
    public ArrayList<DanhMuc> getListDanhMucCha();
    public ArrayList<DanhMuc> getListDanhMucCon(String ma_danh_muc);
}
