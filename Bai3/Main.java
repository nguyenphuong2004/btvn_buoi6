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
public class Main {

    public static void main(String[] args) {
        System.out.println("1.Hang hoa gia dung");
        System.out.println("2. Hang hoa dien tu");
        System.out.println("Nhap 1 hoac 2");
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            chon = sc.nextInt();
        } while (chon != 1 && chon != 2);
        if (chon == 1) {
            System.out.print("Nhap so luong hang hoa: ");
            int n = sc.nextInt();
            sc.nextLine();
            List<HangHoaGiaDung> h = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                System.out.println("Nhap thong tin hang hoa thu " + (i + 1) + ": ");
                HangHoaGiaDung hh = new HangHoaGiaDung();
                hh.nhap(sc);
                h.add(hh);
            }
            System.out.println("\n");
            System.out.println("Danh sach thong tin hang hoa: ");
            int i = 1;
            for (HangHoaGiaDung a : h) {
                System.out.println(i + ".");
                a.xuat();
                i++;
            }
        } else {
            System.out.print("Nhap so luong hang hoa: ");
            int n = sc.nextInt();
            sc.nextLine();
            List<HoangHoaDienTu> h = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                System.out.println("Nhap thong tin hang hoa thu " + (i + 1) + ": ");
                HoangHoaDienTu hh = new HoangHoaDienTu();
                hh.nhap(sc);
                h.add(hh);
            }
            System.out.println("\n");
            System.out.println("Danh sach thong tin hang hoa: ");
            int i = 1;
            for (HoangHoaDienTu a : h) {
                System.out.println(i + ".");
                a.xuat();
                i++;
            }
        }
    }
}
