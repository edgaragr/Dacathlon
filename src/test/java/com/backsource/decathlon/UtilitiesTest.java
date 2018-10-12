package com.backsource.decathlon;

import com.backsource.decathlon.util.ChallengeScoreUtil;
import com.backsource.decathlon.util.ParserUtil;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class UtilitiesTest extends TestCase {
	public UtilitiesTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(UtilitiesTest.class);
	}
	
	/* 
	 * Parser Unit Tests
	 * */
	public void testParseDouble() {
		String inputValue = "13.6";
		double expectedValue = 13.6;
		
		assertEquals(expectedValue, ParserUtil.parse(inputValue));
	}
	
	public void testParseTime() {
		String time = "";
		double expectedValue = 0;
		double resultValue = ParserUtil.parse(time);
		
		assertEquals(expectedValue,resultValue);
		assertNotSame(-1, resultValue);		
	}
	
    public void testIsNameValid() {
    	String name = "Edgar Garcia";
    	assertEquals(name, ParserUtil.parseAthleteName(name));
    }
	
	/* 
	 * ChallengeScore Unit Tests
	 * */
	public void testGetTrackScore() {
		int expectedValue = 1202;

		double b = 18;
		double a = 25.4347;
		double c = 1.81;
		double p = 9.58;
		
		assertEquals(expectedValue, ChallengeScoreUtil.getTrackScore(a, b, c, p));
	}
	
	public void testGetFieldThrowingScore() {
		int expectedValue = 1383;	
		
		double b = 4;
		double a = 12.91;
		double c = 1.1;
		double p = 74.08;

		assertEquals(expectedValue, ChallengeScoreUtil.getFieldScoreThrowing(a, b, c, p));
	}
	
	public void testGetFieldJumpScore() {
		int expectedValue = 1312;	
		
		double b = 220;
		double a = 0.14354;
		double c = 1.4;
		double p = 8.95;

		
		assertEquals(expectedValue, ChallengeScoreUtil.getFieldScoreJump(a, b, c, p));
	}
	
	/* 
	 * ChallengeScore Unit Tests
	 * */
	public void testCalculateScores() {
		fail();
	}
	
	public void testAssignPlaces() {
		fail();
	}
}
