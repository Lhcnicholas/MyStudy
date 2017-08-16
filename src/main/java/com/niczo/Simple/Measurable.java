package com.niczo.Simple;

/**
 * DES:接口练习
 * PROJECT:MyStudy
 * Author:Li Nic
 * DATE:2017/8/10
 */
public interface Measurable {
    double getMeasure();


    static double average(Measurable[] objects){
        double sum = 0;
        for (Measurable object : objects) {
            sum += object.getMeasure();
        }
        return sum/objects.length;
    }

    static Measurable largest(Measurable[] objects){
        Measurable largest = null;
        double max = 0;
        for (Measurable object : objects) {
            if (object.getMeasure() > max){
                max = object.getMeasure();
                largest = object;
            }
        }
        return largest;
    }
}
