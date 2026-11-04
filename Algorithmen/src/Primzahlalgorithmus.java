import java.util.*;
public class Primzahlalgorithmus {

public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
long zahl = scanner.nextLong();


if (zahl <= 1) {
    System.out.println(zahl + " is not a prime number.");
} else {
    boolean isPrime = true;
    for (int i = 2; i < zahl; i++) {
        if (zahl % i == 0) {
            isPrime = false;
            
		}
		
	}
    
    if(isPrime) {
    	System.out.println(zahl + " Das ist eine Primzahl");
    }else {
    	System.out.println(zahl + " Das ist keine Primzahl");
    }
	
}
}
}


	

