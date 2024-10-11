package com.binod.Ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.binod.Ecom.model.Product;
import com.binod.Ecom.service.EcomService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductController {

@Autowired
EcomService service;
@GetMapping("/products")

public ResponseEntity<List<Product>> getProducts() {
	return  new ResponseEntity<>(service.getAllProduct(),HttpStatus.OK);
	
}

@GetMapping("/products/{id}")
public ResponseEntity<Product> getProductsById(@PathVariable int id){
	Product product=  service.getProductById(id);
	if(product.getId()>0) {
		return new ResponseEntity<>(product,HttpStatus.OK);
	}
	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
}
}
