package com.backsource.decathlon.challenges.types;

import com.backsource.decathlon.util.ChallengeScoreUtil;

public class ChallengeHighJump extends ChallengeAbstractType {

	public ChallengeHighJump() {
		super(0.8465, 75, 1.42);
	}
	
	@Override
	public int computeScore(double p) {
		return ChallengeScoreUtil.getFieldScoreJumping(getA(), getB(), getC(), p);
	}
}
