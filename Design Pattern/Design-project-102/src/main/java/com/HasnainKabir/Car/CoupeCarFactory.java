package com.HasnainKabir.Car;

import java.util.Scanner;

public class CoupeCarFactory implements CarFactory {
    public Car createCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Coupe Car: 1 - Toyota GR86, 2 - Subaru BRZ");
        int choice = scanner.nextInt();
        scanner.close();

        switch (choice) {
            case 1:
                return new ToyotaGR86();
            case 2:
                return new SubaruBRZ();
            default:
                throw new IllegalArgumentException("Invalid choice for Coupe Car");
        }
    }
}
