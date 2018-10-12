package com.backsource.decathlon.challenges.types;

import com.backsource.decathlon.util.ChallengeScoreUtil;

public class Challenge400Meters extends ChallengeAbstractType {

	public Challenge400Meters() {
		super(1.53775, 82, 1.81);
	}
	@Override
	public int computeScore(double p) {
		return ChallengeScoreUtil.getTrackScore(getA(), getB(), getC(), p);
	}
}
