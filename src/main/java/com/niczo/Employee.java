package com.niczo;

import java.io.Serializable;

/**
 * DES:
 * PROJECT:MyStudy
 * Author:Li Nic
 * DATE:2017/8/10
 */
public class Employee implements Measurable,Serializable{

    private static final long serialVersionUID = -629967144282051377L;
    private double salary;
    private int age;
    private String name;


    public Employee(double salary, int age, String name) {
        this.salary = salary;
        this.age = age;
        this.name = name;
    }

    @Override
    public double getMeasure() {
        return getSalary();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
