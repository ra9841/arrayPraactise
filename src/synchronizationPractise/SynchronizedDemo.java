package synchronizationPractise;

//at a time only one thread is allowed to operate .If multiple number of thread try to operate symultaneously 
//-then synchronized is required
public class SynchronizedDemo {
	public static void main(String[] args) {
		Display d=new Display();
		MyThread t1=new MyThread(d,"rabin");//one thread
		MyThread t2=new MyThread(d,"bijeta");//two thread
		MyThread t3=new MyThread(d,"nabin");//three thread
		MyThread t4=new MyThread(d,"sabin");//four thread        //this is number of thread
	
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		//even though wish method is synchronized, we will get irregular output.Because thread are operating on different java 
		//-object
		Display d2=new Display();//in this case we will get irregular output
		MyThread t5=new MyThread(d2,"kabin");
		MyThread t6=new MyThread(d2,"jabin");
		t5.start();
		t6.start();
		//conclusion:if multiple thread are operating on same java object then synchronization is required.
		//if multiple thread are operating on multiple java object,then synchronization is not required
		//if wish method is static synchronized, then there will be regular output.whaterver thread or java object
	}

}
//the output will be mixmatch.not in regular output.so to make its in regular output make wish method synchronize 
//the output format will change diferrent on run on and on

//when we make wish method as synchronized,then only one threaad at a time is executed at given dipaly object.Hence we will get
//-regular output