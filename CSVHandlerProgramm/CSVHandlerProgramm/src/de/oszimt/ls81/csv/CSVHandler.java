package de.oszimt.ls81.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dariush
 *
 */
public class CSVHandler {

    /**
     * muss sich im aktuellen Ordner befinden!
     */
    private String file;
    private String delimiter;
    private String line = "";

    /**
     * Default constructor
     */
    public CSVHandler() {
        this(";", "studentNameCSV.csv");
    }

    /**
     * Standard constructor
     * 
     * @param delimiter, Trennzeichen
     * @param file,      Datei zum Einlesen
     */
    // Constructor 2
    public CSVHandler(String delimiter, String file) {
        super();
        this.delimiter = delimiter;
        this.file = file;
    }

    /**
     * Liest alle Schüler aus der csv aus und gibt sie zurück
     * 
     * @return List mit Schülern
     */
    public List<Schueler> getAll() {
        List<Schueler> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(this.file))) {
            String zeile;
            int vorname = 0, nachname = 0, joker = 0, blamieren = 0, frage = 0;
            boolean headerProcessed = false;

            while ((zeile = reader.readLine()) != null) {
                String[] zeilensplit = zeile.split(this.delimiter);
                if (!headerProcessed) {
                    // Identify column indices
                    for (int i = 0; i < zeilensplit.length; i++) {
                        switch (zeilensplit[i].toLowerCase()) {
                            case "vorname": vorname = i; break;
                            case "name": nachname = i; break;
                            case "joker": joker = i; break;
                            case "blamiert": blamieren = i; break;
                            case "fragen": frage = i; break;
                        }
                    }
                    headerProcessed = true;
                    continue;
                }

                // Creating and adding a new Schueler to the list
                String name = zeilensplit[vorname] + " " + zeilensplit[nachname];
                int jokerCount = Integer.parseInt(zeilensplit[joker]);
                int blamierenCount = Integer.parseInt(zeilensplit[blamieren]);
                int fragenCount = Integer.parseInt(zeilensplit[frage]);
                Schueler s = new Schueler(name, jokerCount, blamierenCount, fragenCount);
                students.add(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }


    /**
     * Gibt alle Schüler aus
     * 
     * @param students
     */
    public void printAll(List < Schueler > students) {
    	int longestname = 4;
    	int longestjoker = 5;
    	int longestblamieren = 9;
    	int longestfrage = 5;
        for (Schueler s: students) {
            if (s.getName().length() > longestname) {
            	longestname = s.getName().length();
            }
            if (String.valueOf(s.getJoker()).length() > longestjoker) {
            	longestjoker = String.valueOf(s.getJoker()).length();
            }
            if (String.valueOf(s.getBlamiert()).length() > longestblamieren) {
            	longestblamieren = String.valueOf(s.getBlamiert()).length();
            }
            if (String.valueOf(s.getFragen()).length() > longestfrage) {
            	longestfrage = String.valueOf(s.getFragen()).length();
            }
        }
        longestname += 2;
        longestjoker += 2;
        longestblamieren += 2;
        longestfrage += 2;
    	System.out.printf( "%-" + longestname + "s", "Name" );
    	System.out.printf( "%-" + longestjoker + "s", "Joker" );
    	System.out.printf( "%-" + longestblamieren + "s", "Blamieren" );
    	System.out.printf( "%-" + longestfrage + "s\n", "Frage" );
        for (Schueler s: students) {
        	System.out.printf( "%-" + longestname + "s", s.getName() );
        	System.out.printf( "%-" + longestjoker + "s", s.getJoker() );
        	System.out.printf( "%-" + longestblamieren + "s", s.getBlamiert() );
        	System.out.printf( "%-" + longestfrage + "s\n", s.getFragen() );
        }
    }
}