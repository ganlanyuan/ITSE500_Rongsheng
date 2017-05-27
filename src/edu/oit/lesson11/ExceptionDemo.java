package edu.oit.lesson11;

import java.util.Scanner;

public class ExceptionDemo {
	public void main(String[] args) {
		int a = 100 / 0;
		System.out.println(a);
		
		String s1 = null;
		System.out.println(s1.length());
		
		String s = "book";
		int i = Integer.parseInt(s);
		System.out.println(s.charAt(4));
	}
}
