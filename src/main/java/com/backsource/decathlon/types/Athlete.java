package com.backsource.decathlon.types;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="Athlete")
@XmlAccessorType(XmlAccessType.FIELD)
public class Athlete implements Comparable<Athlete>{	
	private String name;
	
	@XmlElementWrapper(name="results")
	@XmlElement(name="result")
	private List<Result> results;
	
	@XmlAttribute
	private int score;
	
	@XmlAttribute
	private String place;
	
	public Athlete() {
	}
	
	public String getPlace() {
		return place;
	}
	
	public void setPlace(String place) {
		this.place = place;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
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
		return o.getScore() - getScore();
	}
}