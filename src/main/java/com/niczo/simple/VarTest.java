package com.niczo.simple;

/**
 * Des:
 * Author:LiNic
 * Date:2018/5/27
 */
public class VarTest implements Test {
    @Override
    public void test() {
        (new GC(){
            void bar() {
                System.out.println("我是一个内部类");
            }

            @Override
            public void heihei() {
                System.out.println("heiheiheiVar");
                super.heihei();
            }
        }).heihei();
    }
}
