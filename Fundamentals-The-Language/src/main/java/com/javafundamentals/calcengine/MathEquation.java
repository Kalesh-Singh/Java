package com.javafundamentals.calcengine;

public class MathEquation {
	private double leftVal;
	private double rightVal;
	private char opcode;
	private double result;

	public double getLeftVal () { return leftVal; } 
	public void setLeftVal (double leftVal) { this.leftVal = leftVal; }
	public double getRightVal () { return rightVal; }
	public void setRightVal (double rightVal) { this.rightVal = rightVal; }
	public char getOpcode () { return opcode; }
	public void setOpcode (char opcode) { this.opcode = opcode; }

	public double getResult () { return result; }
	
	public MathEquation () {};
	public MathEquation (char opcode) {
		this.opcode = opcode;
	}

	public MathEquation (char opcode, double leftVal, double rightVal) {
		this(opcode);
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}

	public void execute (double leftVal, double rightVal) {
		this.leftVal = leftVal;
		this.rightVal = rightVal;
		execute();
	}
	
	public void execute (int leftVal, int rightVal) {
		this.leftVal = leftVal;
		this.rightVal = rightVal;
		execute();
		result = (int) result;
	}
	
	public void execute() {
		switch (opcode) {
			case 'a':
				result = leftVal + rightVal;
				break;
			case 's':
				result = leftVal - rightVal;
				break;
			case 'm':
				result = leftVal * rightVal;
				break;
			case 'd':
				result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
				break;
			default:
				System.out.println("Error - Invalid Opcode");
				result = 0.0d;
				break;
		}
	
	}
}