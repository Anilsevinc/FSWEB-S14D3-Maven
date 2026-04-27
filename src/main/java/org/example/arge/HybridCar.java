package org.example.arge;
public class HybridCar extends CarSkeleton {

    private double avgKmPerLitre;
    private int batterySize;

    public int getCylinders() {
        return cylinders;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    private int cylinders;

    public HybridCar(String name, String desc,
                     double avgKmPerLitre,
                     int batterySize,
                     int cylinders) {

        super(name, desc);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Hybrid system starting");
    }

    @Override
    protected void runEngine() {
        System.out.println("Using battery + gas engine");
    }
}