package de.futurehome.tanksimulator;

public class Tank {

    private double fuellstand;
    private double maxFuellstand;

    public Tank(double maxFuellstand) {
        this.maxFuellstand = maxFuellstand;
        this.fuellstand = 0;
    }

    public double getFuellstand() {
        return fuellstand;
    }

    public void setFuellstand(double fuellstand) {
        this.fuellstand = fuellstand;
    }

    public double getMaxFuellstand() {
        return maxFuellstand;
    }

    public void setMaxFuellstand(double maxFuellstand) {
        this.maxFuellstand = maxFuellstand;
    }
}


