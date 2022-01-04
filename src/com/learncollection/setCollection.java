package com.learncollection;

import java.util.HashSet;

public class setCollection {
    public static void main(String[] args) {

//      Hashset neither follow indexing nor duplicate values
        HashSet<Double> hsh=new HashSet<>();
        hsh.add(3.11);
        hsh.add(2.4);
        hsh.add(3.11);
        hsh.add(56.24);
        System.out.println(hsh);
    }
}
