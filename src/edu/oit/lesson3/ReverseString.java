package edu.oit.lesson3;

import java.util.Scanner;

public class ReverseString {
    private static Scanner input;
    
    public static void main(String[] args) {
        String inputString;
        input = new Scanner(System.in);
        
        System.out.println("Enter a String:");
        inputString = input.nextLine();
        
        System.out.println(reverseString(inputString));
    }
    
    public static String reverseString(String originalStr) {
        String reversedStr = "";
        
        int len = originalStr.length();
        for ( int i = len - 1; i >= 0; i--) {
            reversedStr += originalStr.charAt(i);
        }
        return reversedStr;
    }

}
