package practise1;

public class ArrayPractise2 {
	public static void main(String[] args) {
		int[] x= {10,20,30,40};
		char[] ch= {'a','b','c','d'};
		int[] i=x;
		//int[] c=ch;//complie time error //element level promotion is not applicable in array level
		char[] b=ch;
		System.out.println(x[0]);
		System.out.println(ch[2]);
		
		
		String[] s= {"rabin","sita","hem","sharmila"};
		Object[] o=s;//child type array can be promoted to parent type array
		System.out.println(o[2]);
		
	}

}
