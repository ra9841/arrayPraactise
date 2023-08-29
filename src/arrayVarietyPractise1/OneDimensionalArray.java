package arrayVarietyPractise1;

public class OneDimensionalArray {

	public static void main(String[] args) {
	int[] x=new int[4];
	x[0]=10;
	x[1]=20;
	x[2]=30;
	x[3]=10;
	//x[4]=40;//ArrayIndexOutOfBoundsException
	System.out.println(x);//[I@75a1cd57
	System.out.println(x[0]);//0
		
	int[] x1=new int['a'];
	System.out.println(x1);
	
	short s=30;
	int[] n=new int[s];
	System.out.println(n);
	
	byte b=20;
	int[] n1=new int[b];
	System.out.println(n1);
	
	//long l=200;
	//int[] n2=new int[l];//this is compile time error
	//System.out.println(n2);

	}

}
