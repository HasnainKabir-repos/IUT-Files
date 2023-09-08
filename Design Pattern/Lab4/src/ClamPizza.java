public class ClamPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory){
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
