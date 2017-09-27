package com.emp.mvc;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.emp.mvc.model.*;
import com.emp.mvc.model.Opsnotice;
import com.emp.mvc.services.ConnectionFactory;
import com.emp.mvc.services.Create_OpsNoticeDAO;
import com.emp.mvc.services.Ops_noticeDAO;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	public static void main(String[] args) {
		
		
//		System.out.println("Test app");
//		System.out.println("Test Again");
//		
//		Ops_noticeDAO opdao = new Ops_noticeDAO();
//	    List<Opsnotice> emplist = opdao.List_of_OpsNotice();
//
//	    for( Opsnotice e:emplist ){
//	    	 System.out.print("ID :" + e.getNid());
//	    	 System.out.print("ID :" + e.getNoticeNumber());
//	    	 System.out.print("ID :" + e.getNoticedate());
//	    	 System.out.print("PRODUCT :" + e.getOpsProduct());
//	         System.out.print("\t Employee NAME :" + e.getDepartment());
//	         System.out.print("\t E :" + e.getIndictment().getGuildBase());
//	         System.out.print("\t E :" + e.getLawBreakers().toString());
//	         System.out.print("\t E :" + e.getLine().toString());
//	         System.out.println("\t Employee NAME :" + e.getInform().getInformName());
//	    }
	    
//		List<Opsnotice> ops = new ArrayList<Opsnotice>();
//		String s1 = "602";
//		ops = Ops_noticeDAO.findBySearchButton(s1);
//		
//		for( Opsnotice e:ops ){
//	    	 System.out.print("ID :" + e.getNid());
//	    	 System.out.println("ID :" + e.getNoticeNumber());
//
//	    }
		

		System.out.println("test substring");
		String str1 = "2017-08-12 00:00:00.0";
		System.out.println(str1);
		
		String str2 = (String)str1.subSequence(0, 10);
		System.out.println(str2);
		
		String cyear1 = (String)str1.subSequence(0, 4);
		int cyear2 = Integer.parseInt(cyear1);
		int cyearTransform = cyear2+543;
		
		
		String cmonth = (String)str1.subSequence(5, 7);
		String cday = (String)str1.subSequence(8, 10);
		
		System.out.println(cday+"/"+cmonth+"/"+cyearTransform);
		
		final String OLD_FORMAT = "yyyy-MM-dd";
		final String NEW_FORMAT = "yyyy/MM/dd";

		// August 12, 2010
		String oldDateString = "12/08/2010";
		String newDateString;

//		SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
//		Date d = sdf.parse(oldDateString);
//		sdf.applyPattern(NEW_FORMAT);
//		newDateString = sdf.format(d);
//		
	}
	
	

	
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
