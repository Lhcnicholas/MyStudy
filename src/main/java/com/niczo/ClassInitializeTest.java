package com.niczo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lhc
 */
public class ClassInitializeTest {

    private static final Logger log = LoggerFactory.getLogger(ClassInitializeTest.class);

    public static void main(String[] args) {
        System.out.println("What");
        System.out.println(Class1.name);
        try {
            Class<?> aClass = ClassInitializeTest.class.getClassLoader().loadClass("com.niczo.Class1");
            aClass.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
//        try {
//            Class<?> cls = Class.forName("com.niczo.Class1");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}

@Slf4j
class Class1 {
    public static final String name = "lhc";
    static {
//        name = "niuqingxia";
        System.out.println(name+"ben dan");
    }
}
