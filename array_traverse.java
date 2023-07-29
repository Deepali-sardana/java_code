package com.company;
import java.util.Scanner;
public class array_traverse {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        for (int i=0;i<arr.length;i++){
        System.out.println("enter the "+ i+" element:");
        arr[i]=sc.nextInt();
            System.out.println("index["+i+"] elemnt is:"+arr[i]);
    }
}
}
