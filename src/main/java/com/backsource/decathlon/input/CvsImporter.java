package com.backsource.decathlon.input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.backsource.decathlon.challenges.types.Challenge100Meters;
import com.backsource.decathlon.challenges.types.Challenge110MetersHurdles;
import com.backsource.decathlon.challenges.types.Challenge1500Meters;
import com.backsource.decathlon.challenges.types.Challenge400Meters;
import com.backsource.decathlon.challenges.types.ChallengeDiscusThrow;
import com.backsource.decathlon.challenges.types.ChallengeHighJump;
import com.backsource.decathlon.challenges.types.ChallengeJavelinThrow;
import com.backsource.decathlon.challenges.types.ChallengePoleVault;
import com.backsource.decathlon.challenges.types.ChallengeShotPut;
import com.backsource.decathlon.types.Athlete;
import com.backsource.decathlon.types.Result;
import com.backsource.decathlon.util.ParserUtil;

public class CvsImporter implements Importer {
	private static final String SEPARATOR = ";";
	private String url;
	
	//Columns names
	private final int ATHLETE_NAME = 0;
	private final int CHALLENGE_100M = 1;
	private final int CHALLENGE_LONG_JUMP = 2;
	private final int CHALLENGE_SHOT_PUT = 3;
	private final int CHALLENGE_HIGH_JUMP = 4;
	private final int CHALLENGE_400M = 5;
	private final int CHALLENGE_110M_HURLES = 6;
	private final int CHALLENGE_DISCUS_THROW = 7;
	private final int CHALLENGE_POLE_VAULT = 8;
	private final int CHALLENGE_JAVELIN_THROW = 9;
	private final int CHALLENGE_1500M = 10;
	
	public CvsImporter(String url) {
		this.url = url;
	}
	
	public List<Athlete> loadResults() throws Exception {
		List<Athlete> athletes = new ArrayList<>();
		
			File input = new File(url);
			InputStream is = new FileInputStream(input);
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			athletes = br.lines().map(mapAthlete).filter(result -> result != null).collect(Collectors.toList());
			
			br.close();
			

		return athletes;
	}
	
	private Function<String, Athlete> mapAthlete = (line) -> {
		String[] values = line.split(SEPARATOR);
		
		if(values.length == 11) {
			Athlete athlete = new Athlete();
			athlete.setName(ParserUtil.parseAthleteName(values[ATHLETE_NAME]));
			
			List<Result> results = new ArrayList<>();
			athlete.setResults(results);
			
			for(int i = 1; i < values.length; i++) {
				double result = ParserUtil.parse(values[i]);
				
				switch(i) {
				case CHALLENGE_100M:
					athlete.getResults().add(new Result(new Challenge100Meters(), "100m", result));
					break;
				case CHALLENGE_LONG_JUMP:
					athlete.getResults().add(new Result(new ChallengeHighJump(), "LongJump", result));
					break;
				case CHALLENGE_SHOT_PUT:
					athlete.getResults().add(new Result(new ChallengeShotPut(), "ShotPut", result));
					break;
				case CHALLENGE_HIGH_JUMP:
					athlete.getResults().add(new Result(new ChallengeHighJump(), "HighJump", result));
					break;
				case CHALLENGE_400M:
					athlete.getResults().add(new Result(new Challenge400Meters(), "400m", result));
					break;
				case CHALLENGE_110M_HURLES:
					athlete.getResults().add(new Result(new Challenge110MetersHurdles(), "110mHurdles", result));
					break;
				case CHALLENGE_DISCUS_THROW:
					athlete.getResults().add(new Result(new ChallengeDiscusThrow(), "DiscusThrow", result));
					break;
				case CHALLENGE_POLE_VAULT:
					athlete.getResults().add(new Result(new ChallengePoleVault(), "PoleVault", result));
					break;
				case CHALLENGE_JAVELIN_THROW:
					athlete.getResults().add(new Result(new ChallengeJavelinThrow(), "JavelinThrow", result));
					break;
				case CHALLENGE_1500M:
					athlete.getResults().add(new Result(new Challenge1500Meters(), "1500m", result));
					break;
				}
			}
			
			return athlete;
		}
		
		return null;
	};
}