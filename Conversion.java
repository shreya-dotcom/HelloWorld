package com.edureka;
//import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {

        double d = 6.78504;
        int num = (int)d;

        System.out.println("Value of d : "+ d );
        System.out.println("Value of d after explicit conversion : "+ num); //explicit conversion from double to int
        System.out.println("Diff bet double and int : "+ (d-num));

        String s = "25869";
        int n = Integer.parseInt(s); //conversion of string to int
        Integer n1 = Integer.valueOf(s); //conversion from string to integer

        System.out.println(s); // in format of string
        System.out.println(n);
        System.out.println(n1);

        int number = 1100101;
        String str = String.valueOf(number); //conversion of number to string
        String s1 = Integer.toString(number);//conversion from Integer to string

        System.out.println(number);
        System.out.println(str);
        System.out.println(s1);

    }
}
