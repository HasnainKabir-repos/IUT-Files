package State;

public class Main {
    public static void main(String[] args){
        LightSwitch lightSwitch = new LightSwitch();

        lightSwitch.tunOn();
        lightSwitch.turnOff();
        lightSwitch.turnOff();
        lightSwitch.tunOn();
    }
}
