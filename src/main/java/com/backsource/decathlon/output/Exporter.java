package com.backsource.decathlon.output;

import java.util.List;
import com.backsource.decathlon.types.Athlete;

public interface Exporter {
	void export(List<Athlete> athletes) throws Exception;
}