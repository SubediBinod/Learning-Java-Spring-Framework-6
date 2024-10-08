package com.ComponentStereoTypeAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Apple extends Fruits{
	public void getPrice() {
		System.out.println("The price is "+price);
	}
	@Value("20")
	int  price;
	@Value("red")
	String color;
	private Orange orange;
	public void getColor() {
		System.out.println("The color is"+color);
	}
	@Autowired
	public void setOrange(Orange orange) {
		this.orange = orange;
	}
	public void whoAmI() {
		System.out.println("This is Apple extending a fruit class");
		orange.whoAmI();
	}
	
	
}
