package MultiThread;

class Mythread extends Thread{
	public void start() {
		super.start();
		System.out.println("hello this start methid");
	}
	
	public void run()
	{
		System.out.println("hello this is run method overrided");
	}
}

public class LaunchThread12 {
	
	 public static void main(String[] args)
	 {
		Mythread t=new Mythread();
		t.start();
		
		
		
		System.out.println("this is main method");
	 }

}
