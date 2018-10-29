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
 * \* Date: 2018/10/28
 * \* Time: 13:52
 * \* Description:
 * \
 */
@Entity
@Table(name = "t_order")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @Column(name = "order_id")
    private Long orderId;
    @Column(name = "user_id", nullable = false)
    private Integer userId;

    private String status;

}
