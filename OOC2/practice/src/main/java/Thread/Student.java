package Thread;

public class Student implements Runnable{

    int ID;
    String name;
    int sleepTime;

    public Student(int ID, String name, int sleepTime){
        setID(ID);
        setName(name);
        this.sleepTime = sleepTime;
        System.out.println("Student added. ");
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try{
            System.out.println("Thread going to sleep for "+ sleepTime);
            Thread.sleep(sleepTime);
        }catch (InterruptedException e){
            System.out.println("Thread interrupted");
        }
        System.out.println("Done sleeping " + name);
    }
}
