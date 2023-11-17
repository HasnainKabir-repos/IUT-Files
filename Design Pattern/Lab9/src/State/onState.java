package State;

public class onState implements LightState{

    @Override
    public void turnOn() {
        System.out.println("Light is already on");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning Light off");
    }
}
