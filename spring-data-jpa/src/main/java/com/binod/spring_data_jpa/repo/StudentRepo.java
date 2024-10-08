package com.binod.spring_data_jpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.binod.spring_data_jpa.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{
	@Query("select s from Student s where s.name=?1")// this one is optional 
	List<Student> findByName(String name);
	
	
	
	List<Student> findByMarks(int marks);
	List<Student> findByMarksGreaterThan(int marks);
	
	// Spring Data JPA will automatically generate the query for you
	List<Student> findByNameContaining(String name);
}
