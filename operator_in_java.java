package com.company;
public class operator_in_java {
    public static void main(String[]args) {
        //Arithmetic operator:+,-,/,%
        int a = 40;
        int b = 2;
        System.out.println("addition of a and b:"+(a+b));
        System.out.println("subtraction of a and b:"+(a-b));
        System.out.println("multiplication of a and b:"+(a*b));
        System.out.println("division of a and b:"+(a/b));
        System.out.println("modulo of a and b:"+(a%b));//gives remainder

        //Assignment operator:=
        int c=90;
        System.out.println(c);

        //comparison operator:==,<,>,<=,>=
        System.out.println(a<b);
        System.out.println(a>b);

        //logical operators:&&(and),||(or),!(not)
        System.out.println(a==b&&b<c);
        System.out.println(a==b||b<c);
        System.out.println(!(a==90));

        //bitwise operator:&(and),|(or),^(xor),<<(left shift),>>(right shift)
        System.out.println(3&4);//it will convert the number into binary and then do the computation
        System.out.println(2&3);//2--10,3--11
        //1 0
        //1 1
        //----
        //1 0 which is 2
        //----
    }
}