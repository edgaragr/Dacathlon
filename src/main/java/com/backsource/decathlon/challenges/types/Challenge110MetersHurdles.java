package com.backsource.decathlon.challenges.types;

import com.backsource.decathlon.util.ChallengeScoreUtil;

public class Challenge110MetersHurdles extends ChallengeAbstractType {

	public Challenge110MetersHurdles() {
		super(5.74352, 28.5, 1.92);
	}
	
	@Override
	public int computeScore(double p) {
		return ChallengeScoreUtil.getTrackScore(getA(), getB(), getC(), p);
	}
}
