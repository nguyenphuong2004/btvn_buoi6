/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baii2;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hoc sinh: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<Student> st = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin hoc sinh thu " + (i + 1) + ": ");
            Student std = new Student();
            std.input(sc);
            st.add(std);
        }
        System.out.println("\n");
        System.out.println("Danh sach thong tin hoc sinh: ");
        int i = 1;
        for (Student a : st) {
            System.out.println(i + ".");
            a.output();
            i++;
        }

    }
}