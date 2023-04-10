package MultiThread;

class XYZ{
	
	synchronized void m1() {
		System.out.println("this m1 method");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("interrupt at m1");
		}
	}
	synchronized void m2() {
		System.out.println("this m2 method");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("interrupt at m1");
		}
	}
	void m3() {
		System.out.println("this m3 method");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("interrupt at m1");
		}
	}
	
}

class jonam extends Thread{
	XYZ x;
	public jonam(XYZ x) {
		this.x=x;
	}
	
	public void run() {
		x.m1();
		x.m2();
		x.m3();
	}
	
}




public class LaunchThreadLockingProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XYZ x=new XYZ();
		jonam j=new jonam(x);
		j.start();
			
	}

}
