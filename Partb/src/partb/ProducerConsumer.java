package partb;
class utility{
	int i;
	boolean bool=false;
	public synchronized void set(int i) throws InterruptedException {
		while(bool)
		{
			wait();
			
		}
		this.i=i;
		bool=true;
		System.out.print("producer"+i);
		notify();
		
	}
	public synchronized void get() throws InterruptedException
	{
		while(!bool)
		{
			wait();
		}
		bool = false;
		System.out.print("consumer"+i);
		notify();
	}
}
class producer implements Runnable{
	private utility u;
	int i=0;
	public producer(utility u)
	{
		this.u=u;
		Thread producer=new Thread(this,"producer");
		producer.start();
				
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				u.set(i++);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class consumer implements Runnable{
	private utility u;
	public consumer(utility u)
	{
		this.u=u;
		Thread consumer=new Thread(this,"consumer");
		consumer.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
			{
		try {
			u.get();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
	}
	
}
public class ProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		utility uti=new utility();
		new producer(uti);
		new consumer(uti);
		

	}

}
