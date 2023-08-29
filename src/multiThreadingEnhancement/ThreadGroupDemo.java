package multiThreadingEnhancement;
//every thread in java belongs to some group.Main thread belongs to main group.
//every threadgroup in java is child group of system group,either directly or indirectly.hence system group is root of all thread group.
public class ThreadGroupDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());//main
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());//system
		
		
		ThreadGroup g=new ThreadGroup("first group");
		System.out.println(g.getParent().getName());//main
		
		ThreadGroup g1=new ThreadGroup(g,"second group");
		System.out.println(g1.getParent().getName());//first group
		
	//##########################################
		
		Thread t=new Thread(g,"first thread");
		Thread t1=new Thread(g,"second thread");
		g.setMaxPriority(3);
		Thread t3=new Thread(g,"third thread");
		System.out.println(t.getPriority());//5
		System.out.println(t1.getPriority());//5
		System.out.println(t3.getPriority());//3
		
		
		
		
	}

}
