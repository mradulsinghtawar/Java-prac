package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcorebeans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "mvn pro" );
        
        String config_location= "com/springcoreresources/config.xml";
        
        ApplicationContext context = new ClassPathXmlApplicationContext(config_location) ;
        
        Student stdStudent = (Student)context.getBean("std1");
         
        System.out.println(stdStudent);
        
    }
}

