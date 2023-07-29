package com.company;
import java.util.Scanner;
public class two_D_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("enter the number of column:");
        int col = sc.nextInt();
        int[][] matrix1 = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("enter the [" + i + "]" + "[" + j + "] element of matrix:");
                matrix1[i][j] = sc.nextInt();
            }

        }
        System.out.println("Elements of the matrix are");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                System.out.print(matrix1[i][j] + "  ");
            System.out.println();
        }
    }
    }
