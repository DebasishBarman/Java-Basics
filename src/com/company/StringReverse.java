package com.company;

public class StringReverse {
    public static void main(String[] args) {
        String num="Debasish";
        StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer x=sb.reverse();
        System.out.println(x);

        StringBuilder bld=new StringBuilder();
        bld.append(num);
        StringBuilder revs=bld.reverse();
        System.out.println(revs);



    }
}
