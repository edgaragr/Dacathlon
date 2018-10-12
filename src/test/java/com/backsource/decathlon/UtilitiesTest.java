package com.backsource.decathlon;

import java.util.List;

import com.backsource.decathlon.types.Athlete;
import com.backsource.decathlon.util.ChallengeScoreUtil;
import com.backsource.decathlon.util.ParserUtil;
import com.backsource.decathlon.util.ScoreCalculatorUtil;

import junit.framework.Test;
import junit.framework.TestSuite;

public class UtilitiesTest extends AbstractTestCase {
	private List<Athlete> athletes;
	
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
		String time = "5:25.72";
		double expectedValue = 325.72;
		double resultValue = ParserUtil.parse(time);
		
		assertEquals(expectedValue,resultValue);		
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

		
		assertEquals(expectedValue, ChallengeScoreUtil.getFieldScoreJumping(a, b, c, p));
	}
	
	/* 
	 * Score Calculator Unit Tests
	 * */
	public void testCalculateScores() {
		athletes = getMockList();
		
		ScoreCalculatorUtil.calculateScores(athletes);
		assertEquals(9126 , athletes.get(0).getScore());
		assertEquals(9045 , athletes.get(1).getScore());
	}
	
	public void testAssignPlaces() {
		athletes = getMockList();
		ScoreCalculatorUtil.calculateScores(athletes);
		
		ScoreCalculatorUtil.assignPlaces(athletes);
		assertTrue(athletes.get(0).getPlace().equals("1"));
		assertTrue(athletes.get(1).getPlace().equals("2-3"));
		assertTrue(athletes.get(2).getPlace().equals("2-3"));
		assertTrue(athletes.get(3).getPlace().equals("4"));
	}
}
