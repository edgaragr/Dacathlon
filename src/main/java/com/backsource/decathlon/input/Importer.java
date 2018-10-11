package com.backsource.decathlon.input;

import java.util.List;

import com.backsource.decathlon.types.Athlete;

public interface Importer {
	//Columns names
	int ATHLETE_NAME = 0;
	int CHALLENGE_100M = 1;
	int CHALLENGE_LONG_JUMP = 2;
	int CHALLENGE_SHOT_PUT = 3;
	int CHALLENGE_HIGH_JUMP = 4;
	int CHALLENGE_400M = 5;
	int CHALLENGE_110M_HURLES = 6;
	int CHALLENGE_DISCUS_THROW = 7;
	int CHALLENGE_POLE_VAULT = 8;
	int CHALLENGE_JAVELIN_THROW = 9;
	int CHALLENGE_1500M = 10;
	
	List<Athlete> loadResults();
}