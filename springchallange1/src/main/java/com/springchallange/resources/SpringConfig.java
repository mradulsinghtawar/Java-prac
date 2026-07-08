package com.springchallange.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springchallange.beans.Car;
import com.springchallange.beans.PetrolEngine;
import com.springchallange.interfaces.Engine;

@Configuration
public class SpringConfig {

	
	// baen off petrol eng
	//bean of car
	@Bean
	public Engine petrolEngine() {
		PetrolEngine prEngine =new PetrolEngine();
		return prEngine;
	} 
	
	@Bean
	public Car car(Engine engine) {
		Car car=new Car(engine);
		return car;
	}
}
