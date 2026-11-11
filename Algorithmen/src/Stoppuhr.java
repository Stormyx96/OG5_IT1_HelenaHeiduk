public class Stoppuhr {
    private long startTime;
    private long endTime;
    private boolean isRunning;

    public Stoppuhr() {
        this.isRunning = false;
    }

    public void starten() {
        this.startTime = System.nanoTime();
        this.isRunning = true;
    }

    public void stoppen() {
        this.endTime = System.nanoTime();
        this.isRunning = false;
    }

    public double getLaufzeitSekunden() {
        if (isRunning) {
            throw new IllegalStateException("Die Stoppuhr läuft noch. Bitte stoppen Sie sie zuerst.");
        }
        return (endTime - startTime) / 1_000_000_000.0; 
    }
}

