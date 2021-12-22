package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= scanner.nextInt();
        int original_number=num;
        int reverse=0;
        while(num!=0){
            reverse=reverse*10+num%10;
            num=num/10;

        }
        if(original_number==reverse){
            System.out.println("Palindrome "+original_number);
        }else{
            System.out.println("Not Palindrome "+original_number);
        }

    }
}
