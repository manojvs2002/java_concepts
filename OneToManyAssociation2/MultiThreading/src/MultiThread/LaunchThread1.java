package MultiThread;

class thread1 extends Thread{
	
	@Override
	public void run() {
	for(int i=0;i<10;i++) {
		System.out.println("single thread");
	}
	}
}

public class LaunchThread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread1 t=new thread1();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}
		
	}

}
