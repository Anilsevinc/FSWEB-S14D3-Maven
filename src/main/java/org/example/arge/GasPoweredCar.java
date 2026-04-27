package org.example.arge;
public class GasPoweredCar extends CarSkeleton {

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String desc,
                         double avgKmPerLitre, int cylinders) {
        super(name, desc);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Gas engine starting...");
    }

    @Override
    protected void runEngine() {
        System.out.println("Gas engine running...");
    }
}