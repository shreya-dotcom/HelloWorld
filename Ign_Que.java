package com.edureka;

import java.util.Scanner;

public class Ign_Que {

    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        int[] args = new int[3];
        System.out.println("Enter three numbers :");
        for(int i=0;i<3;i++)
        {
            args[i]=sc.nextInt();
        }

        if(args[0]==args[1] && args[1]==args[2]) //Checks if nos are equal or not
        {
            System.out.println("All three are equal.");
        }
        else  //if nos are not equal
        {
            System.out.println("All three are not equal.");
        }

    }

}
