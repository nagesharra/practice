package com.test.uml.realization;

/**
 * Example for Realization
 * @author siri
 *
 */
public class RealizationDemo {
	public static void main(String[] args) {
		FPMLProcessor processor56 = getFPMLProcessor("5.6");
		if(processor56!=null) {
			processor56.processFPML();
		}
		
		FPMLProcessor processor57 = getFPMLProcessor("5.7");
		if(processor57!=null) {
			processor57.processFPML();
		}	
	}
	
	public static FPMLProcessor getFPMLProcessor(String fpmlVersion) {
		switch(fpmlVersion) {
		case "5.6": return new FPML56Processor(); 
		case "5.7": return new FPML57Processor();
		default: System.err.println("Unsupported fpml version:"+fpmlVersion);
		}
		return null;
	}
}
