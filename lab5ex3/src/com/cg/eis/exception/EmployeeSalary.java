package com.cg.eis.exception;

public class EmployeeSalary {

	private int sal;
	private String name;
	public EmployeeSalary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EmployeeSalary(int sal, String name) {
		super();
		this.sal = sal;
		this.name = name;
		
	}
	@Override
	public String toString() {
		return "EmployeeSalary [sal=" + sal + ", name=" + name + "]";
	}
}
