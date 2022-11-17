package homework;
import java.util.Scanner;

public class Account {
	//22번
	private int balance;
	public int MAX_BALANCE = 1000000;
	public int MIN_BANANCE = 0;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if (balance < 0 || balance >1000000) {
			return;
		}
		else {
			this.balance = balance;
		}	}
	
	
	
	public static void main(String[] args) {
		
			//22번
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
