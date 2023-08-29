package arrayVarietyPractise1;
//just for one time use/for instance usage
public class AnnanyomousArray {
	
	public static void sum(int[] x) {
		int total=0;
		for(int x1:x){
			total=total +x1;
		}
		System.out.println("The Sum: " + total);
	}

	public static void main(String[] args) {
		//AnnanyomousArray aa=new AnnanyomousArray();
		//aa.sum(new int[] {10,20,30});
		
		sum(new int[] {10,20,30});//Annanyomous Array:new int[] {10,20,30}

	}

}
