package com.niczo;

import static com.niczo.Measurable.average;
import static com.niczo.Measurable.largest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
//        System.out.println( "Hello World!" );

        Employee[] employees = new Employee[3];
        employees[0] = new Employee(2000,20,"nic");
        employees[1] = new Employee(3000,25,"li");
        employees[2] = new Employee(9999,30,"hah");
        System.out.println(average(employees));
        System.out.println(((Employee)largest(employees)).getName());
    }

}
