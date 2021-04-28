package com.spring.core.basic.oop.member;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    @Test
    void lombokTest(){
        Member member = new Member(1L, "dd", Grade.BASIC);
        member.getName();
        member.getId();

        System.out.println(member);


    }

}