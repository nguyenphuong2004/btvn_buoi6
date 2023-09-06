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
public class Animal {
     protected String name;
    protected byte age;
    protected float weight;

    public Animal() {
    }

    public Animal(String name, byte age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void input(Scanner sc) {
        System.out.print("Nhap ten: ");
        this.name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        this.age = sc.nextByte();
        System.out.print("Nhap can nang: ");
        this.weight = sc.nextFloat();
    }

    public void output() {
        System.out.println("Ten la: " + this.name);
        System.out.println("Tuoi la: " + this.age);
        System.out.println("Can nang la: " + this.weight);
    }

    public void tiengKeu() {

    }
}

