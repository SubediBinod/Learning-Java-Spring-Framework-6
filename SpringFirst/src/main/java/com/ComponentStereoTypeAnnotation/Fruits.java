package com.ComponentStereoTypeAnnotation;

import org.springframework.stereotype.Component;

@Component
public  class Fruits {
	Fruits(){
		System.out.println(" This is constructor of a fruit class");
	}
	 void getPrice() {
		 System.out.println("The price of fruit depend on type of fruits");
	 }
	
}
