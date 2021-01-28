package account;

public class Account {

	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {
		
	}

	public Account(String account, int balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		//계좌 정보를 셋팅
		this.account = account;
	}

	public int getBalance() {
		//계좌 정보를 리턴
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		//잔액 정보를 리턴
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double calculateInterest() {
		//현재 잔액을 기준으로 이자를 계산한다.
		return balance * interestRate / 100;
	}
	
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	public void accountInfo() {
		System.out.println("계좌번호: " + account 
				+ " 잔액: " + balance + "원"
				+ " 이자율: " + interestRate + "%");
	}
	
	public void accountInfo2() {
		System.out.println("계좌번호: " + account 
				+ " 잔액: " + balance + "원"
				+ " 이자율: " + interestRate + "%"
				+ " 이자: " + (int)calculateInterest() + "원");
	}
}
