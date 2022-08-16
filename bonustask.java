// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner; 
interface Printer{
    void print(String message);
}

class Inkjet implements Printer{
    String message;
    public void print(String message){
        this.message = message;
    }
}

class ColorPrinter implements Printer{
    String message;
    public void print(String message){
        this.message = message;
    }
}

class panasonic extends Inkjet{
    panasonic(String message){
        print(message);
        System.out.println("I am a " +this.message);
    }
}

class Canon extends ColorPrinter{
    Canon(String message){
        print(message);
        System.out.println("I am a " +this.message + "\n");
    }
}

class HelloWorld {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        
        String msg = s.nextLine();
        panasonic ps = new panasonic(msg);
        
        Scanner s2 =new Scanner(System.in);
        
        String msg2 = s2.nextLine();
        Canon c = new Canon(msg2);
    }
}// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner; 
interface Printer{
    void print(String message);
}

class Inkjet implements Printer{
    String message;
    public void print(String message){
        this.message = message;
    }
}

class ColorPrinter implements Printer{
    String message;
    public void print(String message){
        this.message = message;
    }
}

class panasonic extends Inkjet{
    panasonic(String message){
        print(message);
        System.out.println("I am a " +this.message);
    }
}

class Canon extends ColorPrinter{
    Canon(String message){
        print(message);
        System.out.println("I am a " +this.message + "\n");
    }
}

class HelloWorld {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        
        String msg = s.nextLine();
        panasonic ps = new panasonic(msg);
        
        Scanner s2 =new Scanner(System.in);
        
        String msg2 = s2.nextLine();
        Canon c = new Canon(msg2);
    }
}
