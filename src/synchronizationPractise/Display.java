package synchronizationPractise;

public class Display {
	//public synchronized void wish(String name) {
	public static synchronized void wish(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.print("Good Morning :");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

			}
			System.out.println(name);
		}
	}

	//conclusion:if multiple thread are operating on same java object then synchronization is required.
	//if multiple thread are operating on multiple java object,then synchronization is not required
	//if wish method is static synchronized, then there will be regular output.whaterver thread or java object(class level lock)

}
