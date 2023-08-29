package deadLockThread;

public class ThreadB {
	public synchronized void d2(ThreadA a) {
		System.out.println("Thread 2 start execution of d2 method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread 2 trying to call ThreadA last method");
		a.last();
	}
	
	public synchronized void last() {
		System.out.println("inside ThreadB,last method");
	}

}
