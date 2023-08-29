package staticPractise;
//in static the refrence varaible will take last one
public class Test {
	static int x=10;
	int y=20;

	public static void main(String[] args) {
		Test t=new Test();
		t.x=888;
		t.y=999;
		
		Test t1=new Test();
		System.out.println(t1.x+":"+t1.y);

	}

}
