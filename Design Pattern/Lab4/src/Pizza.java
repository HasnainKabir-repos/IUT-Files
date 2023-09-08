public abstract class Pizza {

    String name;

    void bake(){
        System.out.println("Baking");
    }
    void cut(){
        System.out.println("Cutting");
    }
    void box(){
        System.out.println("Boxing");
    }

    public String getName() {
        return name;
    }

    abstract void prepare();

    public void setName(String name) {
        this.name = name;
    }
}
