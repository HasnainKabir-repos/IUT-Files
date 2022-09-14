public class FizzBuzz {

    public String getFizzBuzz(int value){
        if(isDivisibleby3(value)  && isDivisibleby5(value)){
            return "FizzBuzz";
        }
        else if(isDivisibleby3(value)){
            return "Fizz";
        }
        else if (isDivisibleby5(value)) {
            return "Buzz";
        }
        else {
            return "Boom";
        }

    }

    public boolean isDivisibleby3(int n){
        if(n%3 == 0){
            return true;
        }
        return false;
    }

    public boolean isDivisibleby5(int n){
        if(n%5 == 0){
            return true;
        }
        return false;
    }
}
