import java.util.Objects;

public class Franc {

    int amount;
    Franc(int amount){
        this.amount = amount;
    }

    Franc times(int multiplier){
        return new Franc(amount*multiplier);
    }

    @Override
    public boolean equals(Object o){
        Franc franc = (Franc) o;
        return this.amount == franc.amount;
    }

}
