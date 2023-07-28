package com.company;
public class strings {
    public static void main(String[] args) {
        //strings are immutable means they cannot be changed
        String name = "Deepali";
        System.out.println(name.length());//it will print the length of string
        System.out.println(name.toLowerCase());//convert the string into lowercase or in small letters
        System.out.println(name.toUpperCase());//convert the string into uppercase or in capital letters
        String sentence="     hello everyone!     ";
        System.out.println(sentence);
        String Sentence=sentence.trim();//remove the spaces
        System.out.println(Sentence);
        System.out.println(name.substring(3));//print the string from index 3
        System.out.println(name.substring(2,6));//print the index from 3 up to 5
        System.out.println(name.replace('e','i'));//replace the letter from new letter
        System.out.println(name.replace("e","ir"));
        System.out.println(name.startsWith("D"));//give answer in true or false whether the string is starting from D or not
        System.out.println(name.endsWith("i"));//give answer in true or false whether the string is ending from i or not
        System.out.println(name.charAt(3));//tell which letter is at 3rd index
        System.out.println(name.indexOf("e"));//tell the index of e
        System.out.println(name.indexOf("e",4));//if the index is right it will print the index else give -1
        System.out.println(name.lastIndexOf("e",4));//give the last index of letter
        System.out.println(name.equals("deepali"));//give answer in true or false
        System.out.println(name.equalsIgnoreCase("deepali"));//it will ignore the case sensitivity
        System.out.println("deepali\\");//if we want to print the \ in the statement then we use two backslash
    }
}
