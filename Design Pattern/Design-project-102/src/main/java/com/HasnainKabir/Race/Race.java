package com.HasnainKabir.Race;

import com.HasnainKabir.Car.Car;
import com.HasnainKabir.Car.CarWithNos;
import com.HasnainKabir.Car.NOS;
import com.HasnainKabir.Track.Track;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Race {
    private final Random random = new Random();
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
    public final void race(Car car, Track track, NOS nos){
        car.carInfo();
        track.trackInfo();
        startCar(car);
        startLine(track);
        accelerateCar(car);
        Car carWithNOS = pitStop(car, nos);
        applyNos(nos);
        finishLine(track);
        stopCar(car);
        lapTime();
    }

    private void startCar(Car car){
        car.start();
    }

    private void stopCar(Car car){
        car.stop();
    }

    private void accelerateCar(Car car){
        car.accelerate();
    }

    private Car pitStop(Car car, NOS nos){
        System.out.println("Entering pit stop");
        if(nos != null){
            return new CarWithNos(car, nos);
        }
        return car;
    }

    private void applyNos(NOS nos){
        if(nos!=null){
            nos.applyNos();
        }
    }
    protected void startLine(Track track){
        System.out.println("At the start of line: ");
        track.trackInfo();
    }
    protected void finishLine(Track track){
        System.out.println("Entering finish line of: ");
        track.trackInfo();
    }

    private void lapTime(){
        int seconds = random.nextInt(900) + 300;
        System.out.println("Lap time: "+ simpleDateFormat.format(new Date(seconds * 1000L)));
    }
}
