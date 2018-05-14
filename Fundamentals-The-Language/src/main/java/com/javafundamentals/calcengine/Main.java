package com.javafundamentals.calcengine;

public class Main {
	public static void main (String[] args) {

		String[] statements = {
			"add 25.0 92.0", 
			"power 5.0 2.0"
		};

		DynamicHelper helper = new DynamicHelper(new MathProcessing[] {
			new Adder(), 
			new PowerOf()
		});

		for (String statement : statements) {
			String output = helper.process(statement);
			System.out.println(output);
		}
	}
}
