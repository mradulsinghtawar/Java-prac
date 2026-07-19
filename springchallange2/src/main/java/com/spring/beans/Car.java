package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Car {
	@Autowired
	private  PetrolEngine engine;
//	public Car(Engine engine) {
//		this.engine=engine;
//	}
	
	public void  startCar() {
		engine.start();
		System.out.println("car started");
	}
}
