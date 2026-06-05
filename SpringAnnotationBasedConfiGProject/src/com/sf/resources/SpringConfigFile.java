package com.sf.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.sf.beans.Student;

@Configuration

//@ComponentScan("com.sf.beans")

//@ComponentScan({"com.sf.beans"})
//@ComponentScan({"com.sf.beans","......","..."})

@ComponentScan(basePackages  = {"com.sf.beans"})


public class SpringConfigFile {
	
	
	
//	@Bean
//	public Student stdID1() {
//		
//		Student studentObj= new Student();
//		studentObj.setRollno(0);
//		studentObj.setNameString("Vishal");
//		studentObj.setMarks(88.5);
//		
//		return studentObj;
//		
//	}
	
	
}

