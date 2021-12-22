package com.company;

public class SumOfDigits {
    public static void main(String[] args) {
        int number=234;
        int sum=0;
        while (number>0){

            sum=sum+number%10;
            number=number/10;

        }
        System.out.println("Sum of digit is "+sum);
    }
}
