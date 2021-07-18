
//public class ThreadPractice extends Thread
// By implementing runnable interafce
public class ThreadPractice extends Thread

{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void finalize()
	{
		System.out.println("garbage collected");
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		ThreadPractice t1 = new ThreadPractice();
//		t1.start();
		ThreadPractice t1 = new ThreadPractice();
		ThreadPractice t2 = new ThreadPractice();
		ThreadPractice t3 = new ThreadPractice();
		t1.start();
		t1.join();
		t2.start();
		t3.start();
		System.gc();
		
		
		
		
		
	}

}
