package threadPractise;

public class InterruptThreadDemo extends Thread{
	public void run() {
		try {
		for(int i=0;i<5;i++) {
			System.out.println("I am lazy thread");
			//try {//if we put try here then will get different output
				Thread.sleep(2000);
		}
			} catch (InterruptedException e) {
				System.out.println("I get interrupted");
			}
		}
	
	public static void main(String[] args) {
		InterruptThreadDemo it=new InterruptThreadDemo();
		it.start();//child thread start
		
		it.interrupt();//main thread interrupt child thread
		
		System.out.println("end of main");
	}

}
