package arrayVarietyPractise1;

public class ArrayPractise3 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int[] b= {7,8};
		a=b;// internal elements will not copy but just refrence variable is reassigned
		b=a;
		System.out.println(b.length);
		
		int[][] i=new int[3][];
		//i[0]=new int[4][3];//compile time error:when we r assigning one array to another array,dimension must match 
		//i[0]=10;//compile time error
		i[0]=new int[2];//when we r assigning one array to another array,dimension must match 
	}

}
