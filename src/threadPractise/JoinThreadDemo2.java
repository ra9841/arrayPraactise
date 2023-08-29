package threadPractise;

public class JoinThreadDemo2 extends Thread {
	static Thread mt;

	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {}
			for(int i=0;i<5;i++) {
				System.out.println("child thread");
			}

		
	}

	public static void main(String[] args) throws InterruptedException {
		JoinThreadDemo2.mt = Thread.currentThread();

		JoinThreadDemo2 jt = new JoinThreadDemo2();
		jt.start();
		//jt.join();//if we uncomment this,as if we put both child and main thread is waititng stage then it will go on deadlock
		//it can not go further.both will wait eachother forever

		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
			Thread.sleep(2000);
		}
	}
//it will print first main thread as child thread is waiting stage so after printing main child will get printed
}
