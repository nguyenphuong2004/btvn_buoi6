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
public class Dog extends Animal {
     private String character;

    public Dog(String character) {
        this.character = character;
    }

    public Dog(String character, String name, byte age, float weight) {
        super(name, age, weight);
        this.character = character;
    }

    public Dog() {
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    @Override
    public void input(Scanner sc) {
        sc.nextLine();
        System.out.print("Nhap ten cho: ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi cua cho: ");
        age = sc.nextByte();
        System.out.print("Nhap can nang cua cho: ");
        weight = sc.nextFloat();
        sc.nextLine();
        System.out.print("Nhap tinh cach cho: ");
        this.character = sc.nextLine();
    }

    @Override
    public void output() {
        System.out.println("Ten cua cho la: " + this.name);
        System.out.println("Tuoi cua cho la: " + this.age);
        System.out.println("Can nang cua cho la: " + this.weight);
        System.out.println("Tinh cach cua cho la: " + this.character);
    }

    @Override
    public void tiengKeu() {
        System.out.println("Gau");
    }
}
