package com.spring.core.basic.quiz;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Computer {

    private final Keyboard keyboard;
    private final Mouse mouse;
    private final Monitor monitor;

    public Computer(
            @Qualifier("samsungkeyboard") Keyboard keyboard,
            @Qualifier("lgmouse") Mouse mouse,
            @Qualifier("applemonitor") Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public void info(){
        keyboard.info();
        monitor.info();
        mouse.info();
    }
}
