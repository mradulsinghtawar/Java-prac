package com.springchallange.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.beans.Car;
import com.spring.beans.Thar;
import com.spring.resources.SpringConfig;

/**
 * Hello world!
 *
 */
public class App 
{ 
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class) ;
        
       Car car= context.getBean("car" , Car.class);
       car.startCar();
       
       System.out.println("  ......  ");
       
       Thar thar= context.getBean("thar" , Thar.class);
       thar.startThar();
    }
}
