package com.backsource.decathlon.output;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.backsource.decathlon.types.Athlete;

@XmlRootElement(name="decathlonResults")
@XmlAccessorType(XmlAccessType.FIELD)
public class DecathlonResults {
	
	@XmlElement(name="athlete")
	private List<Athlete> athletes;
	
	public DecathlonResults(List<Athlete> athletes) {
		this.athletes = athletes;
	}
	
	public List<Athlete> getAthletes() {
		return athletes;
	}
	
	public void setAthletes(List<Athlete> athletes) {
		this.athletes = athletes;
	}
	
	public DecathlonResults() {
	}
}
