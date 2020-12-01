package com.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook
{
    public static void main(String[] args)
    {
        System.out.println("Welcome To Address Book");
        int a=0;

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
            //System.out.println("Press 6 to add new Address Book");

            int option = input.nextInt();

            switch (option)
            {
                case 1:
                    Scanner check = new Scanner(System.in);
                    a++;

                    System.out.println("Enter Address Book name:");
                    String addressbook = check.next();

                    System.out.println("Enter First Name:");
                    String firstname = check.next();
                    if(a>1)
                    {
                        if(Adrsbook.containsKey(addressbook))
                        {
                            if (Adrsbook.get(addressbook).contains(firstname)) {
                                System.out.println("This entry already exist.");
                                break;
                            }
                            else
                            {
                                Fname.add(firstname);
                                Adrsbook.put(addressbook, Fname);
                                addcontact();
                            }
                        }
                        else
                        {
                            Fname.add(firstname);
                            Adrsbook.put(addressbook, Fname);
                            addcontact();
                        }
                    }
                    else
                    {
                        Fname.add(firstname);
                        Adrsbook.put(addressbook, Fname);
                        addcontact();
                    }
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    edit();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    System.out.println("Thank You!!");
                    stop = true;
                    break;
            /*    case 6:
                    addAddressBook();
                    break;

             */
                default:
                    System.out.println("invalid selection");
            }
        }
    }

/*
    public static void addAddressBook()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Address Book name:");
        String addressbook = input.next();
        System.out.println("Enter First Name:");
        String firstname = input.next();
        Fname.add(firstname);
        Adrsbook.put(addressbook, Fname);
    }

 */


    static int entry = 0;
    //static ArrayList<String> Adrsbook = new ArrayList<String>();
    static HashMap<String, ArrayList<String>> Adrsbook= new HashMap<String, ArrayList<String>>();
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
/*
        System.out.println("Enter Address Book name:");
        String addressbook = input.next();

        System.out.println("Enter First Name:");
        String firstname = input.next();
        Fname.add(firstname);

 */

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
        //System.out.println(Adrsbook);
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

    public static void delete()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String over = input.next();
        int j = Fname.indexOf(over);
        Fname.remove(j);
        Lname.remove(j);
        City.remove(j);
        State.remove(j);
        Zip.remove(j);
        Mobile.remove(j);
        Email.remove(j);
        entry -= 1;
    }

    public static void edit()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String over = input.next();
        int k = Fname.indexOf(over);
        System.out.println("Enter updated mobile no.: ");
        long elem = input.nextLong();
        Mobile.set(k, elem);
    }
}
