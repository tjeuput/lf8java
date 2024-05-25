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
	  Schueler s = null;
      List < Schueler > students = new ArrayList < Schueler > ();

      try {

         

          }
         

      } catch (IOException e) {
         
      } catch (Exception e) {
          
      }

     
  }

  /**
   * Gibt alle Schüler aus
   * 
   * @param students
   */
  public void printAll(List<Schueler> students) {
    for (Schueler s : students) {
      System.out.println(s.getName());
    }
  }
}
