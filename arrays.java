package com.company;

public class arrays {
    public static void main(String[] args) {
        int [] marks=new int[7];//thi is how we declare our array
        System.out.println(marks.length);//it will tell the length of the marks
        int[]marks1;
        marks1=new int[8];
        marks1[0]=90;//value at index 0 of marks
        marks1[1]=50;
        marks1[2]=70;
        marks1[3]=40;
        marks1[4]=60;
        marks1[5]=80;
        marks1[5]=34;
        int[] marks2={20,40,8};
        System.out.println(marks1[3]);
        System.out.println(marks2[2]);
        System.out.println(marks1[5]);//it will print the updated value
    }
}
