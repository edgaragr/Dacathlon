package com.backsource.decathlon.input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.backsource.decathlon.types.Athlete;
import com.backsource.decathlon.types.Result;
import com.backsource.decathlon.types.ResultChallenge;
import com.backsource.decathlon.util.ParserUtility;

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
	
	public List<Athlete> loadResults() {
		List<Athlete> athletes = new ArrayList<>();
		
		try {
			File input = new File(url);
			InputStream is = new FileInputStream(input);
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			athletes = br.lines().map(mapAthlete).filter(result -> result != null).collect(Collectors.toList());
			
			br.close();
			
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		return athletes;
	}
	
	private Function<String, Athlete> mapAthlete = (line) -> {
		String[] values = line.split(SEPARATOR);
		
		if(values.length == 11) {
			Athlete athlete = new Athlete();
			athlete.setName(ParserUtility.parseAthleteName(values[ATHLETE_NAME]));
			
			List<Result> results = new ArrayList<>();
			athlete.setResults(results);
			
			for(int i = 1; i < values.length; i++) {
				double result = ParserUtility.parse(values[i]);
				
				switch(i) {
				case CHALLENGE_100M:
					athlete.getResults().add(new Result(ResultChallenge.CHALLENGE_100M, result));
					break;
				case CHALLENGE_LONG_JUMP:
					athlete.getResults().add(new Result(ResultChallenge.CHALLANGE_LONG_JUMP, result));
					break;
				case CHALLENGE_SHOT_PUT:
					athlete.getResults().add(new Result(ResultChallenge.CHALLENGE_SHOT_PUT, result));
					break;
				case CHALLENGE_HIGH_JUMP:
					athlete.getResults().add(new Result(ResultChallenge.CHALLENGE_HIGH_JUMP, result));
					break;
				case CHALLENGE_400M:
					athlete.getResults().add(new Result(ResultChallenge.CHALLENGE_400M, result));
					break;
				case CHALLENGE_110M_HURLES:
					athlete.getResults().add(new Result(ResultChallenge.CHALLENGE_110M_HURLES, result));
					break;
				case CHALLENGE_DISCUS_THROW:
					athlete.getResults().add(new Result(ResultChallenge.CHALLENGE_DISCUS_THROW, result));
					break;
				case CHALLENGE_POLE_VAULT:
					athlete.getResults().add(new Result(ResultChallenge.CHALLENGE_POLE_VAULT, result));
					break;
				case CHALLENGE_JAVELIN_THROW:
					athlete.getResults().add(new Result(ResultChallenge.CHALLENGE_JAVELIN_THROW, result));
					break;
				case CHALLENGE_1500M:
					athlete.getResults().add(new Result(ResultChallenge.CHALLENGE_1500M, result));
					break;
				}
			}
			
			return athlete;
		}
		
		return null;
	};
}