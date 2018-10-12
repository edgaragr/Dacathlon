package com.backsource.decathlon.challenges.types;

public abstract class ChallengeAbstractType {
	private double a;
	private double b;
	private double c;
	
	public ChallengeAbstractType(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	public abstract int computeScore(double p);
}
