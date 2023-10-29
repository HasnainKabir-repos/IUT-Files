import java.util.Objects;

public class CoffeeBrewerFacade {
    private CoffeeGrinder coffeeGrinder;
    private WaterHeater waterHeater;
    private CoffeeMixer coffeeMixer;
    private MilkFrother milkFrother;

    public CoffeeBrewerFacade(String coffeeType){
        coffeeGrinder = new CoffeeGrinder();
        waterHeater = new WaterHeater();
        coffeeMixer = new CoffeeMixer();
        milkFrother = new MilkFrother();

        if(Objects.equals(coffeeType, "Cappucino")){
            makeCappucino();
        }else {
            makeBlackCoffee();
        }
    }


    public void makeCappucino(){
        coffeeGrinder.grindCoffee();
        waterHeater.heatWater();
        milkFrother.frothMilk();
        coffeeMixer.mixCoffee();

        System.out.println("Cappucino done");
    }

    public void makeBlackCoffee(){
        coffeeGrinder.grindCoffee();
        waterHeater.heatWater();
        coffeeMixer.mixCoffee();
        System.out.println("Black coffee done");
    }
}
