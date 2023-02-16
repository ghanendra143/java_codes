package MultiThreading;

public class Demo2 extends Thread {

//	creating thread by using Thread class
	
	public static void main(String[] args) throws InterruptedException {
		
		Demo2 dem2 = new Demo2();
		Thread t2 = new Thread(dem2);
		
		t2.setName("myThread2");
		t2.start();
		System.out.println(t2.getName());
		
		Thread.sleep(3000);
		System.out.println("\nthread t1 starts...");
		Demo1 dem1 = new Demo1();
		Thread t1 = new Thread(dem1);
		t1.start();
	}
	
	public void run()
	{
		System.out.println("thread t2 starts.....");
//		System.out.println(t2.getId()+ " " +t2.getName());
		for(int i=10;i>=1;i--)
		{
			System.out.println("value of i2 : "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("thread t2 ends.....");
	}

}
