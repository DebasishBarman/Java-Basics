package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int x=4,fact=1;
        for (int i = x; i >0 ; i--) {
            fact=fact*i;
            System.out.println(i);
        }
        System.out.println(fact);

        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();

        System.out.println(s);
    }
}
