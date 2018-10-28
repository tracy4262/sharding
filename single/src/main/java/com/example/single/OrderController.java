package com.example.single;

import com.example.single.domain.Order;
import com.example.single.rep.OrderRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 彭诗杰
 * \* Date: 2018/10/28
 * \* Time: 14:24
 * \* Description:
 * \
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderRep orderRep;

    @RequestMapping("/add")
    public Object add() {
        for (int i = 0; i < 10; i++) {
            Order order = new Order();
            order.setUserId((long) i);
            order.setOrderId((long) i);
            orderRep.save(order);
        }
        for (int i = 10; i < 20; i++) {
            Order order = new Order();
            order.setUserId((long) i + 1);
            order.setOrderId((long) i);
            orderRep.save(order);
        }
        return "success";
    }

    @RequestMapping("query")
    private Object queryAll() {
        return orderRep.findAll();
    }

}
