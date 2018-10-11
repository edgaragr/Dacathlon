package com.backsource.decathlon;

import java.util.List;
import java.util.Scanner;

import com.backsource.decathlon.input.CvsImporter;
import com.backsource.decathlon.input.Importer;
import com.backsource.decathlon.types.Athlete;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Decathlon Results Calculator");
        System.out.println("Enter CSV file path: ");
        Scanner scanner = new Scanner(System.in);
        
        String filePath = scanner.nextLine();
        Importer importer = new CvsImporter(filePath);
     
        List<Athlete> athletes = importer.loadResults();
        for(Athlete atleta : athletes) {
        	System.out.println(atleta.getName());
        }
        
        scanner.close();
    }
}
