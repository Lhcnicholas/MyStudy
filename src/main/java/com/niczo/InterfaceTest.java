package com.niczo;

/**
 * DES:
 * PROJECT:MyStudy
 * Author:Li Nic
 * DATE:2017/8/9
 */
public interface InterfaceTest {

    String i = "hahah";

    static String hello(){
        return "你好,我是Nic!";
    }

    default double random(){
        return Math.random();
    }
}
