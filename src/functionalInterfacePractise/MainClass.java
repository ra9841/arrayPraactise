package functionalInterfacePractise;

public class MainClass {

	public static void main(String[] args) {
		PractiseParent pp=(x,y)->{
			int z=x+y;
			System.out.println("The sum of x and y:"+ z);
		};
		
		pp.running();
		pp.test(10,20);
		
		
	

	}

}
