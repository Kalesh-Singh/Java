package com.javafundamentals.calcengine;

public class Main {
	public static void main (String[] args) {

		String[] statements = {"add 25.0 92.0"};

		DynamicHelper helper = new DynamicHelper(new MathProcessing[] {
			new Adder()
		});

		for (String statement : statements) {
			String output = helper.process(statement);
			System.out.println(output);
		}
	}
}
