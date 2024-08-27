package com.JavaBasedConfig;

public class Rhino extends Animal{
	public void setD(Danfe d) {
		this.d = d;
	}
	Danfe d;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	int weight;
	public void whoAmI() {
		System.out.println("This is Rhino extending an Animal class ");
		System.out.println("This is form Rhino calling properties of Danfe ");
		System.out.println("The color from rhino"+d.getColor());
		System.out.println(d.getWeight());
	}
	
}
