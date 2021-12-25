package com.company;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=3;
        int c=0;
        if(num>1){
            for (int i = 1; i <= num; i++) {
                if(num%i==0)
                    c++;
            }
            if(c==2) {
                System.out.println("|its is a prime number");
            }else{
                System.out.println("|Not a prime number");

            }
        }else{
            System.out.println("|Not a Prime Number");
        }
    }
}
