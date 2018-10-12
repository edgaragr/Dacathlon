package com.backsource.decathlon.output;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.backsource.decathlon.types.Athlete;

public class XmlExporter implements Exporter {
	private String name;
	
	public XmlExporter(String name) {
		this.name = name;
	}
	
	public void export(List<Athlete> athletes) throws JAXBException {
		DecathlonResults results = new DecathlonResults(athletes);
		
		JAXBContext jc = JAXBContext.newInstance(DecathlonResults.class);
		Marshaller marshaller = jc.createMarshaller();
		
		marshaller.marshal(results, new File(name));
	}
}