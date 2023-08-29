package staticPractise;

public class Test1 {
	int x=10;
	static int y=20;
	
	public void m1() {
		System.out.println(x);
		System.out.println(y);
	}
	

	public static void main(String[] args) {
		//System.out.println(x);//instance variable we cannot acccess directly from static area
		System.out.println(y);//static variable we can acccess directly from any point

	}

}
