package edu.oit.lesson2;

public class Multiply {

    public static void main(String[] args) {
        int number = 9;
        printMultiplicationTable(number);
    }
    
    public static void printMultiplicationTable(int number) {
        for (int i = 1; i <= number; i++) {
            String expression[] = {"", "", "", "", "", "", "", "", ""};
            
            for (int j = number; j >= i; j--) {
                expression[j - 1] = i + "*" + j + "=" + i * j;
            }
            System.out.printf("%-6s  %-6s  %-6s  %-6s  %-6s  %-6s  %-6s  %-6s  %-6s\n", expression[0], expression[1], expression[2], expression[3], expression[4], expression[5], expression[6], expression[7], expression[8]);
        }
    }

}
