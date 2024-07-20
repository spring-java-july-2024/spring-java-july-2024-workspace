package com.sample.spring_core_xml_project_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.spring_core_xml_project_demo.mybeans.Employee;
import com.sample.spring_core_xml_project_demo.mybeans.Student;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@SpringBootApplication
public class SpringCoreXmlProjectDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreXmlProjectDemoApplication.class, args);
		
		// lets get started
		Student student1 = new Student(101, "Harry Potter", 70);
		System.out.println("student1 : " + student1);
		
		// lets start with spring core
		// here we are creating a spring core container and we provide the xml bean configuration in the constructor
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("anyName.xml");
		// now that the spring core container is created ask the container to give an object with id stud
		Student student2 = context.getBean("stud1", Student.class);
		System.out.println("student2 : " + student2);
		
		Student student3 = context.getBean("stud2", Student.class);
		System.out.println("student3 : " + student3);
		
		Student student4 = context.getBean("stud3", Student.class);
		System.out.println("student4 : " + student3);

		Employee emp1 = context.getBean("employee", Employee.class);
		System.out.println("employee1 : " + emp1);
		
		
	}

}