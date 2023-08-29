package multiThreadingEnhancement;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
//implements Callable incase of Runnable &  Future in for loop
public class ThreadPoolDemo2 implements Callable{
	int num;
	ThreadPoolDemo2(int num){
		this.num=num;
	}

	@Override
	public Object call() throws Exception {
		System.out.println(Thread.currentThread().getName()+"is...responsible to find sum of first:"+num+"numbers");
		int sum=0;
		for(int i=0;i<=num;i++) {
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ThreadPoolDemo2[] job = {new ThreadPoolDemo2(10),
								new ThreadPoolDemo2(20),
								new ThreadPoolDemo2(30),
								new ThreadPoolDemo2(40),
								new ThreadPoolDemo2(50),
								new ThreadPoolDemo2(60),
								new ThreadPoolDemo2(70)};
		//ExecutorService service=Executors.newFixedThreadPool(3);//3 thread  6 jobs
		ExecutorService service=Executors.newFixedThreadPool(4);//4 thread   6 jobs
				
				for(ThreadPoolDemo2 demo:job) {
					Future f=service.submit(demo);
					System.out.println(f.get());
				}
				service.shutdown();		
				
				
		
	}

}
