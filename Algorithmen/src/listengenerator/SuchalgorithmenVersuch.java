package listengenerator;

public class SuchalgorithmenVersuch {

	public static int lineareSuche(long[] a, long gesucht) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] == gesucht) {
				return i;
			}
		}

		return -1;
	}

	public static int binaereSuche(long[] a, long gesucht) {

		int links = 0;
		int rechts = a.length - 1;

		while (links <= rechts) {

			int mitte = (links + rechts) / 2;

			if (a[mitte] == gesucht) {
				return mitte;
			}

			else if (a[mitte] < gesucht) {
				links = mitte + 1;
			}

			else {
				rechts = mitte - 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int ANZAHL = 100;

		long[] zahlen = SortedListGenerator.getSortedList(ANZAHL);
		long gesucht = zahlen[ANZAHL - 1];
		
		Stoppuhr stoppuhr = new Stoppuhr();
		stoppuhr.starten();
		int ergebnisLinear = lineareSuche(zahlen, gesucht);
		stoppuhr.stoppen();
		double zeitLinear = stoppuhr.getLaufzeitSekunden();
		
		stoppuhr = new Stoppuhr();
		stoppuhr.starten();
		int ergebnisBinaer = binaereSuche(zahlen, gesucht);
		stoppuhr.stoppen();
		double zeitBinaer = stoppuhr.getLaufzeitSekunden();

		System.out.println("Lineare Suche:");
		System.out.println("Gefunden an Index: " + ergebnisLinear);
		System.out.println("Zeit: " + zeitLinear + " Sekunden");

		System.out.println();

		System.out.println("Binaere Suche:");
		System.out.println("Gefunden an Index: " + ergebnisBinaer);
		System.out.println("Zeit: " + zeitBinaer + " Sekunden");

	}

}
