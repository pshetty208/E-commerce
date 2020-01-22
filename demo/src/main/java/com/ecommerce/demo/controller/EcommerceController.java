package com.ecommerce.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.demo.model.Inventory;
import com.ecommerce.demo.model.Order;
import com.ecommerce.demo.model.Product;
import com.ecommerce.demo.service.InventoryService;
import com.ecommerce.demo.service.OrderService;

@RestController
@RequestMapping("/order")
public class EcommerceController {
	
	@Autowired
    OrderService service;
	
	@Autowired
    InventoryService invService;
	
    @PostMapping
    public void createOrUpdateOrder(Order order){
    	List<Product> list = order.getProducts();
    	for(Product li: list) {
    		Inventory invItem = invService.findById(li.getProductId());
    		if(invItem.getUnits() >= li.getQuantity()) {
    			invItem.setUnits(invItem.getUnits() - li.getQuantity());
    			invService.UpdateInventory(invItem);
    		}
    		else {
    			//Return appropriate message to reduce the quantity of then product.
    		}
    	}
    	service.createOrUpdateOrder(order);
    	
    }
    
    @GetMapping("/{id}")
    public Order findOrder(@PathVariable("id") String id){
    	Order order = service.findOrder(id);
    	return order;
     }

    @GetMapping
    public List<Order> findAllOrders() {
        List<Order> list = service.findAllOrders();
        return list;
     }
 
    @DeleteMapping("/{id}")
    public void deleteOrders(@PathVariable("id") String id){
        service.deleteOrders(id);
    }

}
