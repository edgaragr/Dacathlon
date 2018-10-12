package com.backsource.decathlon;

import java.util.ArrayList;
import java.util.List;

import com.backsource.decathlon.challenges.types.Challenge100Meters;
import com.backsource.decathlon.challenges.types.Challenge110MetersHurdles;
import com.backsource.decathlon.challenges.types.Challenge1500Meters;
import com.backsource.decathlon.challenges.types.Challenge400Meters;
import com.backsource.decathlon.challenges.types.ChallengeDiscusThrow;
import com.backsource.decathlon.challenges.types.ChallengeHighJump;
import com.backsource.decathlon.challenges.types.ChallengeJavelinThrow;
import com.backsource.decathlon.challenges.types.ChallengeLongJump;
import com.backsource.decathlon.challenges.types.ChallengePoleVault;
import com.backsource.decathlon.challenges.types.ChallengeShotPut;
import com.backsource.decathlon.types.Athlete;
import com.backsource.decathlon.types.Result;

import junit.framework.TestCase;

public abstract class AbstractTestCase extends TestCase{
	public AbstractTestCase(String name) {
		super(name);
	}
	
	public List<Athlete> getMockList() {
		List<Athlete> athletes = new ArrayList<>();
		
		Athlete kevinMayer = new Athlete();
		kevinMayer.setName("Kevin Mayer");
		kevinMayer.setPlace("1");
		kevinMayer.setScore(0);
		
		List<Result> kevinMayerResults = new ArrayList<>();
		kevinMayerResults.add(new Result(new Challenge100Meters(), "100m", 10.55));
		kevinMayerResults.add(new Result(new ChallengeLongJump(), "LongJump", 7.80));
		kevinMayerResults.add(new Result(new ChallengeShotPut(), "ShotPut", 16.00));
		kevinMayerResults.add(new Result(new ChallengeHighJump(), "HighJump", 2.05));
		kevinMayerResults.add(new Result(new Challenge400Meters(), "400m", 48.42));
		kevinMayerResults.add(new Result(new Challenge110MetersHurdles(), "110mHurdles", 13.75));
		kevinMayerResults.add(new Result(new ChallengeDiscusThrow(), "DiscusThrow", 50.54));
		kevinMayerResults.add(new Result(new ChallengePoleVault(), "PoleVault", 5.45));
		kevinMayerResults.add(new Result(new ChallengeJavelinThrow(), "JavelinThrow", 71.90));
		kevinMayerResults.add(new Result(new Challenge1500Meters(), "1500m", 276.11)); //4:36.11
		
		kevinMayer.setResults(kevinMayerResults);
		athletes.add(kevinMayer);
		
		/***************************************************************************************************/
		
		Athlete ashtonEaton = new Athlete();
		ashtonEaton.setName("Asthon Eaton");
		ashtonEaton.setPlace("2");
		ashtonEaton.setScore(0);
		
		List<Result> ashtonEatonResults = new ArrayList<>();
		ashtonEatonResults.add(new Result(new Challenge100Meters(), "100m", 10.23));
		ashtonEatonResults.add(new Result(new ChallengeLongJump(), "LongJump", 7.88));
		ashtonEatonResults.add(new Result(new ChallengeShotPut(), "ShotPut", 14.52));
		ashtonEatonResults.add(new Result(new ChallengeHighJump(), "HighJump", 2.01));
		ashtonEatonResults.add(new Result(new Challenge400Meters(), "400m", 45.00));
		ashtonEatonResults.add(new Result(new Challenge110MetersHurdles(), "110mHurdles", 13.69));
		ashtonEatonResults.add(new Result(new ChallengeDiscusThrow(), "DiscusThrow", 43.34));
		ashtonEatonResults.add(new Result(new ChallengePoleVault(), "PoleVault", 5.20));
		ashtonEatonResults.add(new Result(new ChallengeJavelinThrow(), "JavelinThrow", 63.63));
		ashtonEatonResults.add(new Result(new Challenge1500Meters(), "1500m", 257.52)); //4:17.52
		
		ashtonEaton.setResults(ashtonEatonResults);
		athletes.add(ashtonEaton);
		
		/***************************************************************************************************/
		
		Athlete ashtonEatonSon = new Athlete();
		ashtonEatonSon.setName("Asthon Eaton");
		ashtonEatonSon.setPlace("2");
		ashtonEatonSon.setScore(0);
		
		List<Result> ashtonEatonSonResults = new ArrayList<>();
		ashtonEatonSonResults.add(new Result(new Challenge100Meters(), "100m", 10.23));
		ashtonEatonSonResults.add(new Result(new ChallengeLongJump(), "LongJump", 7.88));
		ashtonEatonSonResults.add(new Result(new ChallengeShotPut(), "ShotPut", 14.52));
		ashtonEatonSonResults.add(new Result(new ChallengeHighJump(), "HighJump", 2.01));
		ashtonEatonSonResults.add(new Result(new Challenge400Meters(), "400m", 45.00));
		ashtonEatonSonResults.add(new Result(new Challenge110MetersHurdles(), "110mHurdles", 13.69));
		ashtonEatonSonResults.add(new Result(new ChallengeDiscusThrow(), "DiscusThrow", 43.34));
		ashtonEatonSonResults.add(new Result(new ChallengePoleVault(), "PoleVault", 5.20));
		ashtonEatonSonResults.add(new Result(new ChallengeJavelinThrow(), "JavelinThrow", 63.63));
		ashtonEatonSonResults.add(new Result(new Challenge1500Meters(), "1500m", 257.52)); //4:17.52
		
		ashtonEatonSon.setResults(ashtonEatonResults);
		athletes.add(ashtonEatonSon);
		
		/***************************************************************************************************/
		
		Athlete kevinMayerSon = new Athlete();
		kevinMayerSon.setName("Asthon Eaton");
		kevinMayerSon.setPlace("2");
		kevinMayerSon.setScore(0);
		
		List<Result> kevinMayerSonResults = new ArrayList<>();
		kevinMayerSonResults.add(new Result(new Challenge100Meters(), "100m", 20.23));
		kevinMayerSonResults.add(new Result(new ChallengeLongJump(), "LongJump", 7.88));
		kevinMayerSonResults.add(new Result(new ChallengeShotPut(), "ShotPut", 14.52));
		kevinMayerSonResults.add(new Result(new ChallengeHighJump(), "HighJump", 2.01));
		kevinMayerSonResults.add(new Result(new Challenge400Meters(), "400m", 45.00));
		kevinMayerSonResults.add(new Result(new Challenge110MetersHurdles(), "110mHurdles", 13.69));
		kevinMayerSonResults.add(new Result(new ChallengeDiscusThrow(), "DiscusThrow", 43.34));
		kevinMayerSonResults.add(new Result(new ChallengePoleVault(), "PoleVault", 5.20));
		kevinMayerSonResults.add(new Result(new ChallengeJavelinThrow(), "JavelinThrow", 63.63));
		kevinMayerSonResults.add(new Result(new Challenge1500Meters(), "1500m", 257.52)); //4:17.52
		
		kevinMayerSon.setResults(kevinMayerSonResults);
		athletes.add(kevinMayerSon);
		
		/***************************************************************************************************/
		return athletes;
	}
}
