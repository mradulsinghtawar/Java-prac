package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Thar {
		private final PetrolEngine petrolEngine;
		@Autowired
		private DeiselEngine deiselEngine;
		
		public Thar (DeiselEngine dengine, PetrolEngine petrolEngine) {
			this.deiselEngine=dengine;
			this.petrolEngine = petrolEngine;
		}
		
		public void startThar() {
			
			
			int countKms= 0;
			
			deiselEngine.start();

			while(countKms<10) {
				
				System.out.println("thar starts movimgg on deisel"+ countKms);
				countKms++;
				
			}
			petrolEngine.start();
			
			
			System.out.println("thar starts movimgg on petrol");
			
			
		}
}
