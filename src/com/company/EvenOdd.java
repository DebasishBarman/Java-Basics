package com.company;

public class EvenOdd {
    public static void main(String[] args) {
        int num=145678;
        int odd=0,even=0,count=0;
        while(num>0){
            num=num/10;
            if(num%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even "+even);
        System.out.println("Odd "+odd);
    }
}
