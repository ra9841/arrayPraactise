package synchronizedBlockPractise;

public class Display {
	//if we put synchronize method in wish then it cover whole method.so its better to declare synchronized for for loop
	public void wish(String name) {
		;;;;;;;;;;;//assume 1 lakh line of code
		
		//synchronized(this) {//lock of current object having only d
		synchronized(Display.class) {//class level lock having d &d1 object reference
		for(int i=0;i<10;i++) {
			System.out.println("Good Morning:"+ name);
			try {
				Thread.sleep(2000);//2 sec time
			}catch(InterruptedException e){
				System.out.println(name);
			}
		}
		}
		;;;;;;;;;;;;//assume 1 lakh line of code
		
	}
//synchronized(this):if you observe without and with this and run main method then you can see change.Its regular output
}
