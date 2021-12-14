package com.javalec.ex.student;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:appCTX8.xml") //student2 끌고옴

public class ApplicationConfig {
	@Bean 
	public Student student1() { //xml에 있는 bean id = student1과 같음 
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("수영");
		hobbys.add("요리");
		
		Student student = new Student ("홍길동", 20, hobbys);
		student.setHeight(180);
		student.setWeight(90);
		
		return student;
		
	}
	
	
}
	
