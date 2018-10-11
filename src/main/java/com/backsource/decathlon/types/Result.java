package com.backsource.decathlon.types;

public class Result {
	private ResultChallenge name;
	private double value;
	
	public Result(ResultChallenge name, double value) {
		this.name = name;
		this.value = value;
	}
	
	public ResultChallenge getName() {
		return name;
	}
	
	public void setName(ResultChallenge name) {
		this.name = name;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
}
