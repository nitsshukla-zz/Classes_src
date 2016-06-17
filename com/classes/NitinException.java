package com.classes;

public class NitinException extends Exception {

	public NitinException(String string) {
		super(string);
	}

	@Override
	public String getMessage() {
		return "[Nitin] "+super.getMessage();
	}

	
}
