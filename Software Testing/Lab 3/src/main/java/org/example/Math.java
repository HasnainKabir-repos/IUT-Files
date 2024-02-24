package org.example;

public class Math {

    public boolean isPrime(Number num){

        if(num instanceof Double){
            throw new IllegalArgumentException("Input must me an integer or a long datatype");
        }

        long num1 = num.longValue();

        if(num1 <2 || num1 >1000000000000L){
            throw new IllegalArgumentException("Input must be in between 2 and 1000000000000");
        }



        for (long i = 2; i <= num1 / 2; ++i) {
            if (num1 % i == 0) {
                return false;
            }
        }

        return true;
    }
}
