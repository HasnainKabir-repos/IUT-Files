public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        // Ethan orders a Cheese Pizza from NY
        Pizza nyCheesePizza = nyStore.orderPizza("cheese");
        if (nyCheesePizza != null) {
            System.out.println("Ethan ordered a " + nyCheesePizza.getName());
        }

        // Joel orders a Pepperoni Pizza from Chicago
        Pizza chicagoPepperoniPizza = chicagoStore.orderPizza("pepperoni");
        if (chicagoPepperoniPizza != null) {
            System.out.println("Joel ordered a " + chicagoPepperoniPizza.getName());
        }
    }
}