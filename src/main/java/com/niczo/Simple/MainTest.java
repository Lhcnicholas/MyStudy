package com.niczo.Simple;

/**
 * Des:
 * Author:LiNic
 * Date:2018/5/27
 */
public class MainTest {
    public static void main(String[] args) {
        //testMethod(new VarTest());
        testMethod(new CronTest());
        //testMethod(new IteratorTest());
    }


    public static void testMethod(Test test){
        test.test();
    }
}


class BaseDriver {
    private boolean hasDone = false;

    public void androidDriver() {
        if (!hasDone) {
            /*
              处理逻辑
             */
            hasDone = true;
        } else {

        }
    }

}
