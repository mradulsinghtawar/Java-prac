package com.spring.beans;

import org.springframework.stereotype.Component;

import com.spring.interfaces.Engine;
@Component
public class DeiselEngine implements Engine{
	
	@Override
	public void start() {
		System.out.println(" deisel eng start"); 
		
	}

}
