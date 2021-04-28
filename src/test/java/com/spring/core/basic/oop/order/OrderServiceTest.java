package com.spring.core.basic.oop.order;

import com.spring.core.basic.oop.config.AppConfig;
import com.spring.core.basic.oop.member.Grade;
import com.spring.core.basic.oop.member.Member;
import com.spring.core.basic.oop.member.MemberService;
import com.spring.core.basic.oop.member.MemberServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    AppConfig ac = new AppConfig();

    MemberService memberService = ac.memberService();
    OrderService orderService = ac.orderService();

    @Test
    void serviceTest(){

        Member member1 = new Member(1L, "박영희", Grade.VIP);
        Member member2 = new Member(2L, "김철수", Grade.VIP);

        memberService.join(member1);
        memberService.join(member2);

        //////////////////////////////////주문로직///////////////////////////////
        Order order = orderService.createOrder(1L, "삼겹살", 20000);

        int payamount = order.calcFinalPrice();
        assertEquals(17000, payamount);
    }

}