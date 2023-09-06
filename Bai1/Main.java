/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;
import java.util.*;

/**
 *
 * @author nguye
 */
public class Main {
     public static void main(String[] args) {
        System.out.println("1.Cho");
        System.out.println("2. Meo");
        System.out.println("Nhap 1 hoac 2");
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            chon = sc.nextInt();
        } while (chon != 1 && chon != 2);
        if (chon == 1) {
            Dog cho = new Dog();
            cho.input(sc);
            cho.output();
            cho.tiengKeu();
        } else {
            Cat meo = new Cat();
            meo.input(sc);
            meo.output();
            meo.tiengKeu();
        }
    }
}
