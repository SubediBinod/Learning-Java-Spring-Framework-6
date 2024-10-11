package com.binod.Ecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.binod.Ecom.model.Product;
import com.binod.Ecom.repo.EcomRepo;

@Service
public class EcomService {
	@Autowired
EcomRepo repo;
	public void saveProduct(Product x) {
		repo.save(x);
	}
	public List<Product> getAllProduct(){
		return repo.findAll();
	}
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(new Product(-1));
	}
}
