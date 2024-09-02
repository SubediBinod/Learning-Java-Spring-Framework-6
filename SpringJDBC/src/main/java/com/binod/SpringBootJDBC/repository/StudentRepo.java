package com.binod.SpringBootJDBC.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

//import java.util.Iterator;

import org.springframework.stereotype.Repository;

import com.binod.SpringBootJDBC.model.Student;


//Using ArrayList to store the data
//@Repository
//public class StudentRepo{
//	ArrayList<Student> al=new ArrayList<>();;
//	public void addAll(Student s) {
//		
//		al.add(s);
//	}
//	
//	public void PrintAll(){
//		Iterator<Student>itr= al.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
//	}
//}

@Repository
	public class StudentRepo{
	JdbcTemplate jdbc;
	@Autowired
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	public void addAll(Student s) {
		String sql= "insert into student values(?,?,?)";
		int x= jdbc.update(sql,s.getName(),s.getRoll(),s.getMarks());
		if(x>=1) {
			System.out.println("Succesful data entry");
		}
	}
	public List<Student> printAll() {
        String sql = "SELECT * FROM student";
        
        RowMapper<Student> rowMapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setName(rs.getString("name"));
                student.setRoll(rs.getInt("roll"));
                student.setMarks(rs.getInt("marks"));
                return student;
            }
        };
        
        return jdbc.query(sql, rowMapper);
    }
}


//RowMapper:: In Spring JDBC is an interface used to map rows of a ResultSet (which is the result of executing an SQL query) to instances of a specified Java class. 
//Essentially, it allows you to convert each row of the data returned from the database into a corresponding Java object.


// H2 database use garne vaye src/main/resources ma gayera schema.sql lekhne
// mysql ko lagi pom.xml ma dependency lekhne mavenrepo bata ani application.properties ma talako lekhne


/*
 * spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
 * spring.datasource.username=your_username
 * spring.datasource.password=your_password
 * spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
 */