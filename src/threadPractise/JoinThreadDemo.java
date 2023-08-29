package threadPractise;

public class JoinThreadDemo extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Seetha thread");
			try {
				Thread.sleep(2000);//2 sec
			} catch (InterruptedException e) {
				
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		JoinThreadDemo jt=new JoinThreadDemo();
		jt.start();
		jt.join();//if we comment this then first main thread will be print first then child thread.
		for(int i=0;i<5;i++) {
			System.out.println("rama thread");//rama thread has to wait until seetha thread complete
			//main thread has to wait until child thread complete.
		}
	}

}
