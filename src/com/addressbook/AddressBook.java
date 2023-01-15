package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	/*
	 * Create arraylist of contactinfo class 
	 * take info and store in array
	 * using add method take inputfrom user and tore in array
	 * then display the contact
	 */
	ArrayList<ContactInfo> contact=new ArrayList<ContactInfo>();

public void addContact() {
	 ContactInfo contactinfo=new ContactInfo();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter first name: ");
	contactinfo.setFirst(sc.nextLine());
	System.out.println("Enter last name: ");
	contactinfo.setLast(sc.nextLine());
	System.out.println("Enter Address: ");
	contactinfo.setAddress(sc.nextLine());
	System.out.println("Enter city: ");
	contactinfo.setCity(sc.nextLine());
	System.out.println("Enter state: ");
	contactinfo.setState(sc.nextLine());
	System.out.println("Enter zip code: ");
	contactinfo.setZip(sc.nextLine());
	System.out.println("Enter Email: ");
	contactinfo.setEmail(sc.nextLine());
	System.out.println("Enter phone number: ");
	contactinfo.setPhoneNumber(sc.nextLine());
	contact.add(contactinfo);
}
public void displayContact()
{ 
     contact.forEach((info)->{
   	  System.out.println("Name: "+info.getFirst()+" "+info.getLast());
   	  System.out.println("Address: "+info.getAddress()+"\n"+"City: "+info.getCity());
   	  System.out.println("State: "+info.getState()+"\n"+"Zip: "+info.getZip()+"\n"+"Email: "+info.getEmail());
   	  System.out.println("Phone Number: "+info.getPhoneNumber());
   	  
     });
}
}
