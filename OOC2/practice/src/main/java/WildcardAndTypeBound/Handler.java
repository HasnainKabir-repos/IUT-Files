package WildcardAndTypeBound;

import java.util.ArrayList;
import java.util.List;

public class Handler {

    public <T extends Person> void PrintList(List<T> list){
        System.out.println(list.size());
    }

    public void PrintList2(List<? extends Person> list){
        System.out.println(list.size());
    }

    public static void main(String[] args){
        List<Person> list = new ArrayList<>();
        list.add(new Student(1, "bleh"));
        list.add(new Faculty(2, "blah"));
        list.add(new Stronk(2, "blah"));

        Handler handler= new Handler();
        handler.PrintList(list);
        handler.PrintList2(list);

    }
}
