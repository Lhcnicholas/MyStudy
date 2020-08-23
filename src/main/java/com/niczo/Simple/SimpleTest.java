package com.niczo.Simple;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.*;

/**
 * DES:
 * PROJECT:MyStudy
 * Author:Li Nic
 * DATE:2017/8/9
 */
public class SimpleTest {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();

        User a = new User();
        a.setName("a");

        User b = new User();
        b.setName("b");
        list.add(a);
        list.add(b);

        list.forEach(user -> user.setName("heihei"));
        System.out.println(list);

        for (User s : list) {
        	s.setName("宝贝宝贝宝贝");
        }
        System.out.println(list);
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
