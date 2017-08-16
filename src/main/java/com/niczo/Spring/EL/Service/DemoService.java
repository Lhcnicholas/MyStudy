package com.niczo.Spring.EL.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * DES:
 * PROJECT:MyStudy
 * Author:Li Nic
 * DATE:2017/8/16
 */
@Service
public class DemoService {

    @Value("其他类的属性")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
