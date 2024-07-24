package com.demo.spring_rest_mongodb_project_demo.service;

import java.util.List;

import com.demo.spring_rest_mongodb_project_demo.entity.StudentEntity;

public interface StudentService {
	List<StudentEntity> fetchAllStudents();
	StudentEntity fetchAStudent(int studId);
	StudentEntity addStudent(StudentEntity newStud);
}
