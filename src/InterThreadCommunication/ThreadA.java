package InterThreadCommunication;

public class ThreadA {

	public static void main(String[] args) throws InterruptedException {

		ThreadB t = new ThreadB();
		t.start();//it will call child thread
		
		//Thread.sleep(10000);//10 sec  whenever u r updating something then sleep method is not good to use.
		//Thread.sleep(1);//0.001 sec
		//Thread.sleep(0,1);//o milisecond,1 nanosecond
		
		//t.join();//It is not better to use join method.As if after updation there are a lots of code,
		
		synchronized (t) {
			System.out.println("main thread trying to call wait method");
			t.wait();
			System.out.println("main thread get notification");
			System.out.println(t.total);
		}	

	}

}
//Note:whenever u r updating something then sleep method is not good to use.