public class NYPizzaStore extends PizzaStore{
    @Override
    Pizza cretePizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(type.equalsIgnoreCase("Cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NY Cheese Pizza");
        }else if(type.equalsIgnoreCase("Clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NY clam pizza");
        }
        return pizza;

    }
}
