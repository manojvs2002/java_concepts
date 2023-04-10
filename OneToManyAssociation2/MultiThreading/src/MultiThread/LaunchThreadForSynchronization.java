package MultiThread;

class Display123{
	//Synchronization is used here.........!!!!!!!!!to do locking System for two threads acting on one object 
	//at the same time................
	//remember the example of non veg biriyani thought by nithin on 6 dec 2022
    public synchronized void wish(String name){
		for (int i=1;i<=3 ;i++ )
		{
			System.out.print("Good Morning: ");
				try{
				     Thread.sleep(1000);
				}
				catch (InterruptedException e){
				}
			
			System.out.println(name);
		}
}
}
class manoj1 extends Thread{
		Display123 d;
		String name;
		
		manoj1(Display123 d,String name){
			this.d=d;
			this.name=name;
		}
		@Override
		public void run()
		{
			d.wish(name);
		}
}


public class LaunchThreadForSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display123 d=new Display123();
		manoj1 t1= new manoj1(d,"dhoni");
		manoj1 t2= new manoj1(d,"yuvi");
		t1.start();
		t2.start();
		System.out.println("this is main thread");
	}

}
