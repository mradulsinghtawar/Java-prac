package com.sf.resources;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sf.beans.Address;
import com.sf.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddObj() {
		Address address= new Address( 308  , "delhi"  ,45678);
		
//		address.setHouseNo(409);
//		address.setCityString( "kanpur");
//		address.setPincode(78786);
		
		
		return address ;
	}
	
	@Bean
	public  Student createStudentObj() {
		Address address=createAddObj();
		Student stdStudent= new Student( 101,"rajj", "rah@gmail.com", address );
		
//		stdStudent.setRollNo(101);
//		stdStudent.setName("rahul");
//		stdStudent.setEmail("r@gmail.com");
//		stdStudent.setAddress(createAddObj());
		return stdStudent;
	}
}
