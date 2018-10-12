package com.backsource.decathlon;

import java.util.List;

import com.backsource.decathlon.input.CvsImporter;
import com.backsource.decathlon.types.Athlete;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class DecathlonCalculatorTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DecathlonCalculatorTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DecathlonCalculatorTest.class );
    }
    
    public void testLoadDataFromCSV() {
    	String filePath = "results.csv";
    	CvsImporter importer = new CvsImporter(filePath);
    	
    	List<Athlete> results = null;
    	
		try {
			results = importer.loadResults();
		} catch (Exception e) {
			fail(e.getMessage());
		}
    
    	assertEquals(4, results.size());
    }
    
    public void testFailOnWrongFileExtention() {
    	String filePath = "README.md";
    	CvsImporter importer = new CvsImporter(filePath);
    	try {
			List<Athlete> results = importer.loadResults();
		} catch (Exception e) {
			assertTrue(e.getMessage().contains("FileNotFoundException"));
		}    	
    }
}
