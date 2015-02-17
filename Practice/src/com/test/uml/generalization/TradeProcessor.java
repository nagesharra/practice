package com.test.uml.generalization;

public abstract class TradeProcessor {
	public void processTrade() {
		System.out.println("processing common trade data");
		processExchangeSpecificExtensions();
	}
	
	protected abstract void processExchangeSpecificExtensions();
	
}
