package com.addressbook;

import java.util.Scanner;

public class Main {
	
	/*
	 * create obj of AddressBook class 
	 * create choise method and take working condition from user
	 * using while loop recurcivelly call t choise method;
	 */
AddressBook addressbook=new AddressBook();
        public void choise()
    {   
	System.out.println("************Your Address Book***************");
	System.out.println("Press 1 for add contact: ");
	int choose=(new Scanner(System.in).nextInt());
	switch(choose)
	 {
	case 1: addressbook.addContact();
	        System.out.println();
	        addressbook.displayContact();
	        System.out.println();
	 }
	choise();
   }
	public static void main(String[] args) {
		System.out.println("Welcme in AddressBook");

             Main main=new Main();
             main.choise();
	
   	}

}
