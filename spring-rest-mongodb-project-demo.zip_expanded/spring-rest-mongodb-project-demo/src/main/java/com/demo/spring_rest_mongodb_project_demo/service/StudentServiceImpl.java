package com.demo.spring_rest_mongodb_project_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring_rest_mongodb_project_demo.dao.StudentDao;
import com.demo.spring_rest_mongodb_project_demo.entity.StudentEntity;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDao studentDao;
	
	@Override
	public List<StudentEntity> fetchAllStudents() {
		return studentDao.findAll();
	}

	@Override
	public StudentEntity fetchAStudent(int studId) {
		return studentDao.findById(studId).get();
	}

	@Override
	public StudentEntity addStudent(StudentEntity newStud) {
		return studentDao.save(newStud);
	}

}
