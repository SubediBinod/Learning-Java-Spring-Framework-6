package com.ComponentStereoTypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
	public static void main(String[]args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig1.class);
        
        Apple apple=context.getBean(Apple.class);
        apple.getPrice();
        apple.whoAmI();
        apple.getColor();
	}
}
