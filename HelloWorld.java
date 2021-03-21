package com.edureka;

public class HelloWorld {

    public void test (){
        System.out.println("Non Static Method ..");
    }

    public static void static_test (){
        System.out.println("Static Method ..");
    }

    public static void main(String[] args){
        HelloWorld obj = new HelloWorld();
        System.out.println("Hello World !!");
        obj.test();
        static_test();
    }
}
