import java.util.Objects;

public class Dollar {

    int amount;
    Dollar(int amount){
        this.amount = amount;
    }

    Dollar times(int multiplier){
        return new Dollar(amount*multiplier);
    }

    @Override
    public boolean equals(Object o){
        Dollar dollar = (Dollar) o;
        return this.amount == dollar.amount;
    }

}
