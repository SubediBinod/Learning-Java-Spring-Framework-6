package com.binod.spring_data_jpa.model;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Scope("prototype")
@Entity
public class Student {
	@Id
private int id;
@Override
public String toString() {
	return "Student [id=" + id + ", Name=" + name + ", marks=" + marks + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getMarks() {
	return marks;
}
public void setMarks(long marks) {
	this.marks = marks;
}
private String name;
private long marks;

}
