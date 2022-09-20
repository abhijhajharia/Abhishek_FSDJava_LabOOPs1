package cred;

import java.util.Scanner;  // it is used to read Inputs from User.
import java.util.Random; 


// To create Email Accounts For New Joineees.
public class Employee  { 	
	private String firstName;	
	private String lastName;	
	private String email;
	private String password;	
	private int defaultPasswordLength=8; //Length of password i.e 8
	
	private String department;	 
	
	private String companySuffix="gocart.in";
	
	
	/*Determine the department:1.Technical
	 * 						   2.Admin 
	 * 						   3.Human Resource
	 * 						   4.Legal.
	 */
	
	private String setDepartment() {
		System.out.println("Please Enter The Department From The Following:\n1 Technical \n2 Admin \n3 Human Resource \n4 Legal ");
		
		Scanner sc =new Scanner(System.in); //Initialize Scanner Class
		int choice = sc.nextInt(); // Choice for Selection of Dept.
		
		if(choice==1) {
			return "technical";
		} 
		else if(choice==2) {
			return "admin";
		}
		else if(choice==3) {
			return "hr";
		}
		else if(choice==4) {
			return "legal";
		}
		else {
			return " ";
		}
}
	
/* To Generate a Random password that contain:1.Number
 * 												 2.Capital Letter, Small letter 
												 3.Special character)*/
	
	private String randomPassword(int length) {  //
		String passwordSet= "123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@$%&*"; //Combination used to set Password
		char[] password=new char[length]; // password length is set to 8
		for(int i=0;i<length;i++) {  // loop is used to generate password of length 8
			int rand=(int) (Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
		
	
	public Employee(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;		
		
		
		//method to return department
		this.department=setDepartment();		

		//to generate email with First and Last Name combination
		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@" +department+"."+companySuffix;
		
		//method to  return a random generated password
		this.password=randomPassword(defaultPasswordLength);		
		
	}
	
//// To Display the credentials
	
	public String showinfo() {
		return "Dear "+firstName+" "+lastName+" your generated credentials are as follows"+
				"\n Email ---> "+email+
				"\n Password ---> "+password +"\n";
	}
}
