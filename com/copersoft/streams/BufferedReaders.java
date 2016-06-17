package com.copersoft.streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaders {
	public static void main(String[] args) throws Exception {
		BufferedReader buf = new BufferedReader(new FileReader("a.txt"));
		while(buf.ready())
			System.out.println(buf.readLine());
		buf.close();
		BufferedWriter buf1 = new BufferedWriter(new FileWriter("b.txt"));
		for(int i=0;i<10;i++){
			String a1 = "hello " + i;
			buf1.write(a1);
			buf1.newLine();
		}
		buf1.close();
	}
}
