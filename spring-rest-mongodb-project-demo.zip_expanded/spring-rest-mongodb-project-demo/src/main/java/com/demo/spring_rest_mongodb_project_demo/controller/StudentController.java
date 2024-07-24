package com.demo.spring_rest_mongodb_project_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring_rest_mongodb_project_demo.entity.StudentEntity;
import com.demo.spring_rest_mongodb_project_demo.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/students")
	public ResponseEntity<List<StudentEntity>> getAllStudents(){
		return new ResponseEntity<List<StudentEntity>>(studentService.fetchAllStudents(), HttpStatus.OK);
	}
	
	@GetMapping("/students/{sid}")
	public ResponseEntity<StudentEntity> getAStudent(@PathVariable("sid") int studId){
		return new ResponseEntity<StudentEntity>(studentService.fetchAStudent(studId), HttpStatus.OK);
	}
	
	@PostMapping("/students")
	public ResponseEntity<StudentEntity> addStudent(@RequestBody StudentEntity newStudent){
		return new ResponseEntity<StudentEntity>(studentService.addStudent(newStudent), HttpStatus.OK);
	}
}
