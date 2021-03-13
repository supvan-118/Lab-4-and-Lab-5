package b1;

import java.util.Scanner;
 class AgeExcep extends Exception{
	 public AgeExcep(String s) {
		 System.out.println(s);
	 }
 }
public class ValidateAge {
     public static void main(String args[]){
    	// TODO Auto-generated method stub

    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter your  age");
    	 int age=sc.nextInt();
    	 
    	 try {
    		 if(age<15)
    			 throw new AgeExcep("your age is not valid");
    		 else
    			 System.out.println("your age is valid");
    	 }
    	 catch(AgeExcep e) {
    		 System.out.println(e);
    	 }
     }
}
