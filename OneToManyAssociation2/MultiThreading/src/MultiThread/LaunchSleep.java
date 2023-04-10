package MultiThread;

public class LaunchSleep {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("R");
		
		Thread.sleep(3000);
		
		System.out.println("C");

		Thread.sleep(1000);
		
		System.out.println("B");
	}

}
