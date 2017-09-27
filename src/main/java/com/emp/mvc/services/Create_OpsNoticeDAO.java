package com.emp.mvc.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;


import com.emp.mvc.model.Opsnotice;

public class Create_OpsNoticeDAO {
	
			//Insert INTO OPS_NOTICE Table
			public static void insertOpsNotice(String opsnumber,String product){	
				
				Opsnotice ops = new Opsnotice();
			
				EntityManager entitymanager = ConnectionFactory.ConnectORCL();
				
				ops.setNoticeNumber(opsnumber);
				ops.setOpsProduct(product);
				
				entitymanager.getTransaction().begin();
				entitymanager.persist(ops);
				entitymanager.getTransaction().commit();
			    
				//Show Message When insert finish
			    System.out.println("insert data success");	      

			}


}
