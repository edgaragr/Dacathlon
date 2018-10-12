package com.backsource.decathlon.util;

import java.util.regex.Pattern;

public class ParserUtil {

	public static double parse(String value) {
		try {
			if(value.chars().filter(ch -> ch == ':').count() == 1) { //it's a date
				return parseTimeToMinutes(value);
			}
            return Double.valueOf(value);
        } catch (NumberFormatException e) {
            return 0;
        }
	}

	private static double parseTimeToMinutes(String value) {  
	    double seconds = 0;  
	    String[] time = value.split(":");
	      
	    if(time.length == 2) {
	    	try {  
	    		seconds = Double.valueOf(time[0]) * 60 + Double.valueOf(time[1]);
		    } catch (Exception e) {  
		        return -1;  
		    }  
	    }
	    
	    return seconds;
	}
	
	public static String parseAthleteName(String name) {
		return matchValue("^[A-Z]{1}[a-z]+\\s[A-Z]{1}[a-z]+$", name);
	}
	
	private static String matchValue(String regExp, String value) {
		return Pattern.matches(regExp, value) ? value : null;
	}
}
