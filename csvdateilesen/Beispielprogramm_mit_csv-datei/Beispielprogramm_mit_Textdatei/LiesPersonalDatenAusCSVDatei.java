
/** Die Klasse LiesPersonalDatenAusCSVDatei liest die Datei "personaldaten.csv" 
  * und erstellt eine Liste der Objekte der Klasse Person.
  *
  *@version 1.0
  *@author FB-IT
  */

import java.util.*;
import java.io.*;

public class LiesPersonalDatenAusCSVDatei {

	public static void main(String args[]) {

		String dateiname = "personaldaten.csv";

		List<Person> pliste = new ArrayList<Person>();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(dateiname));
			String line;
			String[] pdaten;

			while ((line = reader.readLine()) != null) {
				pdaten = line.split(",");
				pliste.add(new Person(Integer.parseInt(pdaten[0]), pdaten[1], pdaten[2]));
			}
			reader.close();
		}
		catch (IOException e) {
			System.out.println("Lesen fehlgeschlagen!");
		}
		
		System.out.println(pliste);

	}
}
