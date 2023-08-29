package functionalInterfacePractise;
@FunctionalInterface //rule for functional interface is only one abstract method
public interface PractiseParent {
	
	default void running() {
		System.out.println("running");
	}
	
	void test(int x,int y);
	
	//void test1();//rule for functional interface is only one abstract method

}
