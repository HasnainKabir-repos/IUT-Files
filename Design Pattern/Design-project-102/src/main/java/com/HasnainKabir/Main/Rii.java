package com.HasnainKabir.Main;

import com.HasnainKabir.Car.*;
import com.HasnainKabir.Player.Player;
import com.HasnainKabir.Race.Circuit;
import com.HasnainKabir.Race.Race;
import com.HasnainKabir.Race.Sprint;
import com.HasnainKabir.Track.BBRaceWayTrack;
import com.HasnainKabir.Track.BlueMoonBaySpeedWayTrack;
import com.HasnainKabir.Track.CircuitDeSpaFrancorchampsTrack;
import com.HasnainKabir.Track.Track;
import java.util.Scanner;

public class Rii {

    public static void main(String[] args){
        Player player = Player.getInstance();

        CarFactory carFactory  = chooseCarFactory();;
        Track track = chooseTrack();

        Car car = carFactory.createCar();
        car.setEngineBehavior(chooseEngineBehavior());
        car.setTurbochargerBehavior(chooseTurboCharger());

        System.out.println("Do you want to add NOS to your car?\n");
        System.out.println("Enter 1 for yes and 2 for no");
        Scanner scanner = new Scanner(System.in);
        int nosChoice = scanner.nextInt();
        NOS nos;
        if(nosChoice == 1){
            nos = chooseNOS();
        }else{
            nos = null;
        }

        Race race = createRace();
        race.race(car, track, nos);
    }

    private static Race createRace(){
        System.out.println("Choose race: 1 - Circuit, Category: 2 - Sprint");
        Race race;
        Scanner scanner = new Scanner(System.in);
        int raceType = scanner.nextInt();

        switch (raceType){
            case 1:
                race = new Circuit();
                break;
            case 2:
                race = new Sprint();
                break;
            default:
                throw new IllegalArgumentException("Invalid choice of race ");
        }

        return race;
    }

    private static CarFactory chooseCarFactory(){
        // Choosing abstract factory of cars
        System.out.println("Choose car --- Category: 1 - Coupe, Category: 2 - Roadster");
        CarFactory carFactory;
        Scanner scanner = new Scanner(System.in);
        int carCategoryChoice = scanner.nextInt();
        switch (carCategoryChoice) {
            case 1:
                carFactory = new CoupeCarFactory();
                break;
            case 2:
                carFactory = new RoadsterCarFactory();
                break;
            default:
                throw new IllegalArgumentException("Invalid choice of car category");
        }

        return carFactory;
    }

    private static Track chooseTrack(){
        //Choosing factory of Track
        System.out.println("Choose Track: 1 - Blue Moon Bay Speedway, 2 - BB Raceway, 3 - Circuit de Spa-Francorchamps");
        Scanner scanner = new Scanner(System.in);
        int trackChoice = scanner.nextInt();

        Track track;
        switch (trackChoice) {
            case 1:
                track = new BlueMoonBaySpeedWayTrack();
                break;
            case 2:
                track = new BBRaceWayTrack();
                break;
            case 3:
                track = new CircuitDeSpaFrancorchampsTrack();
                break;
            default:
                throw new IllegalArgumentException("Invalid choice for Track");
        }
        return track;
    }

    private static EngineBehavior chooseEngineBehavior(){
        System.out.println("Choose Engine: 1 - V6Engine, 2 - V8Engine, 3 - V12Engine");
        Scanner scanner = new Scanner(System.in);
        int engineChoice = scanner.nextInt();

        EngineBehavior engineBehavior;

        switch (engineChoice){
            case 1:
                engineBehavior = new V6Engine();
                break;
            case 2:
                engineBehavior = new V8Engine();
                break;
            case 3:
                engineBehavior = new V12Engine();
                break;
            default:
                throw new IllegalArgumentException("Invalid choice for Engine");
        }

        return engineBehavior;
    }

    private static TurbochargerBehavior chooseTurboCharger(){
        System.out.println("Choose TurboCharger: 1 - Alipne TurboCharger, 2 - Cummins TurboCharger");
        Scanner scanner = new Scanner(System.in);
        int turboChoice = scanner.nextInt();
        TurbochargerBehavior turbochargerBehavior;

        switch (turboChoice){
            case 1:
                turbochargerBehavior = new AlpineTurboCharger();
                break;
            case 2:
                turbochargerBehavior = new CumminsTurboCharger();
                break;
            default:
                throw new IllegalArgumentException("Invalid choice of TurboCharger");
        }

        return turbochargerBehavior;
    }

    private static NOS chooseNOS(){
        //Decorator for NOS
        System.out.println("Choose NOS: 1 - Resonac, 2 - Sema");
        Scanner scanner = new Scanner(System.in);
        int nosChoice = scanner.nextInt();

        NOS nos;

        switch (nosChoice){
            case 1:
                nos = new ResonacNos();
                break;
            case 2:
                nos = new SemaNos();
                break;
            default:
                throw new IllegalArgumentException("Invalid choice of NOS");
        }

        return nos;
    }
}
