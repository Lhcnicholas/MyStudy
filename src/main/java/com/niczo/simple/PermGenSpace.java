package com.niczo.simple;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

/**
 * Des:
 * Author:LiNic
 * Date:2018/4/14
 */
public class PermGenSpace {
    public static void main(String[] args) {
        URL url = null;
        List<ClassLoader> classLoaderList = new ArrayList<>();
        try {
            url = new File("/temp").toURI().toURL();
            URL[] urls = {url};
            while (true) {
                ClassLoader classLoader = new URLClassLoader(urls);
                classLoaderList.add(classLoader);
                try {
                    classLoader.loadClass("com.niczo.simple.SimpleTest");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
