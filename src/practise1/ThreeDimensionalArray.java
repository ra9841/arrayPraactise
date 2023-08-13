package practise1;
//draw diagram it will be easy.
public class ThreeDimensionalArray {

	public static void main(String[] args) {
		//int[][] x= {{10,20},{30,40,50}};
		int[][][] y= {{{10,20,30},{40,50,60}},{{70,80,90},{100,110,120}}};
		
		System.out.println(y[0][1][2]);//60  --x box--0 index box--1 index box--2 index
		System.out.println(y[1][0][1]);//80
		//System.out.println(y[2][0][0]);//ArrayIndexOutOfBoundsException
		//System.out.println(y[1][2][0]);//ArrayIndexOutOfBoundsException
		System.out.println(y[1][1][1]);//110
		//System.out.println(y[2][1][0]);//ArrayIndexOutOfBoundsException
		

	}

}
