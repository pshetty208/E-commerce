package com.ecommerce.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.demo.model.Inventory;
import com.ecommerce.demo.repo.InventoryRepository;

@Service
public class InventoryService {
	
	@Autowired
	InventoryRepository repo;
	
	public Inventory findById(String id) {	
		Inventory obj = repo.findById(id).orElse(null);
		return obj;	
	}
	
	@SuppressWarnings("null")
	public void UpdateInventory(Inventory inventory){
		Inventory inv = null;
    	inv.setProductId(inventory.getProductId());
    	inv.setUnits(inventory.getUnits());
        repo.save(inv);
    } 
	

}
