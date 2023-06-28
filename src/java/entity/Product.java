/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.text.NumberFormat;

/**
 *
 * @author ADMIN
 */
public class Product {

    private String pid;
    private String cid;
    private String pname;
    private String pimage;
    private int price;
    private int price_sale;
    private int sale;
    private int quantity;

    public Product() {
    }

    public Product(String pid, String cid, String pname, String pimage, int quantity, int price, int price_sale, int sale) {
        this.pid = pid;
        this.cid = cid;
        this.pname = pname;
        this.pimage = pimage;
        this.price = price;
        this.price_sale = price_sale;
        this.sale = sale;
        this.quantity = quantity;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPimage() {
        return pimage;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage;
    }

    public String getPrice() {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumIntegerDigits(0);
        return nf.format(price);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPrice_sale() {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumIntegerDigits(0);
        return nf.format(price_sale);
    }

    public void setPrice_sale(int price_sale) {
        this.price_sale = price_sale;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "pid=" + pid + ", cid=" + cid + ", pname=" + pname + ", pimage=" + pimage + ", price=" + price + ", price_sale=" + price_sale + ", sale=" + sale +  ", quantity=" + quantity + '}';
    }

}
