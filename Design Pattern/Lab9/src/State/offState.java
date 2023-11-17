package State;

public class offState implements LightState{
    @Override
    public void turnOn() {
        System.out.println("Turning light on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is already off");
    }
}
