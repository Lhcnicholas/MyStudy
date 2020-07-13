package com.niczo.Simple;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
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
        String json = "{\"name\":\"lihongcheng\",age:null}";
        FastJsonConfig fastJsonConfig = new FastJsonConfig();

        SerializerFeature[] serializerFeatures = new SerializerFeature[]{
                SerializerFeature.WriteNullNumberAsZero
        };
        fastJsonConfig.setDateFormat("yyyy-MM-dd HH:mm:ss");

        JSONObject jsonObject = JSON.parseObject(json);

        System.out.println(jsonObject);
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
