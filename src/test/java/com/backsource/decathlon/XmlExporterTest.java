package com.backsource.decathlon;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBException;

import com.backsource.decathlon.output.XmlExporter;
import com.backsource.decathlon.types.Athlete;

import junit.framework.Test;
import junit.framework.TestSuite;

public class XmlExporterTest extends AbstractTestCase {
	public XmlExporterTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(XmlExporterTest.class);
	}
	
	public void testExportAthletes() {
		String fileName = "outputTest.xml";
		String filePath = System.getProperty("user.home") + File.separator + fileName;
		
		File file = new File(filePath);			
		
		XmlExporter exporter = new XmlExporter(filePath);
		List<Athlete> athletes = getMockList();
		
		try {
			exporter.export(athletes);
		} catch (JAXBException e) {
			fail(e.getMessage());
		}
		
		assertTrue(file.exists());
	}
}
