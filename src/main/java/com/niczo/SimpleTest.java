package com.niczo;

import java.util.Arrays;
import java.util.Random;

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

        //repeatMessage("嘿嘿嘿",50);

        IntSequence intSequence = randomInts(1,10);

        ;

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
}
