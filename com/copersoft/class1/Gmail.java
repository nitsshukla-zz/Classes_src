package com.copersoft.class1;

public class Gmail {
	String name, emailId;
	ChatBox chat;
	Inbox inbox;  //Make sure every class can be reached from here
	Starred starred;
	public Gmail() {
		name="Sharath";
		emailId="dasdas";
		chat = new ChatBox();
		inbox = new Inbox();
		starred = new Starred();
	}
}
