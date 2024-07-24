package com.demo.spring_rest_mongodb_project_demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.spring_rest_mongodb_project_demo.entity.StudentEntity;

@Repository
public interface StudentDao extends MongoRepository<StudentEntity, Integer>{

}
