package com.learncollection;
import java.util.*;  //import all util classes
public class collectionBasic {
    public static void main(String[] args) {
        new ArrayList<>();

//        Typesafe collection------->same type of elements or objects
//        Example
        ArrayList<String> e=new ArrayList<>(); //arraylist is ordered collection and duplicates are allowed
        e.add("Aaa");
        e.add("Bbb");
        e.add("Bbb"); //example of duplicates
        System.out.println(e);
        System.out.println(e.get(1)); //example of indexing

//        Non-Typesafe Collection-----> different types of elements can be added
//        example

        System.out.println("-------------------------------------");
        LinkedList list=new LinkedList();
        list.add("String");
        list.add("String"); //duplicates are allowed
        list.add(10);
        list.add(1.333);
        list.add(true);
        System.out.println(list);
        System.out.println("Element at Position 3 is "+list.get(3));  //example of indexing


    }
}
