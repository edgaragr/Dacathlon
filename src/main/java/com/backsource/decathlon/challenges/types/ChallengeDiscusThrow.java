package com.backsource.decathlon.challenges.types;

import com.backsource.decathlon.util.ChallengeScoreUtil;

public class ChallengeDiscusThrow extends ChallengeAbstractType {

	public ChallengeDiscusThrow() {
		super(12.91, 4, 1.1);
	}
	
	@Override
	public int computeScore(double p) {
		return ChallengeScoreUtil.getFieldScoreThrowing(getA(), getB(), getC(), p);
	}
}
