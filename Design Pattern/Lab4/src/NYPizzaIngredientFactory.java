public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Seafood createSeafood() {
        return new FreshClams();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
