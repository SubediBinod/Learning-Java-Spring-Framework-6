package ConstructorInjection;

public interface Car {
	 default public void startEngine() {
		System.out.println("Starting");
	}
	 
	
}
