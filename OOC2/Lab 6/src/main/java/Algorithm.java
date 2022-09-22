import java.util.List;

public class Algorithm {
    public <T> int countIf(List<T> l, NumberInterface<T> num){

        int count =0;
        for(T t:l){
            if(num.isEqual(t)){
                count++;
            }
        }

        return count;
    }
}
