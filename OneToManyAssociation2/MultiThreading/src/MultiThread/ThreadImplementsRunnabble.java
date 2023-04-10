package MultiThread;

class Myrunnable implements Runnable{
	
	public void run() {
		
		System.out.println("JAI HANUMAN");
	}
}

public class ThreadImplementsRunnabble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Myrunnable r = new Myrunnable();
		
		Thread t1 = new Thread(r);
		Thread t2=new Thread(r);
		t2.run();
		
		
		System.out.println("JAI HANUMAN MAIN");
	}

}
