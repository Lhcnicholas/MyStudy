package com.niczo;

import java.util.Map;

/**
 * DES:
 * PROJECT:MyStudy
 * Author:Li Nic
 * DATE:2017/8/9
 */
public class InterfaceImplTest implements InterfaceTest {

    @Override
    public double random(){
        return Math.random()+1;
    }
}