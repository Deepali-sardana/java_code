package com.company;
import java.util.Scanner;
public class percentage_of_student {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks of subject1:");
        float sub1=sc.nextFloat();
        System.out.println("enter the marks of subject2:");
        float sub2=sc.nextFloat();
        System.out.println("enter the marks of subject3:");
        float sub3=sc.nextFloat();
        System.out.println("enter the marks of subject4:");
        float sub4=sc.nextFloat();
        System.out.println("enter the marks of subject5:");
        float sub5=sc.nextFloat();
        float percentage=(sub1+sub2+sub3+sub4+sub5)/5;
        System.out.println("percentage of student is:"+percentage);
    }
}
