package com.backsource.decathlon.types;

import java.util.List;

public class Athlete implements Comparable<Athlete>{
	private String name;
	private List<Result> results;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setResults(List<Result> results) {
		this.results = results;
	}
	
	public List<Result> getResults() {
		return results;
	}
	
	public int compareTo(Athlete o) {
		return 0;
	}
}
