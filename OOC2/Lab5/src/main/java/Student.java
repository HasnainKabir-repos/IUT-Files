public class Student extends Person{
    public String studentID;

    public Student(String name, String address,int age, String studentID){
        super.name = name;
        super.address = address;
        super.age = age;
        this.studentID = studentID;
    }

    @Override
    public String toString(){
        return "Name: "+name+"\nAddress:"+address+"\nAge:"+age+"\nStudent ID: "+studentID;
    }
}
