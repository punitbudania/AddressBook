package samplePackage;

import java.util.Scanner;

public class AddressBook 
{
	public static void main(String[] args)
	{
		System.out.println("Welcome To Address Book");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Press 1 if you want to add a new contact, otherwise press 0");
		int option = input.nextInt();
		
		if(option == 1)
		{
			Contacts contactdetails = new Contacts();
			contactdetails.addcontact();
		}
		else if(option == 0)
		{
			System.out.println("Thank You!!");
		}
		else
		{
			System.out.println("invalid selection");
		}
	}
}
