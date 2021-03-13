package com.cg.eis.employee;
import com.cg.eis.exception.EmployeeException;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the salary");
		int sal=s1.nextInt();
	
	    	 try {
	    		 if(sal>3000)
	    			 System.out.println("your salary is more");
	    		 else
	  	    		 throw new EmployeeException(sal);
	    	 }
	    	 catch(EmployeeException e) {
	    		 System.out.println(e);
	    		 System.out.println("your salary is less");
	    	 }
		}
	}
		
		
	





