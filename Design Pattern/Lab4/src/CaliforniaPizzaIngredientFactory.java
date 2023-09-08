public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Dough createDough() {
        return new VeryThinCrust();
    }

    @Override
    public Seafood createSeafood() {
        return new Calamari();
    }

    @Override
    public Sauce createSauce() {
        return new BruschettaSauce();
    }
}
