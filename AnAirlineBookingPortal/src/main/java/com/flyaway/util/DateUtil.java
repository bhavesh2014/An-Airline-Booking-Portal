package com.flyaway.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class DateUtil {

	public static Timestamp convertStringToTimestamp(String date) {
		
		//ISO_LOCAL_DATE_TIME = "yyyy-MM-DDTHH:mm";
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		LocalDateTime localDateTime = LocalDateTime.from(formatter.parse(date));
		Timestamp ts = Timestamp.valueOf(localDateTime);
		return ts;
	}
	
	//format date in YYYY-MM-DD format
	
public static  Date convertStringToDateYYYYMMDD(String date) {
 Date dt=null;
 try {
	dt= new SimpleDateFormat("yyyy-MM-dd").parse(date);
} catch (java.text.ParseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}  
 return dt;
	
	}
}
