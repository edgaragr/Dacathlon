package com.backsource.decathlon;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

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
import com.backsource.decathlon.output.XmlExporter;
import com.backsource.decathlon.types.Athlete;
import com.backsource.decathlon.types.Result;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class XmlExporterTest extends TestCase {
	public XmlExporterTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(XmlExporterTest.class);
	}
	
	public void testExportAthletes() {
		String fileName = "outputTest.xml";
		String filePath = System.getProperty("user.home") + File.separator + fileName;
		
		File file = new File(filePath);			
		
		XmlExporter exporter = new XmlExporter(filePath);
		List<Athlete> athletes = getMockList();
		
		try {
			exporter.export(athletes);
		} catch (JAXBException e) {
			fail(e.getMessage());
		}
		
		assertTrue(file.exists());
	}
	
	private List<Athlete> getMockList() {
		List<Athlete> athletes = new ArrayList<>();
		
		Athlete john = new Athlete();
		john.setName("John Smith");
		john.setPlace("1");
		john.setScore(123456);
		
		List<Result> johnResults = new ArrayList<>();
		johnResults.add(new Result(new Challenge100Meters(), "100m", 12.61));
		johnResults.add(new Result(new ChallengeLongJump(), "LongJump", 5));
		johnResults.add(new Result(new ChallengeShotPut(), "ShotPut", 9.22));
		johnResults.add(new Result(new ChallengeHighJump(), "HighJump", 1.5));
		johnResults.add(new Result(new Challenge400Meters(), "400m", 60.39));
		johnResults.add(new Result(new Challenge110MetersHurdles(), "110mHurdles", 16.43));
		johnResults.add(new Result(new ChallengeDiscusThrow(), "DiscusThrow", 21.6));
		johnResults.add(new Result(new ChallengePoleVault(), "PoleVault", 2.6));
		johnResults.add(new Result(new ChallengeJavelinThrow(), "JavelinThrow", 35.81));
		johnResults.add(new Result(new Challenge1500Meters(), "1500m", 1232456.4));
		
		john.setResults(johnResults);
		athletes.add(john);
		
		Athlete jane = new Athlete();
		jane.setName("Jane Doe");
		jane.setPlace("2");
		jane.setScore(123455);
		
		List<Result> janeResults = new ArrayList<>();
		janeResults.add(new Result(new Challenge100Meters(), "100m", 13.04));
		janeResults.add(new Result(new ChallengeLongJump(), "LongJump", 4.53));
		janeResults.add(new Result(new ChallengeShotPut(), "ShotPut", 7.79));
		janeResults.add(new Result(new ChallengeHighJump(), "HighJump", 1.55));
		janeResults.add(new Result(new Challenge400Meters(), "400m", 64.72));
		janeResults.add(new Result(new Challenge110MetersHurdles(), "110mHurdles", 18.74));
		janeResults.add(new Result(new ChallengeDiscusThrow(), "DiscusThrow", 24.2));
		janeResults.add(new Result(new ChallengePoleVault(), "PoleVault", 2.4));
		janeResults.add(new Result(new ChallengeJavelinThrow(), "JavelinThrow", 28.2));
		janeResults.add(new Result(new Challenge1500Meters(), "1500m", 1232458.4));
		
		jane.setResults(janeResults);
		athletes.add(jane);
				
		return athletes;
	}
}
