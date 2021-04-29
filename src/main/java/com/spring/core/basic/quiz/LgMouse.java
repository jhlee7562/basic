package com.spring.core.basic.quiz;

import org.springframework.stereotype.Component;

@Component("lgmouse")
public class LgMouse implements Mouse{
    @Override
    public void info() {
        System.out.println("LG 마우스!");

    }
}
