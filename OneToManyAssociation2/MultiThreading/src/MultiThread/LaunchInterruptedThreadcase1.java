package MultiThread;

class nanuthread extends Thread{
	
	public void run() {
		try{
		for(int i=0;i<5;i++) {
			System.out.println("this is child thread");
			Thread.sleep(3000);
		}
		}
		catch(InterruptedException e) {
			
			System.out.println("Thread got interupted");
		}
	}
}
public class LaunchInterruptedThreadcase1 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		nanuthread t=new nanuthread();
		t.start();
		
		t.interrupt();
		for(int i=0;i<5;i++) {
			
			System.out.println("this is main thread");
		}

	}

}
