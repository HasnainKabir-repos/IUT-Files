package com.HasnainKabir.Car;

import java.util.Scanner;

public class RoadsterCarFactory implements CarFactory{
    public Car createCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Roadster Car: 1 - Porsche Boxster, 2 - Ferrari 812");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                return new PorscheBoxter();
            case 2:
                return new Ferrari812();
            default:
                throw new IllegalArgumentException("Invalid choice for Roadster Car");
        }
    }
}
