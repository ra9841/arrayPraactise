package arrayVarietyPractise1;

public class LengthVsLenghtMethod {

	public static void main(String[] args) {
		int[] x=new int[4];
		System.out.println(x.length);//4, length variable represents size of array.it is final variable
		//System.out.println(x.length());//compile time error
		
		String s="rabin";
		System.out.println(s.length());//5, length method represents number of character String.it is final method
		//System.out.println(s.length);//compile time error
		
		String[] s1= {"rabin","prakash","hari"};//String array
		System.out.println(s1.length);
		System.out.println(s1[0].length());//rabin--5
		System.out.println(s1[1].length());//prakash--7
		
		int[][] y=new int[6][3];
		System.out.println(y.length);//6---in multi dimensional array,length variable represents only base size not total size
		System.out.println(y[0].length);//3
		//there is no way of finding total length of multi-dimenational array but indirectly we can as follow:
		System.out.println(y[0].length + y[1].length+y[2].length+y[3].length);
		

	}

}
