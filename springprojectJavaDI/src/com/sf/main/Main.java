package com.sf.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sf.beans.Student;
import com.sf.resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// craeet the obj app context
		
		
		ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student studentObj =(Student)context.getBean("createStudentObj");
		
		studentObj.display();
		methodAction(studentObj);
		
		
	}
	public static void methodAction(Student std) {
		System.out.println("from methodd inj");
		std.display();
	}

}
