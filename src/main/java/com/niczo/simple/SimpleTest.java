package com.niczo.simple;

import java.math.BigDecimal;
import java.util.*;

/**
 * DES:
 * PROJECT:MyStudy
 * Author:Li Nic
 * DATE:2017/8/9
 */
public class SimpleTest {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("123");

        BigDecimal b = a;

        b = b.add(BigDecimal.valueOf(321));

        System.out.println(a.toPlainString());
    }

    public static void repeatMessage(String text,int count){
        new Thread(() -> {
            for (int i = 0;i < count;i++){
                System.out.println(text);
            }
        }).start();
    }

    private static Random generator = new Random();


    private static IntSequence randomInts(int low, int high){
        //局部内部类
        /*class RandomSequence implements IntSequence{

            @Override
            public int next() {
                return low+generator.nextInt(high-low+1);
            }

            @Override
            public boolean hasNext() {
                return true;
            }
        }

        return new RandomSequence();*/
        //匿名类
        return new IntSequence() {
            @Override
            public int next() {
                return low+generator.nextInt(high-low+1);
            }

            @Override
            public boolean hasNext() {
                return true;
            }
        };
    }

    public static <T> void swap(T[] array,int i,int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void changeValue(Integer str){
        str = str + 5;
    }
}
