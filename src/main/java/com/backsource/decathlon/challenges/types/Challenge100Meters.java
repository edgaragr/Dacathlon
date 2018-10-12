package com.backsource.decathlon.challenges.types;

import com.backsource.decathlon.util.ChallengeScoreUtil;

public class Challenge100Meters extends ChallengeAbstractType {
	
	public Challenge100Meters() {
		super(25.4347, 18, 1.81);
	}
	
	@Override
	public int computeScore(double p) {
		return ChallengeScoreUtil.getTrackScore(getA(), getB(), getC(), p);
	}
}