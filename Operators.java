package com.edureka;

public class Operators {

    public static void main(String[] args) {

        //Unary Operators
        int x = 5;
        System.out.println("x : "+x);      // output:5
        System.out.println("x++ :"+ x++);  // output:5
        System.out.println("New x :"+x);   // output:6

        int a = 5;
        System.out.println("a :"+a);       //output:5
        System.out.println("++a :"+ ++a); // output:6
        System.out.println("New a :"+a);  // output:6

        //Shift Operator
        int y = 20;
        System.out.println("y :"+y);
        System.out.println("y<<2 :"+ (y<<2)); // shifting whole bits by 2 on left side
        System.out.println("y>>3 :"+ (y>>3)); // shifting bits by 3 on right side

        //Ternary Operators
        int ter = x<y ? 100:200 ; // x=5 and y=20 x<y is true so value of ter=100 else ter=200
        System.out.println("Ternary Ans : "+ter);
        int f = x>y ? 100:200 ;
        System.out.println("Ternary ANS : "+f);
    }
}
