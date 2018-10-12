package com.backsource.decathlon.challenges.types;

import com.backsource.decathlon.util.ChallengeScoreUtil;

public class ChallengeJavelinThrow extends ChallengeAbstractType {
	public ChallengeJavelinThrow() {
		super(10.14, 7, 1.08);
	}
	
	@Override
	public int computeScore(double p) {
		return ChallengeScoreUtil.getFieldScoreThrowing(getA(), getB(), getC(), p);
	}

}
