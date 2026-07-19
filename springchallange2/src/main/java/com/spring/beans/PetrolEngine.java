package com.spring.beans;

import org.springframework.stereotype.Component;

import com.spring.interfaces.Engine;

@Component
public class PetrolEngine implements Engine {
	@Override
	public void start() {
		System.out.println("petrol engine tart");
	}

}
