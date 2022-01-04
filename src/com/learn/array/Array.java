package com.learn.array;

public class Array extends Thread{
    @Override
    public void run() {
        super.run();
        try{
            int i=0;
//            for (;;){
//                System.out.println("Searching iBall Slide...");
//                sleep(1000);
//                System.out.println("Scanning for iBall device");
//            }
            System.out.println("---------------");
            i++;
            while (i < 10) {
                System.out.println();
                i++;
            }


        }catch (Exception e){

        }

    }

    public static void main(String[] args) {

        Array obj=new Array();
        obj.start();

    }
}
