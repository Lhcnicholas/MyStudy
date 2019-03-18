package com.niczo.Simple;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Random;

/**
 * DES:
 * PROJECT:MyStudy
 * Author:Li Nic
 * DATE:2017/8/9
 */
public class SimpleTest {
    public static void main(String[] args) {
        String[] array1 = new String[]{"nic","pick","lilei","fuck","中国人"};
        String str1 = "Hello,World!There is nic's test";

        Arrays.sort(array1, Comparator.comparingInt(String::length));

        for (String i :
                array1) {
            System.out.println(i);
        }
        new Thread(() -> System.out.println("我才不干呢!")).start();

        //repeatMessage("嘿嘿嘿",50);

        IntSequence intSequence = randomInts(1,10);

        Integer value = 1234;
        changeValue(value);
        System.out.println(value);

        System.out.println(array1[1] + array1[1].getBytes().length);

        System.out.println("----------------------------------------");

        System.out.println(DateFormatUtils.ISO_DATE_FORMAT.format(new Date()));

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
