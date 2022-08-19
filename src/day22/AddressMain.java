package day22;

import java.util.Scanner;

public class AddressMain {
	/**
	 * Main method to get the users choice
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Address_func af = new Address_func();
		System.out.println("Welcome to address book");
		while(true) {
			System.out.println("1.Create a new Addressbook\t2.Add contacts\t3.Exit program");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				af.createBook();
				break;
			case 2:
				af.addContact();
				break;
			case 3:
				System.exit(1);
				break;
			}
		}
	}

}
