package com.backsource.decathlon;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.backsource.decathlon.input.CvsImporter;
import com.backsource.decathlon.input.Importer;
import com.backsource.decathlon.output.Exporter;
import com.backsource.decathlon.output.XmlExporter;
import com.backsource.decathlon.types.Athlete;
import com.backsource.decathlon.util.ScoreCalculatorUtil;

public class DecathlonCalculator 
{
    public static void main( String[] args )
    {
        System.out.println("Decathlon Results Calculator");
        System.out.println("Enter CSV file path: ");
        Scanner scanner = new Scanner(System.in);
        
        String filePath = scanner.nextLine();
        
        scanner.close();
        
        Importer importer = new CvsImporter(filePath);
        List<Athlete> athletes = null;
		
        try {
			athletes = importer.loadResults();
			
	        ScoreCalculatorUtil.calculateScores(athletes);
	        
	        Collections.sort(athletes);
	        
	        ScoreCalculatorUtil.assignPlaces(athletes);
	        
	        String fileName = "decathonResults.xml";
			String outPutFileName = System.getProperty("user.home") + File.separator + fileName;
				
	        Exporter xmlExporter = new XmlExporter(outPutFileName);
	        xmlExporter.export(athletes);
	        
	        System.out.println("Output file Generated:" + outPutFileName);
	        
	        
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
}