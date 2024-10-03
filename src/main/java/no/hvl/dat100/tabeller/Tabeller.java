package no.hvl.dat100.tabeller;

public class Tabeller {

	// a) Sigrid
	public static void skrivUt(int[] tabell) {

		System.out.print("[");
		
		for (int i = 0; i < tabell.length; i++) {
			System.out.print (tabell[i] + "");
		}
		
		System.out.print("]");
		
	}

	// b) Julie
	public static String tilStreng(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
	}

	// c) Sigrid
	public static int summer(int[] tabell) {
		
		    int sum = 0;  // Initialiserer en variabel for å holde på summen
		    
		    for (int tall : tabell) {  // Går gjennom hvert element i tabellen
		        sum += tall;  // Legger til hvert element til summen
		        
		    }
		    
		    return sum;  // Returnerer den totale summen
	}

	// d) Julie
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e) Sigrid
	public static int posisjonTall(int[] tabell, int tall) {

		    for (int i = 0; i < tabell.length; i++) {  // Går gjennom hvert element i tabellen
		    	
		        if (tabell[i] == tall) {  // Sjekker om elementet er likt tallet vi leter etter
		            return i;  // Returnerer indeksen hvis vi finner tallet
		        }
		    }
		    
		    return -1;  // Returnerer -1 hvis tallet ikke finnes i tabellen
		}


	// f) Julie
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g) Sigrid
	public static boolean erSortert(int[] tabell) {

		    for (int i = 0; i < tabell.length - 1; i++) {  // Går gjennom tabellen, men stopper ved nest siste element
		    	
		        if (tabell[i] > tabell[i + 1]) {  // Sjekker om et element er større enn det neste
		            return false;  // Hvis et element er større enn det neste, er tabellen ikke sortert
		        }
		    }
		    
		    return true;  // Returnerer true hvis ingen elementer bryter sorteringsregelen
		}


	// h) Julie
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
