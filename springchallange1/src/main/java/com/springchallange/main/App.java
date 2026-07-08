package com.springchallange.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springchallange.beans.Car;
import com.springchallange.resources.SpringConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "this challage ci" );
        
        ApplicationContext  context= new AnnotationConfigApplicationContext(SpringConfig.class);
        
        Car car=context.getBean("car" , Car.class);
        
        car.start();
    }
}
