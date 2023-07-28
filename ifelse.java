package com.company;
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age:");
        int age= sc.nextInt();
        if(age<18)//if statement check whether the condition is true if yes it will
            // print the statement under if block else print the else block statement
        {
            System.out.println("you cannot drive");
        }
        else
        {
            System.out.println("you can drive");
        }


    }
}
