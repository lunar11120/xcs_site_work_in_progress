package com.emp.mvc.services;

public class NoticeUtil {
	
	public static String convertDataFormat(String date1) {
	
		String con_date = "12/05/2560";
		System.out.println("Invoking convertdate");
		String str1 = date1;
		System.out.println(str1);
		
		String str2 = (String)str1.subSequence(0, 10);
		System.out.println(str2);
		
		String cyear1 = (String)str1.subSequence(0, 4);
		int cyear2 = Integer.parseInt(cyear1);
		int cyearTransform = cyear2+543;
		
		
		String cmonth = (String)str1.subSequence(5, 7);
		String cday = (String)str1.subSequence(8, 10);
		
		System.out.println(cday+"/"+cmonth+"/"+cyearTransform);
		
		con_date = cday+"/"+cmonth+"/"+cyearTransform;
		
	
		return con_date;
	}

}
