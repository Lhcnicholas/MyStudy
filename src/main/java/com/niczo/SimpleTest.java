package com.niczo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * DES:
 * PROJECT:MyStudy
 * Author:Li Nic
 * DATE:2017/8/9
 */
public class SimpleTest {
    public static void main(String[] args) {
        String[] array1 = new String[]{"nic","pick","lilei","fuck"};
        String str1 = "Hello,World!There is nic's test";

        Arrays.sort(array1,(s1,s2) -> s1.length()-s2.length());
        System.out.println("str1 是String类型");
        for (String i :
                array1) {
            System.out.println(i);
        }
        new Thread(() -> System.out.println("我才不干呢!")).start();


    }
}
