package threadPractise;

public class MyThread2 extends Thread{
	public void run() {
		System.out.println("no arg run");
	}
	//method overloading
	public void run(int i) {
		System.out.println("int arg run");
	}
	public static void main(String[] args) {
		MyThread2 mt=new MyThread2();
		mt.start();//in thread class start method always call no argument run method
		//overloading of run method is always possible but thread class method can invoke no argument run method.It can call 
		//-by normal method call.
	}

}
