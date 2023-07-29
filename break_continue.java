package com.company;

public class break_continue {
    public static void main(String[] args) {
        for (int i=1;i<5;i++){
            if(i==2){
              System.out.println("loop ends here");
                //break;//break will exit the loop
                continue;//it is used to immediately move to next iteration skip the particular situation
            }
            System.out.println(i);
            System.out.println("java is great");
        }
        //int i=0;
        //do {
         //System.out.println(i);
           // System.out.println("java is great");
            //if (i==2){
              //  System.out.println("loop end here");
                //break;
            //}
            //i++;
        //}while(i<5);
        System.out.println("hii");
    }
}
