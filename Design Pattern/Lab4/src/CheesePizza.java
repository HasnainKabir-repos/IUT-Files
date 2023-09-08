public class CheesePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare(){
        ingredientFactory.createDough();
        ingredientFactory.createCheese();
        ingredientFactory.createSauce();
        ingredientFactory.createSeafood();
    }
}
