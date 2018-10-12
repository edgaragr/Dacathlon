package com.backsource.decathlon.util;

import java.util.List;
import com.backsource.decathlon.types.Athlete;
import com.backsource.decathlon.types.Result;

public class ScoreCalculatorUtil {
	public static void calculateScores(List<Athlete> athletes) {
		for(Athlete athlete : athletes) {
			int score = 0;
			
			for(Result result : athlete.getResults()) {
				score += result.getType().computeScore(result.getValue());
			}
			
			athlete.setScore(score);
		}
	}
	
	public static void assignPlaces(List<Athlete> athletes) {
		int currentPlace = 1;
		int previousPlace = 0;
		int previousScore = 0;
		
		for(Athlete athlete : athletes) {
			if(athlete.getScore() != previousScore) {
				athlete.setPlace(String.valueOf(currentPlace));
				previousPlace = currentPlace;				
			} else {
				String place = String.valueOf(previousPlace) + "-" + String.valueOf(currentPlace);
				for(int j = previousPlace-1; j < currentPlace; j++) {
					athletes.get(j).setPlace(place);
				}
			}
			
			previousScore = athlete.getScore();
			currentPlace++;
		}
	}
}