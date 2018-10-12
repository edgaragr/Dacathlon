package com.backsource.decathlon.challenges.types;

import com.backsource.decathlon.util.ChallengeScoreUtil;

public class Challenge1500Meters extends ChallengeAbstractType {
	public Challenge1500Meters() {
		super(0.03768, 480, 1.85);
	}
	
	@Override
	public int computeScore(double p) {
		return ChallengeScoreUtil.getTrackScore(getA(), getB(), getC(), p);
	}
}
