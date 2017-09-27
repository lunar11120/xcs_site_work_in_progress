package com.emp.mvc.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.emp.mvc.model.Opsnotice;

import jdk.nashorn.internal.runtime.Context.ThrowErrorManager;

public class Ops_noticeDAO {
	
	
		//find list of OPS_notice
		public List<Opsnotice> List_of_OpsNotice(){	
			List<Opsnotice> result_list = new ArrayList<Opsnotice>();
		
			EntityManager entitymanager = ConnectionFactory.ConnectORCL();
		    
			//Create List[OPS_notice]
		    Query query = entitymanager.createQuery( "Select e " + "from OPS_NOTICE e " );	      
		    result_list=(List<Opsnotice>)query.getResultList( );
						
			return result_list;      
		}
		
		
		//find OPS Notice Object by Primary Key	
		public static Opsnotice findByPrimarykey(int primaryKey){	
					
			EntityManager entitymanager = ConnectionFactory.ConnectORCL();
			Opsnotice ops = new Opsnotice();
						
			try{
				ops = entitymanager.getReference(Opsnotice.class, primaryKey);	
				System.out.println("Find Success");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("NO opsnotice id");
				
			}	
			
			return ops;
		}
		
		
		
		//find by SearchKey & Thai Language SearchKey
		public static List<Opsnotice> findBySearchButton(String searchKeyRaw){	
						
			EntityManager entitymanager = ConnectionFactory.ConnectORCL();
			List<Opsnotice> ops = new ArrayList<Opsnotice>();
			
			entitymanager.getTransaction().begin();

			String searchKey = "%"+searchKeyRaw+"%";
		    try {
		    	ops = (List<Opsnotice>)entitymanager.createNamedQuery("findByName")
		    			.setParameter("text", searchKey).getResultList();
		    	
		    	System.out.println("Find by SearchKey Success.");

		    } catch (NoResultException e) {
		    	System.out.println(e.getMessage());
		    }
		    
		    entitymanager.getTransaction().commit();
		    entitymanager.close();
			
			return ops;
		}		
}
