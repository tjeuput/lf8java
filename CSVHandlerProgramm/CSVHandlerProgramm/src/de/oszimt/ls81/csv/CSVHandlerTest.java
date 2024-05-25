package de.oszimt.ls81.csv;

import java.util.List;

/**
 * @author dariush
 *
 */
public class CSVHandlerTest {

	/**
	 * Testklasse
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		CSVHandler csv = new CSVHandler();

		List<Schueler> students = csv.getAll();

		csv.printAll(students);

	}
}
