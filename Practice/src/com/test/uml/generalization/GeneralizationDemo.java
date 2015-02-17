package com.test.uml.generalization;
/**
 * Example for Generalization
 * @author siri
 *
 */
public class GeneralizationDemo {
	public static void main(String[] args) {
		TradeProcessor cmeTradeProcessor = new CMETradeProcessor();
		cmeTradeProcessor.processTrade();

		TradeProcessor lchTradeProcessor = new LCHTradeProcessor();
		lchTradeProcessor.processTrade();	
	}
}
