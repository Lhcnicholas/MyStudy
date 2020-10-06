package com.niczo.Simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:nic
 * Date:2017-08-01
 */
public class GC {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 1000; i++) {
            list.add("The number is" + i);
        }
        System.gc();
    }

    public void heihei(){
        System.out.println("heiheiheiGC");
    }
}
