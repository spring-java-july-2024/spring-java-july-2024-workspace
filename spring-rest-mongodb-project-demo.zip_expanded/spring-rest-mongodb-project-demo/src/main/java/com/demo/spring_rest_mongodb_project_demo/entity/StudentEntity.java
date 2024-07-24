package com.demo.spring_rest_mongodb_project_demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Document("student_details")
public class StudentEntity {

	@Id
	@Field("stud_id")
	private int studId;
	
	@Field("stud_name")
	private String studName;
	
	@Field("stud_city")
	private String studCity;
}
