package threadPractise;

public class MyThread3 extends Thread {
	public void start() {
		//calling new thread.so under new thread the run method will be executed
		super.start();//next case.try with this and without this
		System.out.println("start method");
	}

	public void run() {
		System.out.println("run method");

	}

	public static void main(String[] args) {
		MyThread3 mt = new MyThread3();
		mt.start();//in this case start method is executed as normal method call
		System.out.println("main method");
	}
}
//the output is created/produced by only main thread
//in this second case:main thread will execute start and main method.child thread(super.start()) will execute run method