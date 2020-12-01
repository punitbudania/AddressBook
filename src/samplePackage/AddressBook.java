package samplePackage;

import java.util.*;
import java.util.stream.Collectors;

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
            System.out.println("Press 5 to Search persons by State");
            System.out.println("Press 6 to Search persons by City");
            System.out.println("Press 7 to count persons by State");
            System.out.println("Press 8 to count persons by City");
            System.out.println("Press 9 to exit");

            int option = input.nextInt();

            switch (option)
            {

                case 1:
                    a++;
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter Address Book name:");
                    String addressbook = sc.next();

                    System.out.println("Enter First Name:");
                    String firstname = sc.next();
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
                    sc = new Scanner(System.in);
                    System.out.println("Enter State:");
                    String selectState = sc.next();
                    List<String> ReqPerson = new ArrayList<>();
                    ReqPerson = StatePerson.entrySet()
                            .stream()
                            .filter(e -> e.getKey()==selectState)
                            .map(Map.Entry::getValue)
                            .collect(Collectors.toList());
                    System.out.println(ReqPerson);
                    break;
                case 6:
                    sc = new Scanner(System.in);
                    System.out.println("Enter City:");
                    String selectCity = sc.next();
                    List<String> ReqCPerson = new ArrayList<>();
                    ReqCPerson = CityPerson.entrySet()
                            .stream()
                            .filter(e -> e.getKey()==selectCity)
                            .map(Map.Entry::getValue)
                            .collect(Collectors.toList());
                    System.out.println(ReqCPerson);
                    break;
                case 7:
                    sc = new Scanner(System.in);
                    System.out.println("Enter State:");
                    String countState = sc.next();
                    long totalState = StatePerson.entrySet()
                            .stream()
                            .filter(e -> e.getKey()==countState)
                            .count();
                    System.out.println(totalState);
                    break;
                case 8:
                    sc = new Scanner(System.in);
                    System.out.println("Enter City:");
                    String countCity = sc.next();
                    long totalCity = CityPerson.entrySet()
                            .stream()
                            .filter(e -> e.getKey()==countCity)
                            .count();
                    System.out.println(totalCity);
                    break;
                case 9:
                    System.out.println("Thank You!!");
                    stop = true;
                    break;
                default:
                    System.out.println("invalid selection");
            }
        }
    }



    static int entry = 0;
    static HashMap<String, ArrayList<String>> Adrsbook= new HashMap<String, ArrayList<String>>();
    static HashMap<String, String> CityPerson = new HashMap<String, String>();
    static HashMap<String, String> StatePerson = new HashMap<String, String>();
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
        CityPerson.put(city, Fname.get(entry-1));

        System.out.println("Enter State:");
        String state = input.next();
        State.add(state);
        StatePerson.put(state, Fname.get(entry-1));

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
        System.out.println(Adrsbook);
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
