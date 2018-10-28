package com.example.single.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 彭诗杰
 * \* Date: 2018/10/28
 * \* Time: 13:52
 * \* Description:
 * \
 */
@Entity
@Table(name = "t_order")
public class Order {
    @Id
    @Column(name = "order_id")
    private Long orderId;
    @Column(name = "user_id")
    private Long userId;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
