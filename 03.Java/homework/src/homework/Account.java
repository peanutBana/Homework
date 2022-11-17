package homework;
import java.util.Scanner;

public class Account {
	//22번
//	private int balance;
//	public int MAX_BALANCE = 1000000;
//	public int MIN_BANANCE = 0;
//	
//	public int getBalance() {
//		return balance;
//	}
//	
//	public void setBalance(int balance) {
//		if (balance < 0 || balance >1000000) {
//			return;
//		}
//		else {
//			this.balance = balance;
//		}
//	}
	public class BankApplication{
		String[] Account = new String[100];
		
	}
	
	//23번
	//계좌 생성
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		String acc = sc.nextLine();
		int choice = 0;
		
		while(choice == 5) {
			System.out.println("----------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------");
			System.out.println("선택 > ");
			choice = sc.nextInt() ;
		}
			//22번
		//	Account account = new Account();
		//	
		//	account.setBalance(10000);
		//	System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000
		//	
		//	account.setBalance(-100);
		//	System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000
		//	
		//	account.setBalance(2000000);
		//	System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000
		//	
		//	account.setBalance(300000);
		//	System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 300000
		
	}

}
