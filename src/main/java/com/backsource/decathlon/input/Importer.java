package com.backsource.decathlon.input;

import java.util.List;

import com.backsource.decathlon.types.Athlete;

public interface Importer {	
	List<Athlete> loadResults();
}