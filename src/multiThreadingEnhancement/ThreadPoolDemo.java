package multiThreadingEnhancement;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//Note:while developing web and application server,we can use thread pool concept.
public class ThreadPoolDemo implements Runnable {
	String name;

	ThreadPoolDemo(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name+"..job started by thread:"+ Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println(name+"...job complete by thread: "+ Thread.currentThread().getName());

	}
	public static void main(String[] args) {
		ThreadPoolDemo[] jobs= {new ThreadPoolDemo("rabin"),
								new ThreadPoolDemo("nabin"),
								new ThreadPoolDemo("sabin"),
								new ThreadPoolDemo("kabin"),
								new ThreadPoolDemo("jabin"),
								new ThreadPoolDemo("rabin")};
		//ExecutorService service=Executors.newFixedThreadPool(3);//3 thread  6 jobs
		ExecutorService service=Executors.newFixedThreadPool(4);//4 thread   6 jobs
		
		for(ThreadPoolDemo demo:jobs) {
			service.submit(demo);
		}
		service.shutdown();		
		
		
	}

}
