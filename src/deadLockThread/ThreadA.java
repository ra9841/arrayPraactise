package deadLockThread;



public class ThreadA {
	public synchronized void d1(ThreadB b) {
		System.out.println("Thread 1 start execution of d1 method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread 1 trying to call ThreadB last method");
		b.last();
	}
	
	public synchronized void last() {
		System.out.println("inside ThreadA,last method");
	}
	

}
