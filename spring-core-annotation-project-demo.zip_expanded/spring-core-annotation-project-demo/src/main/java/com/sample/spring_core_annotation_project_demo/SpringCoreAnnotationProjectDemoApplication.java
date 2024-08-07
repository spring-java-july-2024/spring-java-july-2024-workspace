package com.sample.spring_core_annotation_project_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sample.spring_core_annotation_project_demo.mybeans.Employee;
import com.sample.spring_core_annotation_project_demo.mybeans.Student;

@SpringBootApplication
public class SpringCoreAnnotationProjectDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreAnnotationProjectDemoApplication.class, args);
		
		Student student1 = new Student(201, "Emma Watson", 70);
		System.out.println("student1 : " + student1);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.sample.spring_core_annotation_project_demo.mybeans");
		Student student2 = context.getBean("student", Student.class);
		System.out.println("student2 : " + student2);
		
		Employee employee1 = context.getBean("employee", Employee.class);
		System.out.println("employee1 : " + employee1);
		
	}

}
