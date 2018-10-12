package com.backsource.decathlon.util;

public class ChallengeScoreUtil {
	public static int getTrackScore(double a, double b, double c, double p) {
		return (int) (a * Math.pow((b - p), c));
	}
	
	public static int getFieldScoreJump(double a, double b, double c, double p) {
		return (int) (a * Math.pow((100 * p - b), c));
	}
	
	public static int getFieldScoreThrowing(double a, double b, double c, double p) {
		return (int) (a * Math.pow((p - b), c));
	}
}