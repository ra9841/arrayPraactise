package aopPractise;
//its not full project/uncomplete AOP
public class Bank {
	private int amount = 5000;
	private String accountNumb = "510646";

	public int deposit(int amount, String accountNumb) {
		if (accountNumb.equals(this.accountNumb)) {
			this.amount = this.amount + amount;
			return this.amount;
		} else {
			throw new AcnoNotFoundException();
		}

	}

}
