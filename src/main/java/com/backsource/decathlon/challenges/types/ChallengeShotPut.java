package com.backsource.decathlon.challenges.types;

import com.backsource.decathlon.util.ChallengeScoreUtil;

public class ChallengeShotPut extends ChallengeAbstractType {
	public ChallengeShotPut() {
		super(51.39, 1.5, 1.05);
	}
	
	@Override
	public int computeScore(double p) {
		return ChallengeScoreUtil.getFieldScoreThrowing(getA(), getB(), getC(), p);
	}
}