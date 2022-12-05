package Task2;

public class RentService {

    public double RentCalculator(BookType type, int baseRent, int rentDays){

        if(rentDays <= 7) return baseRent;

        if(type.equals(BookType.RegularBook)){
            return calculateRent(baseRent, rentDays, 0.2);
        }else if(type.equals(BookType.KidsBook)){
            return calculateRent(baseRent, rentDays, 0.1);
        }else{
            return calculateRent(baseRent, rentDays, -0.3);
        }
    }

    private double calculateRent(int baseRent, int rentDays, double percentage){
        return (rentDays - 7) * (baseRent - baseRent * percentage) * 4;
    }


}
