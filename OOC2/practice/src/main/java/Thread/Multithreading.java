package Thread;

public class Multithreading{
    public static void main(String[] args){
        Thread thread1 = new Thread( new Student(1, "A", 3000));
        thread1.start();
        Thread thread2 = new Thread(new Student(2, "N", 2000));
        thread2.start();
        Thread thread3 = new Thread(new Student(3, "B", 1000));
        thread3.start();
    }
}
