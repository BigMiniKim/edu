package com.javalec.ex.student;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
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
	@Bean
	public Student student2() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("독서");
		hobbys.add("음악감상");
		
		Student student = new Student ("홍길순", 20, hobbys);
		student.setHeight(180);
		student.setWeight(90);
		
		return student;
		
	}
	
}
	
