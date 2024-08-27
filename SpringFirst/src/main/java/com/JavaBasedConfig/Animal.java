package com.JavaBasedConfig;

public class Animal {
	int age;
	Animal(){
		System.out.println(" This is Constructor of animal");
	}
	Animal(int age){
		this.age=age;
	}
	public void whoAmI() {
		System.out.println("This is animal");
	}
}
