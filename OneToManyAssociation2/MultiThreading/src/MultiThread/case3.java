package MultiThread;

class Display12{
public void wish(String name){
		for (int i=1;i<=3 ;i++ )
		{
			System.out.print("Good Morning: ");
				try{
				     Thread.sleep(2000);
				}
				catch (InterruptedException e){
				}
			
			System.out.println(name);
		}
}
}
class manoj extends Thread{
		Display12 d;
		String name;
		
		manoj(Display12 d,String name){
			this.d=d;
			this.name=name;
		}
		@Override
		public void run()
		{
			d.wish(name);
		}
}

public class case3 {
	public static void main(String... args){
		Display12 d=new Display12();
		manoj t1= new manoj(d,"dhoni");
		manoj t2= new manoj(d,"yuvi");
		t1.start();
		t2.start();
		System.out.println("this is main thread");
		}

}
