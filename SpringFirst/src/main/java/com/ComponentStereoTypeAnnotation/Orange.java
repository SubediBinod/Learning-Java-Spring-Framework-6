package com.ComponentStereoTypeAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Orange extends Fruits{

	public void whoAmI() {
		System.out.println("I am Orange extending a fruit ");
	}

	@Override
	void getPrice() {

	}
}
