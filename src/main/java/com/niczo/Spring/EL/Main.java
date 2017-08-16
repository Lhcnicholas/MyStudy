package com.niczo.Spring.EL;

import com.niczo.Spring.EL.Config.ElConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * DES:
 * PROJECT:MyStudy
 * Author:Li Nic
 * DATE:2017/8/16
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);

        ElConfig resourceService = context.getBean(ElConfig.class);

        resourceService.outputResource();

        context.close();
    }
}
