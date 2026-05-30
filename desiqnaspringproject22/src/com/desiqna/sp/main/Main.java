package com.desiqna.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.desiqna.sp.beans.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// loadd configgg
		
		String configLocationString="com/desiqna/sp/resources/applicationContext.xml";
		
		// loasd config
		ApplicationContext context=new ClassPathXmlApplicationContext(configLocationString);
		
		
		
	//	context.getBean(null)
		Employee firsEmployee= (Employee)context.getBean("emp1");
		
		firsEmployee.display();
	}

}
