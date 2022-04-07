package com.example.mysharding;

import com.example.mysharding.entity.Order;
import com.example.mysharding.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class MyShardingApplicationTests {

    @Autowired
    private OrderRepository repository;
    @Test
    void contextLoads() {
        Order order =new Order();
        order.setUserId(12L);
        order.setPrice(new BigDecimal(12.13));
        order.setStatus("SUCCESS");
        repository.saveOrder(order);
    }

}
