package java_10;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white","12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			login("blue","54321");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void login(String id, String pwd) throws NotExistIDExeption{
		if(!id.equals("blue")) {
			System.out.println("아이디가 존재하지 않습니다.");
		}
		if(!pwd.equals("12345")) {
			System.out.println("패스워드가 틀립니다.");
		}
	}
	
}
