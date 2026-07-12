package com.sf.resources;



import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sf.beans.Address;
import com.sf.beans.Student;
import com.sf.beans.Subjects;

@Configuration
public class SpringConfigFile {

	// create bean
	@Bean
	public Address CreateAddObj() {
		Address address = new Address();
		address.setCityName( "pube");
		address.setHouseNo(505);
		address.setPincode(451001);;
		return address;
	}
	
	@Bean
	public Subjects createSubObj() {
		Subjects subjects = new Subjects();
		
		
		//subjects.setSubjectList("java");
		List<String>subject_list= new ArrayList<>()  ;
		subject_list.add("java");
		subject_list.add("py");
		subject_list.add("js");
		subject_list.add("math");

		subjects.setSubjectList(subject_list);
		
		return subjects;
	}

	@Bean
	public Student createStDObj() {
		Student stdStudent = new  Student();
		 stdStudent.setEmail("rahul@emial.com");
		 stdStudent.setRollNo(100);
		 stdStudent.setName("Rahul");
		 stdStudent.setSubjects(createSubObj());
		return stdStudent;
	}
}
