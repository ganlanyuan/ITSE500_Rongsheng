package edu.oit.lesson3;

import java.util.Scanner;

public class ReverseString {
    private static Scanner input;
    
    public static void main(String[] args) {
        String inputString;
        String reversedString = "";
        input = new Scanner(System.in);
        
        System.out.println("Enter a String:");
        inputString = input.nextLine();
        
        int len = inputString.length();
        for ( int i = len - 1; i >= 0; i--) {
            reversedString += inputString.charAt(i);
        }
        
        System.out.println(reversedString);
    }

}
