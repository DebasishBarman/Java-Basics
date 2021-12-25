package com.company;

public class WithoutPlus {
    public static void main(String[] args) {
        int n1=1;
        int n2=2;
        int n3=3;
        int s=n3>(n1>n2?n1:n2)?n3:(n1>n2?n1:n2);
        System.out.println("Largest of 3 number is"+s);

    }
}
