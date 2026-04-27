package org.example;

import org.example.company.*;
import org.example.arge.*;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());

        Car mitsubishi = new Mitsubishi(6,"Outlander");
        System.out.println(mitsubishi.startEngine());

        Car ford = new Ford(6,"Falcon");
        System.out.println(ford.startEngine());

        Car holden = new Holden(6,"Commodore");
        System.out.println(holden.startEngine());


        CarSkeleton gas = new GasPoweredCar(
                "BMW", "Gas car", 15.5, 6);

        CarSkeleton electric = new ElectricCar(
                "Tesla", "Electric", 400, 80);

        CarSkeleton hybrid = new HybridCar(
                "Toyota", "Hybrid", 22, 40, 4);

        gas.startEngine();
        gas.drive();

        electric.startEngine();
        electric.drive();

        hybrid.startEngine();
        hybrid.drive();
    }
}