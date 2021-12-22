package com.company;




import java.util.Scanner;


class Main {

    public static void main(String[] as) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= scanner.nextInt();
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            System.out.println(rev);
            num=num/10;


        }
        System.out.println(rev);
    }
}


