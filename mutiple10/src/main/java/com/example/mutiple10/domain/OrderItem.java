package com.example.mutiple10.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 彭诗杰
 * \* Date: 2018/10/29
 * \* Time: 23:46
 * \* Description:
 * \
 */
@Entity
@Table(name = "t_order_item")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
    @Id
    @Column(name = "order_item_id")
    private Long orderItemId;

    @Column(name = "order_id", nullable = false)
    private Long orderId;

    @Column(name = "user_id", nullable = false)
    private Integer userId;
}
