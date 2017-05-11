package edu.oit.lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Exercise {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("how", "are", "you?"));
        System.out.println("twice: " + list1 + " => " + twice(list1));

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("a", "bb", "c", "ddd", "ee", "f", "g"));
        System.out.println("switchPairs: " + list2 + " => " + switchPairs(list2));

        String str = "12345678";
        System.out.println("addCommas: " + str + " => " + addCommas(str));
        
        String str2 = "A";
        String str3 = "p";
        System.out.println("Letter \"" + str2 + "\" is a vowel? " + isVowel(str2));
        System.out.println("Letter \"" + str3 + "\" is a vowel? " + isVowel(str3));
        
        int a = 4;
        int b = 2;
        System.out.println("isMultiple: " + a + " is multiple of " + b + "? " + isMultiple(a, b));
        
        System.out.println("coinFlip(3, 'T'):");
        coinFlip(3, 'T');
    }

    public static ArrayList<String> twice(ArrayList<String> list) {
        ArrayList<String> newlist = new ArrayList<>();
        newlist.addAll(list);
        newlist.addAll(list);

        return newlist;
    }

    public static ArrayList<String> switchPairs(ArrayList<String> list) {
        ArrayList<String> newlist = new ArrayList<>();
        int size = list.size();
        boolean isEven = size % 2 == 0;

        for (int i = 0; i < size; i++) {
            // is even or is odd and not the last item
            if (isEven || !isEven && i != size - 1) {
                // i start from 0
                if (i % 2 == 0) {
                    newlist.add(list.get(i + 1));
                } else {
                    newlist.add(list.get(i - 1));
                }
            } else {
                newlist.add(list.get(i));
            }
        }

        return newlist;
    }

    public static String addCommas(String str) {
        String newStr = "";
        int len = str.length();
        int num = 0;

        for (int i = len - 1; i >= 0; i--) {
            num++;
            newStr = str.charAt(i) + newStr;

            if (num % 3 == 0) {
                newStr = "," + newStr;
            }
        }

        return newStr;
    }

    public static boolean isVowel(String letter) {
        boolean isVowelLetter = false;
        String vowels = "aeiou";
        if (letter.length() == 1 && vowels.indexOf(Character.toLowerCase(letter.charAt(0))) != -1 ) {
            isVowelLetter = true;
        }
        return isVowelLetter;
    }
    
    public static boolean isMultiple(int a, int b) {
        boolean isMultiple = false;
        if (a > 0 && b > 0 && a % b == 0) {
            isMultiple = true;
        }
        
        return isMultiple;
    }
    
    public static void coinFlip(int k, char side) {
        if (k <= 0 || side != 'H' && side != 'T') {
            System.out.println(side == 'T');
        } else {
            String output = "";
            char opposite = 'H';
            int count = 0;
            boolean isHead = false;
            Random random = new Random();
            
            if (side == 'H') {
                isHead = true;
                opposite = 'T';
            }
            
            while (count < k) {
                boolean head = random.nextBoolean();
                if ( head == isHead ) {
                    count++;
                    output += side + " ";
                } else {
                    count = 0;
                    output += opposite + " ";
                }
            }
            
            if (count >= k) {
                System.out.println(output);
            }
        }
    }
}
