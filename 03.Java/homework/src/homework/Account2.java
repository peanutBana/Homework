package homework;

import java.util.Scanner;

public class Account2 {
	public class BankApplication{
		String[] Account = new String[100];
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		String acc = sc.nextLine();
		int choice = sc.nextInt() ;

		
		while(choice == 5) {
			System.out.println("----------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------");
			System.out.println("선택 > ");
			
		}
	}

}
