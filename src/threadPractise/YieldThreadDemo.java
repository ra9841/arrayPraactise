package threadPractise;
//yield method:give chance for high priority waiting thread
public class YieldThreadDemo extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread");
			Thread.yield();//if we comment this line then we cannot except which output will come.it will done by thread scheduler.
			//if we r not commenting then child thread always call yield method because main thread will get chance more 
			//-number of times under the chance of completing main thread first is high.
			
		}
	}

	public static void main(String[] args) {//first main thread get priority then child thread will get chance
		YieldThreadDemo yt = new YieldThreadDemo();
		yt.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}
		//if we run on and on then sometime  child thread(yield method) get chance at middle of main thread.
		//some operating system may not provide support for yield method.
	}

}
