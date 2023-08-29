package synchronizedBlockPractise;

public class SynchronizedDemo {

	public static void main(String[] args) {
		Display d=new Display();
		Display d2=new Display();
		MyThread t1=new MyThread(d,"rabin");
		MyThread t2=new MyThread(d2,"rahul");
		t1.start();
		t2.start();
		

	}

}
//lock concept is applicable only for class and object types but not for primitive,hence we can pass primitive 
//type as argument to sychnorized block other wise we will get compie time error.eg:int x=10;  synchronized(x){}