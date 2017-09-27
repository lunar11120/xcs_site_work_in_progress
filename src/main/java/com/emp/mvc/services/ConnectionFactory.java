package com.emp.mvc.services;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
	
	
public static EntityManager ConnectORCL() {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_ORCL" );
	    EntityManager entitymanager = emfactory.createEntityManager();
		
	    return entitymanager;
	}

}