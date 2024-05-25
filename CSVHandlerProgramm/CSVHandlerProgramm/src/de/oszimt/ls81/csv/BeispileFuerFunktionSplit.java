package de.oszimt.ls81.csv;

public class BeispileFuerFunktionSplit {
	public static void main(String[] args) {
		String str= "word1 word2 word3";

		// mit Leerzeichen splitten
		String[] wordlist = str.split(" ");
		
		// nur letztes Wort word3 ausgeben
		System.out.println(wordlist[2]);

		// erstes Wort word1 ausgeben
		System.out.println(wordlist[0]);

	}
}
