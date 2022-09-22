public class EvenNumber implements NumberInterface<Integer>{
    @Override
    public boolean isEqual(Integer integer){
        return integer%2 == 0;
    }
}
