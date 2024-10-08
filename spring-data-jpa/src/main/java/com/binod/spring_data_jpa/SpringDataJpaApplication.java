package com.binod.spring_data_jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.binod.spring_data_jpa.model.Student;
import com.binod.spring_data_jpa.repo.StudentRepo;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringDataJpaApplication.class, args);
		 Student s1= context.getBean(Student.class);
		  Student s2=context.getBean(Student.class);
		  Student s3=context.getBean(Student.class);
		 
		  StudentRepo repo=context.getBean(StudentRepo.class);
		  
		  s1.setId(101);
		  s1.setName("Binod");
		  s1.setMarks(85);
		  
		  
		  s2.setId(102);
		  s2.setName("Subedi");
		  s2.setMarks(80);
		  
		  
		  s3.setId(103);
		  s3.setName("Bidhak");
		  s3.setMarks(70);
		  
		  repo.save(s1);
		  repo.save(s2);
		  repo.save(s3);
		  
		  System.out.println(repo.findAll());
		  
		  
		  Optional<Student> s= repo.findById(103);
			System.out.println(s.orElse(new Student()));
			
			//to update use save only
			 System.out.println(repo.save(s2));
			 
			 //to delete
			  repo.delete(s2);
			  
			// Search by keyword "bi"
		        List<Student> students = repo.findByNameContaining("bi");
		        System.out.println("Students matching 'bi': " + students);
			}

	
	
	}


