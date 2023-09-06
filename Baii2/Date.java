/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baii2;
import java.util.*;

/**
 *
 * @author nguye
 */
public class Date {
     private int year;
    private byte month;
    private byte day;

    public Date() {
    }

    public Date(int year, byte month, byte day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public byte getMonth() {
        return month;
    }

    public void setMonth(byte month) {
        this.month = month;
    }

    public byte getDay() {
        return day;
    }

    public void setDay(byte day) {
        this.day = day;
    }

    public void input(Scanner sc) {
        System.out.print("Nhap nam: ");
        year = sc.nextInt();
        System.out.print("Nhap thang: ");
        month = sc.nextByte();
        System.out.print("Nhap ngay: ");
        day = sc.nextByte();
    }

    public void output() {
        System.out.println("Ngay " + this.day + " thang " + this.month + " nam " + this.year);
    }
}
