package com.te.springcorehibernate.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="student")
@Data
public class StudentBean {
	
	public StudentBean() {
		
	}

	private int stuid;
	private String name;
	private int marks;
}
