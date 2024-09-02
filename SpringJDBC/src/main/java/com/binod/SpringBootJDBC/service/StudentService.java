package com.binod.SpringBootJDBC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.binod.SpringBootJDBC.model.Student;
import com.binod.SpringBootJDBC.repository.StudentRepo;

@Service
public class StudentService {
	private StudentRepo r;
	@Autowired
	public void setR(StudentRepo r) {
		this.r = r;
	}
	public void addStudent(Student s) {
		r.addAll(s);
	}
	public void displayAll() {
        // Call the printAll method to retrieve the list of students
        List<Student> students = r.printAll();

        // Iterate through the list and print each student's details
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Roll: " + student.getRoll());
            System.out.println("Marks: " + student.getMarks());
            System.out.println("----------------------");
        }
    }
}
