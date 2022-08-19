package day22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Address_func {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private double phno;
	private String email;
	Map<String, ArrayList<Address_func>> map = new HashMap<String, ArrayList<Address_func>>();
	Scanner sc = new Scanner(System.in);
	List<String> lis = new ArrayList<String>();
	
	public Address_func() {
		
	}
	/**
	 * Constructor to store the users value
	 * @param fname
	 * @param lname
	 * @param addr
	 * @param cit
	 * @param state
	 * @param phone
	 * @param email
	 */
	public Address_func(String fname, String lname, String addr, String cit, String state, double phone, String email ) {
		this.firstName = fname;
		this.lastName=lname;
		this.address=addr;
		this.city=cit;
		this.state=state;
		this.phno=phone;
		this.email=email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public double getPhno() {
		return phno;
	}

	public void setPhno(double phno) {
		this.phno = phno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * Method to add a new contact details
	 */
	public void addContact() {
		int count=1;
		System.out.println("Select the book");
		for(String name : map.keySet()) {
			System.out.println(+count+"."+name);
			lis.add(name);
			count++;
		}
		count=1;
		int choice = sc.nextInt();
		String slectedBook= lis.get(choice-1);
		lis.clear();
		System.out.println("Enter the firstname");
		String fname = sc.next();
		System.out.println("Enter the lastname");
		String lname = sc.next();
		System.out.println("Enter the address");
		String addr = sc.next();
		System.out.println("Enter the city");
		String city = sc.next();
		System.out.println("Enter the state");
		String state = sc.next();
		System.out.println("Enter the phone");
		double phno = sc.nextDouble();
		System.out.println("Enter the email");
		String email = sc.next();
		Address_func af = new Address_func(fname, lname, addr, city, state, phno, email);
		map.get(slectedBook).add(af);
	}
	/**
	 * Method to create a new address book
	 */
	public void createBook() {
		System.out.println("Enter the name of your book");
		String bookName = sc.next();
		map.put(bookName, new ArrayList<Address_func>());
	}
	
}
