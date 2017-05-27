package edu.oit.lesson11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		doDivision();

	}

	private static void doDivision() {
		int num1 = 100;
		int num2, result;
		Scanner input;

		while (true) {
			try {
				input = new Scanner(System.in);
				System.out.println("Enter division by:");
				num2 = input.nextInt();
				result = num1 / num2;
				System.out.printf("The result is: %d\n", result);
				 input.close();
				 break;
			} catch (ArithmeticException e) {
				throw new IllegalInputException("The division can not be zero, please input again.");
			} catch (InputMismatchException e) {
				throw new IllegalInputException("The division can not be a letter, please input again");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}
		}
	}

}
