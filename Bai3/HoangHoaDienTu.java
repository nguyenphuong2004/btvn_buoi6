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
public class HoangHoaDienTu extends HangHoa {

    private int thoiGianBaoHanh;
    private int congSuat;

    public HoangHoaDienTu() {
    }

    public HoangHoaDienTu(int thoiGianBaoHanh, int congSuat) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
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
        System.out.print("Thoi gian bao hanh: ");
        thoiGianBaoHanh = sc.nextInt();
        System.out.print("Cong suat: ");
        congSuat = sc.nextInt();
    }

    @Override
    public void xuat() {
        System.out.println("Ma hang hoa: " + this.maHang);
        System.out.println("Ten hang hoa: " + this.tenHang);
        System.out.println("So luong: " + this.soLuong);
        System.out.println("Don gia: " + this.donGia);
        dsVL.xuat();
        System.out.println("Thoi gian bao hanh: " + this.thoiGianBaoHanh);
        System.out.println("Cong suat: " + this.congSuat);
        System.out.println("Tong tien: " + tongTien());
    }
}
