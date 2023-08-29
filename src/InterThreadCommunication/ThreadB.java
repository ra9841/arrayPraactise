package InterThreadCommunication;

public class ThreadB extends Thread{
	int total=0;
	
	public void run() {
		synchronized (this) {
			for(int i=0;i<=100;i++) {
				total=total+i;//updation
				
			}
			System.out.println("child thread trying to give notification");
			this.notify();//it is communicating with wait()
			
		}
	
	}
	

}
