package com.niczo.Simple;

/**
 * Des:
 * Author:LiNic
 * Date:2018/5/27
 */
public class MainTest {
    public static void main(String[] args) {
        testMethod(new VarTest());
    }


    public static void testMethod(Test test){
        test.test();
    }
}