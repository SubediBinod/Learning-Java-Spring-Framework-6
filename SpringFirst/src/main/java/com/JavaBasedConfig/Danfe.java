package com.JavaBasedConfig;

public class Danfe extends Animal {
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int weight;
	String color;
	public void whoAmI() {
		System.out.println("This is Danfe exteding the animal class ");
	}
}
