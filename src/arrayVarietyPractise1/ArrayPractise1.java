package arrayVarietyPractise1;

public class ArrayPractise1 {

	public static void main(String[] args) {
		Object[] a=new Object[5];
		a[0]=new Object();
		a[1]=new String("rabin");
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		Runnable[] r=new Runnable[10];
		r[0]=new Thread();
		//r[1]=new String("rabin");//error

	}

}
