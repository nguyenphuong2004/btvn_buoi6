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
public class Cat extends Animal{
      private String color;
    private String preferences;
    private String ownerName;

    public Cat() {
    }

    public Cat(String color, String preferences, String ownerName) {
        this.color = color;
        this.preferences = preferences;
        this.ownerName = ownerName;
    }

    public Cat(String color, String preferences, String ownerName, String name, byte age, float weight) {
        super(name, age, weight);
        this.color = color;
        this.preferences = preferences;
        this.ownerName = ownerName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void input(Scanner sc) {
        sc.nextLine();
        System.out.print("Nhap ten meo: ");
        name = sc.nextLine();;
        System.out.print("Nhap tuoi cua meo: ");
        age = sc.nextByte();
        System.out.print("Nhap can nang cua meo: ");
        weight = sc.nextFloat();
        sc.nextLine();
        System.out.print("Nhap mau cua meo: ");
        this.color = sc.nextLine();
        System.out.print("Nhap mo ta meo: ");
        this.preferences = sc.nextLine();
        System.out.print("Nhap ten chu cua meo: ");
        this.ownerName = sc.nextLine();
    }

    @Override
    public void output() {
        System.out.println("Ten cua meo la: " + this.name);
        System.out.println("Tuoi cua meo la: " + this.age);
        System.out.println("Can nang cua meo la: " + this.weight);
        System.out.println("Mau cua meo la: " + this.color);
        System.out.println("Hinh dang cua meo la: " + this.preferences);
        System.out.println("Ten chu cau meo: " + this.ownerName);
    }

    @Override
    public void tiengKeu() {
        System.out.println("Meo");
    }
}

