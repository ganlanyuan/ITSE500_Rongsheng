package edu.oit.lesson3;

import java.util.Scanner;

public class SquaresCubesTable {
    
    private static Scanner input;

    public static void main(String[] args) {
        boolean output = true;
        int number = 0;
        char inputChar = 'n';
        input = new Scanner(System.in);
        
        do {
            System.out.println("Enter an integer:");
            number = input.nextInt();
            
            if (number > 0) {
                printTable(number);
            }
            
            System.out.println("\nContinue? (y/n):");
            inputChar = input.next().charAt(0);
            output = (inputChar == 'y') ? true : false;
        } while (output);
    }
    
    public static void printTable(int number) {
        System.out.printf("\n%6s  %7s  %5s  ", "Number", "Squared", "Cubed");
        System.out.printf("\n%6s  %7s  %5s  ", "======", "=======", "=====");
        for (int i = 1; i <= number; i++) {
            System.out.printf("\n%-6s  %-7s  %-5s  ", i, i * i, i * i * i);
        }
    }
}
