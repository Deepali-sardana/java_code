package com.company;
import java.util.Scanner;//we import scanner from java.util so tha user can give input
public class input {
    public static void main(String[]args){
       System.out.println("taking input from user:");
        Scanner sc=new Scanner(System.in);//System.in will read from the keyboard
       System.out.println("enter the first number:");
       int a=sc.nextInt();//next method to get input from user
       System.out.println("enter the second number:");
       int b=sc.nextInt();
       int sum=a+b;
       System.out.println("the sum of two number is:");
       System.out.println(sum);

       //if we want to take a string input:
        //System.out.println("enter the name:");
        //String str=sc.next();
        //String str1=sc.nextLine();
        //System.out.println(str);//it will print only the first word
        //Sys5tem.out.println(str1);//if we want print the line then we use sc.nextLine()

        //boolean will tell the number is integer or not
        System.out.println("enter the number:");
        boolean b1= sc.hasNextInt();//take the input and tell wheather the input is integer or not
        System.out.println(b1);
    }
}
