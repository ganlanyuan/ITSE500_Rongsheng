package edu.oit.lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("This program lists the Fibonacci sequence.");
        int number = scanner.nextInt();
        
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(0, 1));
        
        while (nums.get(nums.size() - 1) + nums.get(nums.size() - 2) <= number) {
            nums.add(nums.get(nums.size() - 1) + nums.get(nums.size() - 2));
        }
        
        String output = nums.toString();
        System.out.println(output.substring(1, (output.length() - 1)));
        scanner.close();
    }

}
