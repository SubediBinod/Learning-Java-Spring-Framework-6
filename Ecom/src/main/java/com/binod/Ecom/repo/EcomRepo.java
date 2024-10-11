package com.binod.Ecom.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.binod.Ecom.model.Product;

@Repository
public interface EcomRepo extends JpaRepository<Product,Integer>{

}
