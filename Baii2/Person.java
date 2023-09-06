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
public class Person {
    protected String name;
    protected byte age;
    protected String address;
    protected Date birthDay = new Date();

    public Person() {
    }

    public Person(String name, byte age, String address, Date birthDay) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.birthDay = birthDay;
    }
    
    public void input(Scanner sc){
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        age = sc.nextByte();
        sc.nextLine();
        System.out.print("Nhap dia chi: ");
        address = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        birthDay.input(sc);
    }
    
    public void output(){
        System.out.println("Ten: "+this.name);
        System.out.println("Tuoi: "+ this.age);
        System.out.println("Dia chi: "+this.address);
        System.out.print("Sinh nhat: ");
        birthDay.output();
    }
}
