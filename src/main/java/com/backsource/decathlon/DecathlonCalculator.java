package com.backsource.decathlon;

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
        
        //1. Leer los atletas
        Importer importer = new CvsImporter(filePath);
        List<Athlete> athletes = null;
		
        try {
			athletes = importer.loadResults();
			
			 //2. Calcular el puntaje por cada atleta
	        ScoreCalculatorUtil.calculateScores(athletes);
	        
	        //3. Ordenar por puntaje
	        Collections.sort(athletes);
	        
	        //4. Asignar posiciones
	        ScoreCalculatorUtil.assignPlaces(athletes);
	        
	        Exporter xmlExporter = new XmlExporter("scoreBoard.xml");
	        xmlExporter.export(athletes);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
}