package com.cg.eis.exception;

public class EmployeeException extends Exception{
	float salary;

	public EmployeeException(float salary) {
		super();
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeException [salary=" + salary + "]";
	}
	

}
