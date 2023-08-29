package threadPractise;

public class ThreadPriority2 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("child thread");
		}
	}


	public static void main(String[] args) {
		ThreadPriority2 tp=new ThreadPriority2();
		tp.setPriority(5);
		tp.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}

	}

}
