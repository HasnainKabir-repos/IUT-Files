public abstract class PizzaStore {
    abstract Pizza cretePizza(String type);

    Pizza orderPizza(String type){
        Pizza pizza = cretePizza(type);

        return pizza;
    }
}
