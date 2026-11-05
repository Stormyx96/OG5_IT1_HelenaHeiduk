public class PrimzahlenTest {
    public static void main(String[] args) {
        long[] zahlenreihe = {7, 97, 997, 9973, 99991, 999983, 9999991, 99999989, 999999929L, 9999999929L, 99999999977L};
        //long[] zahlenreihe = {9223372036854775783L};
        
        for (long zahl : zahlenreihe) {
            Stoppuhr stoppuhr = new Stoppuhr();
            stoppuhr.starten();

            boolean istPrim = Primzahlalgorithmus.isPrim(zahl);

            stoppuhr.stoppen();
            double laufzeit = stoppuhr.getLaufzeitSekunden();

            System.out.printf("%-15d ist %-10s | Laufzeit: %.9f Sekunden%n",
                zahl,
                istPrim ? "eine Primzahl" : "keine Primzahl",
                laufzeit);
        }
    }
}

