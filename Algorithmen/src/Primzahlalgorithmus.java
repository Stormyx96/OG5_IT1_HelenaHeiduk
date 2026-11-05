
import java.util.*;

public class Primzahlalgorithmus {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Stoppuhr stoppuhr = new Stoppuhr();

		long zahl = scanner.nextLong();

		stoppuhr.starten();
		boolean isPrime = isPrim(zahl);
		stoppuhr.stoppen();

		if (isPrime) {
			System.out.println(zahl + " Das ist eine Primzahl");
		} else {
			System.out.println(zahl + " Das ist keine Primzahl");
		}
		
		System.out.println(stoppuhr.getLaufzeitSekunden());

	}

	//public class Primzahlen {
	    public static boolean isPrim(long zahl) {
	        if (zahl <= 1) {
	            return false;
	        }
	        if (zahl == 2) {
	            return true;
	        }
	        if (zahl % 2 == 0) {
	            return false;
	        }
	        // Optimierung: Nur bis zur Wurzel der Zahl prüfen
	        long grenze = (long) Math.sqrt(zahl) + 1;
	        for (long i = 3; i <= grenze; i += 2) {
	            if (zahl % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}


//}
