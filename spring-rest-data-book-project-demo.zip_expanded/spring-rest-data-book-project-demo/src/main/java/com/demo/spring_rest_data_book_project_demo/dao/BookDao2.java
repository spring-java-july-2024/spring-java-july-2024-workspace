package com.demo.spring_rest_data_book_project_demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.spring_rest_data_book_project_demo.entity.BookEntity2;

@Repository
public interface BookDao2 extends JpaRepository<BookEntity2, Integer>{

}
