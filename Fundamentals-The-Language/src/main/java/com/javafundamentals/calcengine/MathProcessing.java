package com.javafundamentals.calcengine;

public interface MathProcessing {
	String SEPARATOR = " ";
	String getKeyword();
	char getSymbol();
	double doCalculation(double laftVal, double rightVal);
}
