package deadLockThread;

public class MyThread extends Thread{
	
	ThreadA a=new ThreadA();
	ThreadB b=new ThreadB();
	
	public void m1() {
		this.start();//main thread start child thread
		a.d1(b);//main thread is responsible for this
	}
	//main thread will call to run method
	public void run() {
		b.d2(a);//child thread is responsible for this
	}
	//so in this situation both thread are waiting for each other for forever

	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.m1();

	}

}
//try with and without synchronized keyword in method of ThreadA & ThreadB class.Solution: ctrl+c(not good practise)