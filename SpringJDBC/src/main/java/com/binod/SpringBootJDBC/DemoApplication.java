package com.binod.SpringBootJDBC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.binod.SpringBootJDBC.model.Student;
import com.binod.SpringBootJDBC.service.StudentService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello World ");
	    Student s= context.getBean(Student.class);
		s.setName("Binod");
		s.setRoll(4);
		s.setMarks(90);
		
		Student s1= context.getBean(Student.class);
		s1.setName("Bidhak");
		s1.setRoll(5);
		s1.setMarks(98);

		StudentService service= context.getBean(StudentService.class);
		service.addStudent(s);
		service.addStudent(s1);
		service.displayAll();
		
}

}
