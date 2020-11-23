package samplePackage;

import java.util.ArrayList;
import java.util.Scanner;


public class AddressBook 
{
	public static void main(String[] args)
	{
		System.out.println("Welcome To Address Book");
		
		boolean stop = false;
		while(!stop)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Select suitable Option:");
			System.out.println("Press 1 to Create New Contact");
			System.out.println("Press 2 to Delete the contact");
			System.out.println("Press 3 to Edit the contact");
			System.out.println("Press 4 to View the entries");
			System.out.println("Press 5 to exit");

			int option = input.nextInt();
				
			switch (option)
			{
				case 1:
					addcontact();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					display();
					break;
				case 5:
					System.out.println("Thank You!!");
					stop = true;
					break;
				default:
					System.out.println("invalid selection");
			}	
		}
	}
	
	static int entry = 0;
	static ArrayList<String> Fname = new ArrayList<String>();
	static ArrayList<String> Lname = new ArrayList<String>();
	static ArrayList<String> City = new ArrayList<String>();
	static ArrayList<String> State = new ArrayList<String>();
	static ArrayList<Integer> Zip = new ArrayList<Integer>();
	static ArrayList<Long> Mobile = new ArrayList<Long>();
	static ArrayList<String> Email = new ArrayList<String>();
	
	public static void addcontact()
	{
		entry++;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter First Name:");
		String firstname = input.next();
		Fname.add(firstname);
		
		System.out.println("Enter Last Name:");
		String lastname = input.next();
		Lname.add(lastname);
		
		System.out.println("Enter City:");
		String city = input.next();
		City.add(city);
		
		System.out.println("Enter State:");
		String state = input.next();
		State.add(state);
		
		System.out.println("Enter Zip:");
		int zip = input.nextInt();
		Zip.add(zip);
		
		System.out.println("Enter Phone Number:");
		long phonenumber = input.nextLong();
		Mobile.add(phonenumber);
		
		System.out.println("Enter Email ID:");
		String email = input.next();
		Email.add(email);
	}
	
	public static void display()
	{
		for (int i=1; i<=entry; i++)
		{
			System.out.println("******************Entry No.: " + i);
			System.out.println("First Name: " + Fname.get(i-1));
			System.out.println("Last Name: " + Lname.get(i-1));
			System.out.println("City: " + City.get(i-1));
			System.out.println("State: " + State.get(i-1));
			System.out.println("Zip: " + Zip.get(i-1));
			System.out.println("Phone no.: " + Mobile.get(i-1));
			System.out.println("Email: " + Email.get(i-1));
		}
	}
}

