package com.learncollection;
import java.util.ArrayList;
import java.util.Vector;

public class arraylistExample {
    public static void main(String[] args) {


//        Arraylist allows duplicates and have index
        ArrayList<String> list=new ArrayList<>();
        System.out.println("----------Add-----------");
        list.add("Str");
        list.add("Str2");
        list.add("Str3");
        list.add("Str4");
        list.add("String");
        list.set(0,"List"); //set() method will remove the previous value and add a new one
        list.add(0,"Str added");  //this will add new value at respective position
        System.out.println(list);
        System.out.println("Initial Length of arraylist is "+list.size());

        System.out.println("---------Remove---------");
        list.remove(3); //remove index 2
        list.remove("String");
        System.out.println("After remove"+list);

        System.out.println("---------Size of ArrayList---------");

        System.out.println("Length of arraylist is "+list.size()); //find length of array using size()

        System.out.println(list.contains("Str")); //returns boolean value

        System.out.println(list.isEmpty()); //to check if list is empty using isEmpty() returns boolean

//        list.clear(); //this removes all elements

        System.out.println(list);


/*----------------------------Vector-----------------------------------------*/
        Vector<String> vector=new Vector<>();
        vector.addAll(list);
        System.out.println("----------------VECTOR-----------------");
        System.out.println(vector);
        vector.clone();
        System.out.println(vector);



    }
}
