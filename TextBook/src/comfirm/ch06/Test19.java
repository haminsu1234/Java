package comfirm.ch06;

class Account {
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;

	private int balance;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance<Account.MIN_BALANCE && balance>Account.MAX_BALANCE) {
			return;
		}
		this.balance = balance;
	}
}


public class Test19  {

	public static void main(String[] args) {
	
		Account account = new Account();
		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000
		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000
		account.setBalance(2000000);
		System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000
		account.setBalance(300000);
		System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 300000
		
		
		
	}
	
}
