package threadPractise;

public class ThreadPriority extends Thread{
	
	
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());//default priorty is 5
		
		Thread.currentThread().setPriority(9);//only from 1 to 10.if comment this line then it will take default one 5
		ThreadPriority tp=new ThreadPriority();
		System.out.println(tp.getPriority());
		
	}

}
