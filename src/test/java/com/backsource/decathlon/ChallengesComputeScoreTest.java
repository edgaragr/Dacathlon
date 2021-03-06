package com.backsource.decathlon;

import com.backsource.decathlon.challenges.types.Challenge100Meters;
import com.backsource.decathlon.challenges.types.Challenge110MetersHurdles;
import com.backsource.decathlon.challenges.types.Challenge1500Meters;
import com.backsource.decathlon.challenges.types.Challenge400Meters;
import com.backsource.decathlon.challenges.types.ChallengeAbstractType;
import com.backsource.decathlon.challenges.types.ChallengeDiscusThrow;
import com.backsource.decathlon.challenges.types.ChallengeHighJump;
import com.backsource.decathlon.challenges.types.ChallengeJavelinThrow;
import com.backsource.decathlon.challenges.types.ChallengeLongJump;
import com.backsource.decathlon.challenges.types.ChallengePoleVault;
import com.backsource.decathlon.challenges.types.ChallengeShotPut;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ChallengesComputeScoreTest extends TestCase {
	public ChallengesComputeScoreTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(ChallengesComputeScoreTest.class);
	}

	public void testChallenge100MetersComputeScore() {
		ChallengeAbstractType challenge = new Challenge100Meters();
		double p = 9.58;
		
		assertEquals(1202, challenge.computeScore(p));
	}
	
	public void testChallenge110MetersHurdlesComputeScore() {
		ChallengeAbstractType challenge = new Challenge110MetersHurdles();		
		double p = 12.80;
		
		assertEquals(1135, challenge.computeScore(p));
	}
	
	public void testChallenge1500MetersComputeScore() {
		ChallengeAbstractType challenge = new Challenge1500Meters();		
		double p = 206;
		
		assertEquals(1218, challenge.computeScore(p));
	}
	
	public void testChallenge400MetersComputeScore() {
		ChallengeAbstractType challenge = new Challenge400Meters();		
		double p = 43.03;
		
		assertEquals(1164, challenge.computeScore(p));
	}
	
	public void testChallengeDiscusThrowComputeScore() {
		ChallengeAbstractType challenge = new ChallengeDiscusThrow();		
		double p = 74.08;
		
		assertEquals(1383, challenge.computeScore(p));
	}
	
	public void testChallengeHighJumpComputeScore() {
		ChallengeAbstractType challenge = new ChallengeHighJump();		
		double p = 2.27;
		
		assertEquals(1061, challenge.computeScore(p));
	}
	
	public void testChallengeJavelinThrowComputeScore() {
		ChallengeAbstractType challenge = new ChallengeJavelinThrow();		
		double p = 98.48;
		
		assertEquals(1331, challenge.computeScore(p));
	}
	
	public void testChallengeLongJumpComputeScore() {
		ChallengeAbstractType challenge = new ChallengeLongJump();		
		double p = 8.95;
		
		assertEquals(1312, challenge.computeScore(p));
	}
	
	public void testChallengePoleVaultComputeScore() {
		ChallengeAbstractType challenge = new ChallengePoleVault();		
		double p = 6.16;
		
		assertEquals(1284, challenge.computeScore(p));
	}
	
	public void testChallengeShotPutComputeScor() {
		ChallengeAbstractType challenge = new ChallengeShotPut();		
		double p = 23.12;
		
		assertEquals(1295, challenge.computeScore(p));
	}
}
