public class CalamariPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public CalamariPizza(PizzaIngredientFactory ingredientFactory){
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
