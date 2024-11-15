package PracticeCode;

import java.util.Scanner;

public class ElseIfStatement {

	public static void main(String[] args) 
	{
		        System.out.println("Enter Your Mark:");

		        Scanner S = new Scanner(System.in);
		        int mark = S.nextInt();  
		        if (mark == 100) {
		            System.out.println("Grade: A++");
		        } else if (mark >= 95) {
		            System.out.println("Grade: A");
		        } else if (mark >= 80) {
		            System.out.println("Grade: B");
		        } else if (mark >= 70) {
		            System.out.println("Grade: C");
		        } else if (mark >= 50) {
		            System.out.println("Grade: D");
		        } else if (mark >= 35) {
		            System.out.println("Grade: E");
		        } else {
		            System.out.println("Invalid Mark");
		        }

		       
		        S.close();
		    }
			       
    }
		
	


