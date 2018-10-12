package com.backsource.decathlon.challenges.types;

import com.backsource.decathlon.util.ChallengeScoreUtil;

public class ChallengeLongJump extends ChallengeAbstractType {

	public ChallengeLongJump() {
		super(0.14354, 220, 1.4);
	}
	
	@Override
	public int computeScore(double p) {
		return ChallengeScoreUtil.getFieldScoreJump(getA(), getB(), getC(), p);
	}
}
