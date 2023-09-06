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
public class VatLieu {

    private String ten;
    private String mauSac;
    private int doCung;

    public VatLieu() {
    }

    public VatLieu(String ten, String mauSac, int doCung) {
        this.ten = ten;
        this.mauSac = mauSac;
        this.doCung = doCung;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getDoCung() {
        return doCung;
    }

    public void setDoCung(int doCung) {
        this.doCung = doCung;
    }

    public void nhap(Scanner sc) {
        sc.nextLine();
        System.out.print("Nhap ten vat lieu: ");
        ten = sc.nextLine();
        System.out.print("Nhap mau sac vat lieu: ");
        mauSac = sc.nextLine();
        System.out.print("Nhap do cung vat lieu: ");
        doCung = sc.nextInt();
    }

    public void xuat() {
        System.out.println("Ten vat lieu la: " + this.ten);
        System.out.println("Mau sac: " + this.mauSac);
        System.out.println("Do cung: " + this.doCung);
    }
}