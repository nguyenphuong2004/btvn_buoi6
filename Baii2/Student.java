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
public class Student  extends Person{
      private String id;
    private String Class;
    private String school;

    public Student() {
    }

    public Student(String id, String Class, String school) {
        this.id = id;
        this.Class = Class;
        this.school = school;
    }

    public Student(String id, String Class, String school, String name, byte age, String address, Baii2.Date birthDay) {
        super(name, age, address, birthDay);
        this.id = id;
        this.Class = Class;
        this.school = school;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return this.Class;
    }

    public void setClass(String Class) {
        this.Class = Class;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void input(Scanner sc) {
        System.out.print("Nhap ten hoc sinh: ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi hoc sinh: ");
        age = sc.nextByte();
        sc.nextLine();
        System.out.print("Nhap dia chi hoc sinh: ");
        address = sc.nextLine();
        System.out.println("Nhap ngay sinh hoc sinh: ");
        birthDay.input(sc);
        sc.nextLine();
        System.out.print("Nhap id hoc sinh: ");
        id = sc.nextLine();
        System.out.print("Nhap lop hoc hoc sinh: ");
        Class = sc.nextLine();
        System.out.print("Nhap truong cua hoc sinh: ");
        school = sc.nextLine();
    }

    @Override
    public void output() {
        System.out.println("Ten hoc sinh: " + this.name);
        System.out.println("Tuoi: " + this.age);
        System.out.println("Dia chi: " + this.address);
        System.out.print("Sinh nhat: ");
        birthDay.output();
        System.out.println("id: " + this.id);
        System.out.println("Truong: " + this.school);
        System.out.println("Lop: " + this.Class);
    }
}
