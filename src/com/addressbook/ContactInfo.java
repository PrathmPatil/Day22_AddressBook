package com.addressbook;

public class ContactInfo {
 private String first,last,address,city,state,zip,phoneNumber,email;
 private String books;
 public String toBookString() {
	 return ("Book Name: "+books);
 }
 public String toString() {
	 return ("Frist Name: "+first+"\n Last Name: "+last+"\n Address: "+address+"\n City: "+city+"\n State: "+state+"\n zip: "
			 +zip+"\n Phone Number: "+phoneNumber+"\n Email: "+email);
 }
public String getBooks() {
	return books;
}
public void setBooks(String books) {
	this.books=books;
}
public String getFirst() {
	return first;
}

public void setFirst(String first) {
	this.first = first;
}

public String getLast() {
	return last;
}

public void setLast(String last) {
	this.last = last;
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

public String getZip() {
	return zip;
}

public void setZip(String zip) {
	this.zip = zip;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
 
}
