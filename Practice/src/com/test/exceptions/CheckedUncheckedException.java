package com.test.exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedUncheckedException {
	public static void main(String[] args) {
		
		try {
			//checked Exception FileNotFoundException
			PrintWriter pw = new PrintWriter("c://abc.txt");
			pw.println("hello");
			
		}	catch (FileNotFoundException e) {
			e.printStackTrace();
		}	

		//unchecked exception (Divide by zero)
		System.out.println(10/0);
		//unchecked exception (Array Index Out of bounds
		System.out.println(args[2]);
	}
}
