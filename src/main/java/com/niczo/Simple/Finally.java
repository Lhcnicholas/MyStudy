package com.niczo.Simple;

/**
 * DES:
 * PROJECT:MyStudy
 * Author:Li Nic
 * DATE:2017/7/31
 */
public class Finally {
    public static void main(String[] args) {
        System.out.println("return value of test(): " + test());
        System.out.println("return value of test1():" + test1());
    }

    private static int test() {
        int i = 1;

        if(i == 1)
            return 0;
        System.out.println("the previous statement of try block");
        i = i / 0;

        try {
            System.out.println("try block");
            return i;
        }finally {
            System.out.println("finally block");
        }
    }

    public static int test1() {
        int i = 1;

        try {
            System.out.println("try block");
            System.exit(0);
            return i;
        }finally {
            System.out.println("finally block");
        }
    }
}
