package lambdaExpression;

public class ThreadDemo {
	
	public static void main(String[] args) {
		Runnable thread1 = () -> {
			
			for(int i=0;i<=10;i++) {
				System.out.println("value of i : "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Runnable thread2 = () -> {
			System.out.println("thread2 starts....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("thread2 stop.");
		};
		
		Thread t1 = new Thread(thread1);
		t1.setName("firstThread");
		t1.start();
		t1.setPriority(1);
		
		Thread t2 = new Thread(thread2);
		t2.setName("secondThread");
		t2.start();
		t2.setPriority(2);
	}
}
