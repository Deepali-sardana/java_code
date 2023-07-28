package com.company;
import java.util.Scanner;
public class calculator_using_switchcase {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("+ for addition" +
                "\n- for subtraction" +
                "\n* for multiplication" +
                "\n/ for division" +
                "\n% for modulus" +
                        "\nenter the operator:" );
        String operator=sc.next();
        System.out.println("enter the first number:");
        float a=sc.nextFloat();
        System.out.println("enter the second number:");
        float b= sc.nextFloat();
        switch (operator){
            case "+"-> System.out.println("addition  of a and b is:"+(a+b));
            case "-"-> System.out.println("subtraction  of a and b is:"+(a-b));
            case "*"-> System.out.println("multiplication of a and b is:"+(a*b));
            case "/"-> System.out.println("division  of a and b is:"+(a/b));
            case "%"-> System.out.println("modulus of a and b is:"+(a%b));
            default -> System.out.println("wrong operator");
        }
    }
}
