package MultiThread;
class nanduthread extends Thread{
	
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println("this is child thread");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(" thread got interrupted");
			}
		}
		
		
	}
}

public class LaunchInterrptedThreadcase2 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		nanduthread t=new nanduthread();
		t.start();
		
		
		t.interrupt();
		for(int i=0;i<5;i++) {
			System.out.println("this is main thread");
		}
	}

}
