public class Faculty extends Person{
    public String designation;

    public Faculty(String name, String address,int age, String designation){
        super.name = name;
        super.address = address;
        super.age = age;
        this.designation = designation;
    }

    @Override
    public String toString(){
        return "Name: "+name+"\nAddress:"+address+"\nAge:"+age+"\nDesignation: "+designation;
    }
}
