package com.ngfs.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		IGeneral general=new General();
		String sDate1="30/11/2018";  
	    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1); 
	System.out.println(general.getLongValueOfDate(date1));
		
	}

}
