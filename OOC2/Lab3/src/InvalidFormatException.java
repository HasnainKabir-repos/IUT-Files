public class InvalidFormatException  extends Exception{
    public InvalidFormatException(String message){
        super(message);
    }
}

class MobileNumber {

    public void checkFormat(String num) throws InvalidFormatException{
        if(num.length()<8 || !num.contains("_")){
            throw new InvalidFormatException("Not Ok");
        }else{
            System.out.println("OK");
        }
    }

    public static void main(String[] args) throws Exception{
        MobileNumber mobileNumber = new MobileNumber();
        mobileNumber.checkFormat("1234_5678");
        mobileNumber.checkFormat("1234578");
    }
}
