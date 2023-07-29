package com.company;

public class array_foreachloop {
    public static void main(String[] args) {
        int[] marks={8,90,89,7,76,76};
        System.out.println("using naive method:");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.println("using for loop:");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("using for-each loop");//for each loop is like for loop it is easier to use
        for(int element:marks){
            System.out.println(element);
        }
        System.out.println("loop in reverse order:");
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
    }
}
