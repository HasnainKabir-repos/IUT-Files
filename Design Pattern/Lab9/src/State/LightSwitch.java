package State;

public class LightSwitch {
    public LightState state;

    public LightSwitch(){
        state = new offState();
    }

    public void setState(LightState state){
        this.state = state;
    }

    public void tunOn(){
        state.turnOn();

        if(state instanceof offState){
            setState(new onState());
        }
    }

    public void turnOff(){
        state.turnOff();

        if(state instanceof onState){
            setState(new offState());
        }
    }
}
