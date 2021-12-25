package com.company;

public class SumOfDigits {
    public static void main(String[] args) {
        long  num=12345678955l;
        long c=0,sum=0;

        while(num>0){
           c=num%10;
           num=num/10;
           sum+=c;
        }
        System.out.println(sum+"Sum is");
    }
}
