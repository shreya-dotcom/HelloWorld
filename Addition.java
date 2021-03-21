package com.edureka;
import java.util.Scanner;

public class Addition {

    public int add(int a , int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Addition aa = new Addition();
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();
        System.out.println("Addition of two numbers : "+aa.add(a,b)); // call for method
    }

}
