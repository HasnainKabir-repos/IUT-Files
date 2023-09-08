public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new MozarellaCheese();
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Seafood createSeafood() {
        return new FrozenClams();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
}
