package com.te.springcorehibernate.config;

import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcorehibernate.bean.EntityManagerBean;

@Configuration
public class EntityManagerConfig {

	    @Bean
		public EntityManagerBean getEntityManagerBean() {
	    	EntityManagerBean entitymanagerbean= new EntityManagerBean();
			 entitymanagerbean.setEntitymanager(Persistence.createEntityManagerFactory("key").createEntityManager());
			return entitymanagerbean;
		}
	}


