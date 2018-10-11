package com.backsource.decathlon;

import java.util.List;

import com.backsource.decathlon.input.CvsImporter;
import com.backsource.decathlon.types.Athlete;
import com.backsource.decathlon.util.ParserUtility;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testIsNameValid() {
    	String name = "Edgar Garcia";
    	assertEquals(name, ParserUtility.parseAthleteName(name));
    }
    
    public void testLoadDataFromCSV() {
    	String filePath = "/Users/egarcia/results.csv";
    	CvsImporter importer = new CvsImporter(filePath);
    	List<Athlete> results = importer.loadResults();
    
    	assertEquals(4, results.size());
    	//assertNotNull(results);
    }
}
