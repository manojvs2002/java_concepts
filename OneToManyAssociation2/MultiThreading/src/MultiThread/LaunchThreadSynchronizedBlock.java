package MultiThread;

class display1234{
	
	
	public void wish(String name) {
		synchronized(display1234.class) {
			System.out.println("thread is created  "+name);
			
			for(int i=0;i<3;i++) {
				System.out.println("good morining  "+name);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println("Thread is destroyed  "+name);
	}
}
class A extends Thread{
	String name;
	display1234 d;
	
	public A(display1234 d,String name) {
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.wish(name);
	}
	
}

public class LaunchThreadSynchronizedBlock {

	public static void main(String[] args) {
		display1234 d=new display1234();
		display1234 d1=new display1234();
		A a=new A(d,"Sachin");
		A a1=new A(d1,"dhoni");
		a.start();
		a1.start();
		
	}
}
