package com.copersoft.class1;

import java.util.ArrayList;
import java.util.List;

public class ChatBox {
	String lastMessage, name;
	List<Contact> contacts ;
	public void chat(){
		lastMessage="dsadsa";
		contacts = new ArrayList<Contact>();
		Contact contact1 = new Contact("Sharath","yesterday");
		contacts.add(contact1);
		Contact contact2 = new Contact("Bharat","2 days");
		contacts.add(contact2);
	}
}

class Sharath{
	
}