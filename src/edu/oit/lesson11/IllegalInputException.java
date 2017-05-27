package edu.oit.lesson11;

public class IllegalInputException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String type;
	public IllegalInputException (String s) {
		type = s;
		printType();
		
	}
	public void printType() {
		System.out.println(type);
	}

}
