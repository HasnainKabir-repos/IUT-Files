package Exception;

public class ExceptionHandler {

    public static void main(String[] args) throws MamunException{
        String student = "Mamun";

        if(student == "Mamun"){
            throw new MamunException("Bair ho");
        }
    }
}
