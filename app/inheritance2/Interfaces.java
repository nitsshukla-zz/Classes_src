package app.inheritance2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Interfaces implements Comparable<Interfaces>,Serializable,Cloneable {
	public static void main(String[] args) {
		JavaServicesImpl a = new JavaServicesImpl();
		a.run();
	}

	@Override
	public int compareTo(Interfaces paramT) {
		// TODO Auto-generated method stub
		return 0;
	}
}

class JavaServicesImpl implements Runnable,JavaServices {
	
	@Override
	public void run() {
		System.out.println(12);
	}

	@Override
	public String runJava(String code) {
		return null;
	}
	
}

interface JavaServices{
	public String runJava(String code);
}