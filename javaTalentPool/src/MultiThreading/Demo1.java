package MultiThreading;

public class Demo1 implements Runnable {

	// creating thread by using Runnable interface 
	
	public static void main(String[] args) {
		System.out.println("thread t1 starts...");
		Demo1 t1 = new Demo1();
		Thread thread = new Thread(t1);
		thread.start();
		Thread t = Thread.currentThread();
		String tname = t.getName();
		System.out.println(t.getId() + " " +tname);
		t.setName("rahul");
		System.out.println("new name : "+t.getName());
	}

	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println("value of i : " +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("thread t1 ends...");
	}
	
}
