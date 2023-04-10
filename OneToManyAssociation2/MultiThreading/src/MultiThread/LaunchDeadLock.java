package MultiThread;


class hara {
	public synchronized void d1(hari h) {
		System.out.println("Thread-1 stert its code");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
		}
		System.out.println("Thread 1 trying to call k last()");
		h.last();
		
	}
	public synchronized void last() {
		System.out.println("inside hara last method");
	}
	
}
class hari{
	
	public synchronized void d2(hara k) {
	System.out.println("Thread 2 starts its code");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		
	}
	System.out.println("Thread 2 trying to call k last()");
	k.last();
	
	}
	public synchronized void last() {
		System.out.println("inside hari last method");
	}
}
public class LaunchDeadLock extends Thread {

	
		hara h=new hara();
		hari k=new hari();
		
		public void m1() 
		{
			this.start();
			h.d1(k);
		}
		public void run() {
			k.d2(h);
		}

		public static void main(String[] args) {
			LaunchDeadLock t=new LaunchDeadLock();
			t.m1();
		}

}
