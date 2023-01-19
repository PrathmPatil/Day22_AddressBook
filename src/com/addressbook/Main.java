package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	/*
	 * create obj of AddressBook class 
	 * create choise method and take working condition from user
	 * using while loop recurcivelly call t choise method;
	 */
AddressBook addressbook=new AddressBook();
ArrayList<AddressBook> addressbooklist=new ArrayList<AddressBook>();
  
        public void choise()
    {   
        	boolean loop=true;
        	while(true)
        	{
	System.out.println("************Your Address Book***************");
	System.out.println("Press 1 for add contact: ");
	System.out.println("Press 2 for edit contact: ");
	System.out.println("Press 3 for display contact: ");
	System.out.println("Press 4 for delete contact: ");
	System.out.println("Press 5 for exit: ");
	System.out.println();
	System.out.println(addressbook.contact.size()+" Contacts in AddressBook");
	int choose=(new Scanner(System.in).nextInt());
	
	switch(choose)
	 {
	case 1: addressbook.addContact();
	        System.out.println();
	        addressbook.displayContact();
	        System.out.println();
	        break;
	case 2: String name=addressbook.getName();
		    addressbook.EditContact(name);
		    System.out.println("Contact update Successfully.");
		    break;
	case 3:
		   addressbook.displayContact();
		   break;
	case 4: 
		addressbook.deleteContact(addressbook.getName());
		System.out.println("DElete contact Successfully.");
		break;
	case 5: loop=false;
	         Main main=new Main();
            
	break;
	  
	}
	}
   }
	public static void main(String[] args) {
		System.out.println("Welcme in AddressBook");

             Main main=new Main();
//            
             main.choise();
	
   	}

}
