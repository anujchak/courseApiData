package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class topic {
public topic() {
		super();
		
	}
@Id
private String name;
private String teacher;
private int duration;
public topic(String name, String teacher, int duration) {
	super();
	this.name = name;
	this.teacher = teacher;
	this.duration = duration;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTeacher() {
	return teacher;
}
public void setTeacher(String teacher) {
	this.teacher = teacher;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
@Override
public String toString() {
	return "topic [name=" + name + ", teacher=" + teacher + ", duration=" + duration + "]";
}
}
