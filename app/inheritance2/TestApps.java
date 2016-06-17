package app.inheritance2;

public class TestApps {

	public static void main(String[] args) {
		WindowsApp w = new WindowsApp();
		App  a= new App();
		AndroidApp an = new AndroidApp();
		IOSApp i = new IOSApp();
		//App a = (App)w;
		((App)w).run();
	}

}

class App{
	public void run(){
		System.out.println(0);
	}
}
class WindowsApp extends App{
	public void run(){
		System.out.println(1);
	}
}
class AndroidApp extends App{
	public void run(){
		System.out.println(2);
	}
}
class IOSApp extends App{
	public void run(){
		System.out.println(3);
	}
}