package com.niczo.simple;

/**
 * DES:
 * PROJECT:MyStudy
 * Author:Li Nic
 * DATE:2017/7/31
 */
public class Finally {
    public static void main(String[] args) {
        System.out.println("return value of test(): " + test());
        //System.out.println("return value of test1():" + test1());
//        test2();
    }

    private static int test() {
        int i = 1;
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

    public static void test2() {
        try {
            System.out.println("测试开始");
            throw new RuntimeException("测试异常");
        } catch (Exception e) {
            throw new RuntimeException("catch后继续抛出异常");
        } finally {
            System.out.println("finally执行代码");
        }
    }
}