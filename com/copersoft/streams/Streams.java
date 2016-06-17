package com.copersoft.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Streams {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream(new File("a.txt"));
		int a = -1;
		do{
			a=fis.read();
			System.out.print((char)a);
		}while(a!=-1);
		fis.close();
		FileOutputStream fos = new FileOutputStream(new File("b.txt"));
		for(int i=0;i<10;i++){
			String a1 = "hello " + i;
			for(int i1=0;i1<a1.length();i1++)
				fos.write(a1.charAt(i1));
			fos.write('\n');
		}
			
		fos.close();
	}
}
