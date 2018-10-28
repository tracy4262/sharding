package com.example.single.rep;

import com.example.single.domain.Order;
import org.springframework.data.repository.CrudRepository;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 彭诗杰
 * \* Date: 2018/10/28
 * \* Time: 13:56
 * \* Description:
 * \
 */
public interface OrderRep extends CrudRepository<Order, Long> {
}
