package com.test.uml.generalization;

public class CMETradeProcessor extends TradeProcessor {
	@Override
	protected void processExchangeSpecificExtensions() {
		System.out.println("CME specific extensions processed");
	}
}
