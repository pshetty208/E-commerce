package com.ecommerce.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.demo.model.Order;
import com.ecommerce.demo.repo.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository repo;
	     
	    @SuppressWarnings("null")
		public void createOrUpdateOrder(Order order){
	    	Order odr = null;
            odr.setOrderNo(order.getOrderNo());
            odr.setProducts(order.getProducts());
            odr.setTotal(order.getTotal());
            repo.save(odr);
	    } 
	    
	    public List<Order> findAllOrders() {
	    	List<Order> orders = repo.findAll();	
	    	return orders;
	    }
	    
	    public Order findOrder(String id) {
	    	Optional<Order> orders = repo.findById(id);	
	    	return orders.orElse(null);
	    }
	    
	    public void deleteOrders(String id) {
	            repo.deleteById(id);
	        
	    }

}
