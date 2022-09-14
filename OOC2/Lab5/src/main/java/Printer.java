
import java.util.ArrayList;
import java.util.List;


public class Printer<T extends Person>  {

    List<T> lst = new ArrayList<>();

    public void add(T t){
        lst.add(t);
    }

    public <T extends Person> void print(){
        for(Object element: lst){
            System.out.println(element.toString());
        }
    }
}
