
/** Die Klasse PersonalDatenToCSV speichert eine Liste der Objekte der Klasse Person in CSV Format in eine Datei.
  *
  *@version 1.0
  *@author FB-IT
  */

import java.util.*;
import java.io.*;

public class SchreibePersonalDatenInCSVDatei {

	public static void main(String args[]) {

		String dateiname = "personaldaten.csv";

		List<Person> pliste = new ArrayList<Person>();
		
		pliste.add(new Person(1001, "Axel Müller", "01.02.1998"));
		pliste.add(new Person(1002, "Anna Lustig", "11.12.2000"));
		pliste.add(new Person(1003, "Uwe Kaiser", "25.09.1992"));
		pliste.add(new Person(1004, "Yasmin Güzel", "21.06.2005"));


		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(dateiname));

			for (Person p : pliste) {
				String pstring = p.getPersonalnummer() + "," + p.getName() + "," + p.getGeburtsdatum();
				writer.write(pstring);
				writer.newLine();
			}
			writer.close();
		}
		catch (IOException e) {
			System.out.println("Schreiben fehlgeschlagen!");
		}

	}
}
