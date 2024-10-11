package com.binod.Ecom;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.binod.Ecom.model.Product;
import com.binod.Ecom.service.EcomService;


@SpringBootApplication
public class EcomApplication {
	
	public static void main(String[] args) {
		
		ApplicationContext context =SpringApplication.run(EcomApplication.class, args);
//		EcomService service= context.getBean(EcomService.class);
//		Product product = new Product();

		
		
//		 product.setName("Dummy Product");
//	        product.setDescription("This is a dummy product for testing.");
//	        product.setBrand("TestBrand");
//	        product.setPrice(new BigDecimal("99.99"));
//	        product.setCategory("TestCategory");
//	        product.setReleaseDate(new Date());
//	        product.setProductAvailable(true);
//	        product.setStockQuantity(10);
//	        
//	        service.saveProduct(product);
		
	}

}
