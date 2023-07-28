package com.company;
import java.util.Scanner;
public class switchcase {
    //in switch we print particular statement which we need
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("enter the age:");
        age= sc.nextInt();
        switch (age) {
            case 18 :
                System.out.println("you are eligible for driving");
            case 15 :
                System.out.println("you cannot drive");
            case 63 : System.out.println("you are too old");
            default :
                System.out.println("wrong choice");
        }
    }
}
