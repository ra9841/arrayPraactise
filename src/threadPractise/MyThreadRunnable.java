package threadPractise;

//Runnable thread only contain run method
public class MyThreadRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread");
		}

	}

	public static void main(String[] args) {
		MyThreadRunnable mt = new MyThreadRunnable();
		Thread t=new Thread(mt);//mt is target runnable
		Thread t1=new Thread();
		t.start();
		
		//t1.start();
		//t1.run();//this will executed as normal method
		//t.run();//this will executed as normal method
		//mt.run();//this will executed as normal method
		
		
		for(int i=0;i<5;i++) {
			System.out.println("main thread");//this is executed by main thread
		}

	}

}
