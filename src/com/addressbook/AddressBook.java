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
/*
 * at the display time 
 */
public void displayContact()
{
     contact.forEach((info)->{
    	 
    	 System.out.println(info.toString());
     });
}
/*
 * get contact from index using for loop as a specific name
 */
private int  getContactIndex(String name)
{
			for(int i=0;i<contact.size();i++)
			{
				if(contact.get(i).getFirst().equals(name)) {
					return i;
				}
				
			}
	return -1;
}
/*
 * delete contact as per name
 */
public void deleteContact(String name)
{
	contact.remove(getContactIndex(name));
}
/*
 * get name frm user
 */
public String getName()
{
	System.out.println("Enter Name: ");
	String name=(new Scanner(System.in)).nextLine();
	return name;
}
public void EditContact(String name)
{
     int contactIndex=getContactIndex(name);
	if(contactIndex==-1)
	{
		System.out.println("Contact not Exists");
		return;
	}
	boolean isEdit=true;
	while(isEdit)
	{
		System.out.println("Select: ");
		System.out.println("1. first name \n 2.Second name \n 3.Address \n 4.City \n 5.State \n 6.Zip \n 7. phoneNumber \n 8.Email \n 9.Exit");
		int choice=(new Scanner(System.in)).nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter first name: ");
			String first=(new Scanner(System.in)).nextLine();
		   contact.get(contactIndex).setFirst(first);
		    break;
		case 2:
			System.out.println("Enter last name: ");
			String last=(new Scanner(System.in)).nextLine();
		   contact.get(contactIndex).setFirst(last);
		    break;    
		case 3:
			System.out.println("Enter first name: ");
			String Address=(new Scanner(System.in)).nextLine();
		   contact.get(contactIndex).setFirst(Address);
		    break;
		case 4:
			System.out.println("Enter first name: ");
			String city=(new Scanner(System.in)).nextLine();
		   contact.get(contactIndex).setFirst(city);
		    break;
		case 5:
			System.out.println("Enter state: ");
			String state=(new Scanner(System.in)).nextLine();
		   contact.get(contactIndex).setFirst(state);
		    break;
		case 6:
			System.out.println("Enter zip: ");
			String zip=(new Scanner(System.in)).nextLine();
		   contact.get(contactIndex).setFirst(zip);
		    break;
		case 7:
			System.out.println("Enter phone number: ");
			String phonenumber=(new Scanner(System.in)).nextLine();
		   contact.get(contactIndex).setFirst(phonenumber);
		    break;
		case 8:
			System.out.println("Enter email: ");
			String email=(new Scanner(System.in)).nextLine();
		   contact.get(contactIndex).setFirst(email);
		    break;
		case 9:
		     isEdit=false;
		     break;
		default:
			System.out.println("Invalid Option. Please Enter Valid Option.");
			break;
		     
		}
	}
}
}
