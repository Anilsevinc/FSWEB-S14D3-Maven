package org.example.arge;

public class ElectricCar extends CarSkeleton {

    private double avgKmPerCharge;
    private int batterySize;

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }



    public ElectricCar(String name, String desc,
                       double avgKmPerCharge, int batterySize) {
        super(name, desc);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("Electric system activated");
    }

    @Override
    protected void runEngine() {
        System.out.println("Battery powering motors");
    }
}