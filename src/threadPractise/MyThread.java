 package threadPractise;//Thread Scheduler:multiple thread are waiting to get the chance of execution then in which order
//-thread will be execected is decide by thread scheduler.different jvm by jvm.there is no gurantee for exact output,
//-but we can provide several possible outputs

//define a thread
public class MyThread extends Thread {

	public void run() {
		//job of thread
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread");//executed by child thread

		}

	}
  //every java program has one main thread(by default) i.e, main method
	public static void main(String[] args) {//main thread create child thread object.main thread start child thread
		MyThread mt = new MyThread();//Thread instantation
		mt.start();//starting of thread.After this there are two thread. main and child.New thread is created
		
		//mt.run();//if we replace start with run then there will be only one thread i.e,main thread.No change in output.No new thread is crerated.
		//in case of run method this total output is created by main thread
		
		for(int i=0;i<5;i++) {
			System.out.println("main thread");//execute by main thread
		}
	}

}//if you run more than one time then output will change different on different
