package samplePackage;

import java.util.Scanner;

public class Contacts 
{
	public void addcontact()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter First Name:");
		String firstname = input.next();
		
		System.out.println("Enter Last Name:");
		String lastname = input.next();
		
		System.out.println("Enter City:");
		String city = input.next();
		
		System.out.println("Enter State:");
		String state = input.next();
		
		System.out.println("Enter Zip:");
		int zip = input.nextInt();
		
		System.out.println("Enter Phone Number:");
		long phonenumber = input.nextLong();
		
		System.out.println("Enter Email ID:");
		String email = input.next();
	}
	
}
