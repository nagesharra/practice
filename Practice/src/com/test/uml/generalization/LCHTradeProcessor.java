package com.test.uml.generalization;

public class LCHTradeProcessor extends TradeProcessor {
	@Override
	protected void processExchangeSpecificExtensions() {
		System.out.println("LCH specific extensions processing");
	}
}
