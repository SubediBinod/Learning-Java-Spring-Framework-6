package com.binod.SpringFirst;

public class Alien {
	Programmer Pro;
	private int a;
	Alien(){
		System.out.println("Alien Constructor called");
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getA() {
		return a;
	}
	
	public Programmer getPro() {
		return Pro;
	}
	public void setPro(Programmer pro) {
		this.Pro = pro;
	}
	public void greet() {
		Pro.greet();
		System.out.println("TO to To to");
	}
}
