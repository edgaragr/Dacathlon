package com.backsource.decathlon.util;

import java.util.regex.Pattern;

public class ParserUtil {

	public static double parse(String value) {
		try {
			if(value.chars().filter(ch -> ch == ':').count() == 1) { //mm:ss
				return parseTimeToSeconds(value);
			}
            return Double.valueOf(value);
        } catch (NumberFormatException e) {
            return 0;
        }
	}

	private static double parseTimeToSeconds(String value) {  
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
		return matchValidCharacters("^[A-Z]{1}[a-z]+\\s[A-Z]{1}[a-z]+$", name);
	}
	
	private static String matchValidCharacters(String regExp, String value) {
		return Pattern.matches(regExp, value) ? value : null;
	}
}
