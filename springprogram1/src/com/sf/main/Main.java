package com.sf.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sf.beans.Student;
import com.sf.resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.out.println("core conceptss");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student  stdStudent = context.getBean(Student.class);
		
		stdStudent.display();
	}

}
