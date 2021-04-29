package com.te.springcorehibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcorehibernate.bean.EntityManagerBean;
import com.te.springcorehibernate.bean.StudentBean;
import com.te.springcorehibernate.config.EntityManagerConfig;

import javax.persistence.EntityManager;

public class StudentTest {

	public static void main(String[] args) {
		StudentBean student = new StudentBean();
		student.setStuid(1);
		student.setName("VEDITH");
		student.setMarks(85);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(EntityManagerConfig.class);
		EntityManager entityManager = context.getBean(EntityManagerBean.class);
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		System.out.println("Record inserted successfully");
		
		

	}

}
