package com.springchallange.beans;


import com.springchallange.interfaces.Engine;


public class Car {
   private final Engine engine;

   public Car(Engine engine) {
	super();
	this.engine = engine;
   }
   
   public  void start() {
	   engine.start();
	   System.out.println("Car started");
	   
   }
}
