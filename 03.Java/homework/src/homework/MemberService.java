package homework;
//15
public class MemberService {
	
	boolean login(String id, String password) {
		
		if(id.equals("hong")&&password.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다");
	}
}
