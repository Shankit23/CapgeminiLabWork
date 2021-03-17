package com.pkart.util;
import java.lang.Exception;
import com.pkart.exception.InvalidDateException;
import java.text.SimpleDateFormat;  
import java.util.Date; 
public class DateUtil {
	public Date getStringToDate(String d) throws InvalidDateException { 
		Date date1=null;
		    try {
		    	date1=new SimpleDateFormat("dd-MM-yyyy").parse(d);
		    	
		    	}
		    catch(Exception e)
		    {
		    	System.out.println("Exception occured"+e);
		    }
		    return date1;
		}  
}
