public class ChicagoPizzaStore extends PizzaStore{
    @Override
    Pizza cretePizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if(type.equalsIgnoreCase("Cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Cheese Pizza");
        }else if(type.equalsIgnoreCase("Clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago clam pizza");
        }
        return pizza;

    }
}
