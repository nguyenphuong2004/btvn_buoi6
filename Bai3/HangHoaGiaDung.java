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
public class HangHoaGiaDung extends HangHoa {

    private String chucNang;

    public HangHoaGiaDung() {
    }

    public HangHoaGiaDung(String chucNang) {
        this.chucNang = chucNang;
    }

    public HangHoaGiaDung(String chucNang, String maHang, String tenHang, float soLuong, float donGia) {
        super(maHang, tenHang, soLuong, donGia);
        this.chucNang = chucNang;
    }

    public String getChucNang() {
        return chucNang;
    }

    public void setChucNang(String chucNang) {
        this.chucNang = chucNang;
    }

    @Override
    public void nhap(Scanner sc) {
        System.out.print("Nhap ma hang hoa dan dung: ");
        maHang = sc.nextLine();
        System.out.print("Nhap ten hang hoa: ");
        tenHang = sc.nextLine();
        System.out.print("Nhap so luong: ");
        soLuong = sc.nextFloat();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextFloat();
        dsVL.nhap(sc);
        sc.nextLine();
        System.out.print("Chuc nang: ");
        chucNang = sc.nextLine();
    }

    @Override
    public void xuat() {
        System.out.println("Ma hang hoa: " + this.maHang);
        System.out.println("Ten hang hoa: " + this.tenHang);
        System.out.println("So luong: " + this.soLuong);
        System.out.println("Don gia: " + this.donGia);
        dsVL.xuat();
        System.out.println("Chuc nang: " + this.chucNang);
        System.out.println("Tong tien: " + tongTien());
    }
}