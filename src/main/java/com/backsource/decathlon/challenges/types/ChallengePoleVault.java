package com.backsource.decathlon.challenges.types;

import com.backsource.decathlon.util.ChallengeScoreUtil;

public class ChallengePoleVault extends ChallengeAbstractType {

	public ChallengePoleVault() {
		super(0.2797, 100, 1.35);
	}
	
	@Override
	public int computeScore(double p) {
		return ChallengeScoreUtil.getFieldScoreJumping(getA(), getB(), getC(), p);
	}
}
