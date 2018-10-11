package com.backsource.decathlon.util;

import java.util.regex.Pattern;

public class ParserUtility {

	public static double parse(String value) {
		try {
			if(value.chars().filter(ch -> ch == '.').count() == 2) { //it's a date
				return parseTimeToMinutes(value);
			}
            return Double.valueOf(value);
        } catch (NumberFormatException e) {
            return 0;
        }
	}

	private static double parseTimeToMinutes(String value) {  
	    double minutes = 0;  
	    String[] split = value.split(".");  
	      
	    try {  
	        minutes += Double.parseDouble(split[0])*60;  
	        minutes += Double.parseDouble(split[1]);  
	        minutes += Double.parseDouble(split[2])/60;  
	        return minutes;  
	      
	    } catch (Exception e) {  
	        return -1;  
	    }  
	}
	
	public static String parseAthleteName(String name) {
		return matchValue("^[A-Z]{1}[a-z]+\\s[A-Z]{1}[a-z]+$", name);
	}
	
	private static String matchValue(String regExp, String value) {
		return Pattern.matches(regExp, value) ? value : null;
	}
}
