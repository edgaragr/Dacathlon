package com.backsource.decathlon.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

import com.backsource.decathlon.challenges.types.ChallengeAbstractType;

@XmlType(name="Result")
@XmlAccessorType(XmlAccessType.FIELD)
public class Result {	
	@XmlTransient
	private ChallengeAbstractType type;
	
	@XmlAttribute
	private String name;
	
	@XmlValue
	private double value;
	
	public Result() {
	}
	
	public Result(ChallengeAbstractType type, String name, double value) {
		this.type = type;
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public ChallengeAbstractType getType() {
		return type;
	}
	
	public void setType(ChallengeAbstractType type) {
		this.type = type;
	}
	
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
}
