package com.niczo.simple;

import java.util.Arrays;
import java.util.Scanner;

import static com.niczo.simple.Measurable.average;
import static com.niczo.simple.Measurable.largest;

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

        Employee[] newArray = Arrays.stream(employees).sorted(Employee::getNames).toArray(Employee[]::new);
//        Employee[] newArray = Arrays.stream(employees).sorted((a,b) -> a.getName().length() - b.getName().length()).toArray(Employee[]::new);
        for (Employee o : newArray) {
            System.out.println(o.getName());
        }

        int n,m;
        Scanner scanner = new Scanner(System.in);
        /*while(true){
            n = scanner.nextInt();
            m = scanner.nextInt();

            int yu = n & m;
            int mod = n % (m+1);
            System.out.println("按位与运算:"+yu);
            System.out.println("取模运算:"+mod);
            System.out.println("结果:"+(yu == mod));
        }*/

    }

}
