package com.learncollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class TraverseExample {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>(Arrays.asList(13,4,121,423,152,56467,323,73));
        System.out.println(l);
//        for(Integer i:l){
//            StringBuffer buffer=new StringBuffer(i.toString());
//            System.out.println(buffer.reverse());
//        }

//        -------------------traversing using iterator
       Iterator<Integer> itr =l.iterator();
       while (itr.hasNext()){
           System.out.print(itr.next());
       }

//       backward traversal
        ListIterator<Integer> itr2 =l.listIterator(l.size());//always mention size when using backward traversal

       while (itr2.hasPrevious()){
           System.out.println(itr2.previous());
       }



    }
}
