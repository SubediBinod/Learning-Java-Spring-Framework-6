package ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[]args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Ferrari f= (Ferrari)context.getBean("Ferrari");
		f.startEngine();
		System.out.println(f.getModelNo());
		System.out.println(f.getPrice());
		
	}
}
