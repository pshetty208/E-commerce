package com.ecommerce.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.demo.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,String>{

}
