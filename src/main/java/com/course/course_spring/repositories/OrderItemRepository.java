package com.course.course_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.course_spring.entities.OrderItem;
import com.course.course_spring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
