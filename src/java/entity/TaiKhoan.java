/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class TaiKhoan {
    private int uid;
    private String fname;
    private String lname;
    private String email;
    private String phone;
    private String password;
    private int isAdmin;
    private String address;

    public TaiKhoan() {
    }

    public TaiKhoan(int uid, String fname, String lname, String email, String phone, String password, int isAdmin, String address) {
        this.uid = uid;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.isAdmin = isAdmin;
        this.address = address;
    }

    

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "uid=" + uid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", phone=" + phone + ", password=" + password + ", isAdmin=" + isAdmin + ", address=" + address + '}';
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    


}
