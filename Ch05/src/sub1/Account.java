package sub1;

public class Account {

	//속성
	public String bank;
	public String id;
	public String name;
	public int balance;

	//기능
	public void depoist(int money) { // this = 지역/전역변수명이 같을때 지정해줌
		this.balance += money;
	}
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	public void show() {
		System.out.println("----------");
		System.out.println("은행명 : "+this.bank);
		System.out.println("계좌번호 : "+this.id);
		System.out.println("입금주 : "+this.name);
		System.out.println("현재잔액 : "+this.balance);
		System.out.println("----------");
	}
}
