package com.classes;

public class Test2 {
	public static void main(String[] args) {
		try{
			throw new NitinException("throwing an exception");
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
