package com.sf.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sf.beans.Student;
import com.sf.resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create obj of appllicationn context
		
		ApplicationContext  context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		
		Student student1 = (Student)context.getBean("student");
		student1.display();
	}

}
