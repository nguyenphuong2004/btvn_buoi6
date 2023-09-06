/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class HangHoa {

    protected String maHang;
    protected String tenHang;
    protected float soLuong;
    protected float donGia;
    protected VatLieu dsVL = new VatLieu();

    public HangHoa() {
    }

    public HangHoa(String maHang, String tenHang, float soLuong, float donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public VatLieu getDsVL() {
        return dsVL;
    }

    public void setDsVL(VatLieu dsVL) {
        this.dsVL = dsVL;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public void nhap(Scanner sc) {
        System.out.print("Nhap ma hang: ");
        maHang = sc.nextLine();
        System.out.print("Nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.print("Nhap so luong hang: ");
        soLuong = sc.nextFloat();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextFloat();
        dsVL.nhap(sc);
    }

    public void xuat() {
        System.out.println("Ma hang hoa: " + this.maHang);
        System.out.println("Ten hang hoa: " + this.tenHang);
        System.out.println("So luong: " + this.soLuong);
        System.out.println("Don gia: " + this.donGia);
        dsVL.xuat();
        System.out.println("Tong tien: " + tongTien());
    }

    public float tongTien() {
        return soLuong * donGia;
    }
}
