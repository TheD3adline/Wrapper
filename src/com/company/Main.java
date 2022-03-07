package com.company;

public class Main {

    public static void main(String[] args) {

        //Wrapper classes can make objects out of primitive data types

        int i = 10;

        //Integer
        //Integer i1 = Integer.valueOf(20);    //via valueOf method
        //Integer i2 = new Integer(30);   //via constructor
        Integer i3 = 43;                     //via boxing, short form of valueOf method

        int integerVariable = i3; //unboxing

        Integer i1 = Integer.valueOf(20);
        i1 = Integer.valueOf(30);
        String test;

        test = i1.toString();

        System.out.println(test);

        //byte => Byte
        //short => Short
        //long => Long
        //int => Integer
        //double => Double
        //boolean => Boolean
        //char => Character

    }
}
