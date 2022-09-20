package app;

import java.util.Scanner;  
import cred.Employee; 


public class Main {

	//Main Method
	 
	public static void main(String[] args) {
		System.out.println("Please Enter First Name");
		Scanner sc =new Scanner(System.in);
		String first_name = sc.next();
		
		System.out.println("Please Enter Last Name");
		Scanner sc1 =new Scanner(System.in);
		String last_name = sc1.next();
		
		Employee em1=new Employee(first_name,last_name); //Generate an email of particular employee.
		
		System.out.println(em1.showinfo()); // display cred
		
	}
}