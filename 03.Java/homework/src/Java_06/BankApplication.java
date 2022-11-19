package Java_06;

import java.util.Scanner;
import java.util.ArrayList;


public class BankApplication {
	static String[] Account = new String[100];
	static ArrayList<Account2> AccList = new ArrayList<Account2>();
	static Scanner sc = new Scanner(System.in);
	static boolean status = true;

	
	public static void main(String[] args) {
		while(status) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 > "); int choice = sc.nextInt() ;
			switch(choice) {
			case 1: 
				createAccount();
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			case 2:
				 accountList();
				 break;
			case 3: 
				deposit();
				break;
			case 4:
				withDraw();
				break;
			case 5:
				System.out.println("프로그램 종료");
				status = false;
			}
		}
	}


	static void createAccount(){
		System.out.println("-------");
		System.out.println("계좌생성");
		System.out.println("-------");
		System.out.print("계좌번호 : "); String acc = sc.next();
		System.out.print("계좌주 : "); String name = sc.next();
		System.out.print("초기입금액 : "); int deposit = sc.nextInt();
		System.out.println();
		
		AccList.add(new Account2(acc, name, deposit));
	}
	
	static void accountList() {
		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");
		System.out.println();
	
		for(Account2 i : AccList) {
			System.out.println(i.getAcc() + "  " + i.getName() + "  " + i.getDeposit());
		}
	};
	
	static void deposit() {
		System.out.println("-------");
		System.out.println("예금");
		System.out.println("-------");	
		System.out.print("계좌번호 : "); String acc = sc.next();
		System.out.print("예금액 : "); int deposit = sc.nextInt();
		
		Account2 findAccResult = findAcc(acc);
		int accDeposit = findAccResult.getDeposit();
		findAccResult.setDeposit(accDeposit + deposit);
	};
	
	static void withDraw() {
		System.out.println("-------");
		System.out.println("출금");
		System.out.println("-------");	
		System.out.print("계좌번호 : "); String acc = sc.next();
		System.out.print("출금액 : "); int withdraw = sc.nextInt();
		
		Account2 findAccResult = findAcc(acc);
		int accDeposit = findAccResult.getDeposit();
		findAccResult.setDeposit(accDeposit - withdraw);
	};
	
	static Account2 findAcc(String acc) {
		Account2 findAcc = null;
		for(Account2 i : AccList){
			if(i.getAcc().equals(acc)) {
				findAcc = i;
			}		
		}
		return findAcc;
	}
}
