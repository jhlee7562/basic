package com.spring.core.basic.quiz;

import org.springframework.stereotype.Component;

@Component("samsungkeyboard")
public class SamsungKeyboard implements Keyboard{
    @Override
    public void info() {
        System.out.println("삼성 키보드!");
    }
}
