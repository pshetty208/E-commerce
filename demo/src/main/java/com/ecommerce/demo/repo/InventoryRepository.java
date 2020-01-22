package com.ecommerce.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.demo.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory,String>{


}
