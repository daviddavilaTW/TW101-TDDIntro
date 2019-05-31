package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int number) throws NonPositiveNumberException{

        if (isNegative(number)){
            throw new NonPositiveNumberException();
        }



        return getFactorial(number);

    }

    private boolean isNegative (int number){
        return number < 0;
    }


    private int getFactorial (int number){
        int factorialResult = 1;



        if (number == 2){
            factorialResult =  2;
        }

        if (number > 2){

            for (int inferiorNumber = number; inferiorNumber >= (number / 2); inferiorNumber --){

                factorialResult = factorialResult * inferiorNumber;


            }


        }

        return factorialResult;
    }




}
