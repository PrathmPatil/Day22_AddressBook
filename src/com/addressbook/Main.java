package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	    
	AddressBook addressbook=new AddressBook();
	/*
	 * create obj of AddressBook class 
	 * create choise method and take working condition from user
	 * using while loop recurcivelly call t choise method;
	 */
		/*
	  * Create multiple books
	  */
ArrayList<AddressBook> addressbooklist=new ArrayList<AddressBook>();

//     public void books()
//     {
//    	 AddressBook addressbook=new AddressBook();
//    		Main main=new Main();
//
//	System.out.println("Enter book name: ");
//	String bookName=(new Scanner (System.in)).nextLine();
//	addressbooklist.add(addressbook);
//     }
//    public void bookList()
//     {
//	  System.out.println("Press 1 for new AddressBook: ");
//	  int booknumber=(new Scanner(System.in)).nextInt();
//	  switch(booknumber)
//	  {
//	  case 1: Main main=new Main();
//	         main.books();
//	         break;
//	         
//	  }
//  }
      public void bookList()
      {
    	  AddressBook addressbook=new AddressBook();
    		Main main=new Main();

    	  addressbook.addbook();
    	  System.out.println("press 1 for add book: ");
    	  System.out.println("press 2 for show book name: ");
    	  System.out.println("press 3 for add contact: ");
    	  
    	  int choose=(new Scanner(System.in).nextInt());
    	  switch(choose)
    	  {
    	  case 1: addressbook.addbook();
    	  break;
    	  case 2: addressbook.displayBooks();
    	         bookList();
    	  break;
    	  case 3: main.choise();
    	  break;
    	  }
    	  
      }
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
              main.bookList();
	    break;
	  
	}
	}
   }
	public static void main(String[] args) {
		System.out.println("Welcme in AddressBook");

             Main main=new Main();
             
             main.bookList();
             main.choise();
	
   	}

}
