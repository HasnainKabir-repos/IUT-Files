public class Person {
    public String name;
    public String address;
    public int age;

    @Override
    public String toString(){
        return "Name: "+name+"\nAddress:"+address+"\nAge:"+age;
    }
}
