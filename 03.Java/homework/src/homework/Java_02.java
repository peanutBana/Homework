package homework;

public class Java_02 {

	public static void main(String[] args) {
		//01
		/*
		 1byte : boolean, byte
		 2byte : char, short
		 4byte : int, float
		 8byte : long, double  
		 */
		
		//02
		// byte < short , char < int < long < float < double
		
		//03
		// 12, 131, 51, 99, Java
		
		//04
		// 정답 : 3번 => short shortVlaue = charValue; (2byte=> 2byte)
		
		//05
		//정답 : 4번 =>  char var = (char) strValue;
		//String은 클래스이고 char는 2byte로 정수로 이루어진 기본형타입 중에 하나이다.
		
		//06
		//정답 : 1번 => byte result = byteValue + byteValue;
		//둘다 int형으로 변환되어 더해진다.
		
		//07
		//String str = "5";
		//정답 : 2 => int var2 = int.parseInt(str);
		//integer.parseInt()
		
		//08
		//13, 16번 라인
		
		//09
		/*
		 int a = 20;
         double num = 1.2;
         char ch = ‘a’;
		 */
		//리터럴 : 20, 1.2, 0 / 변수 : a, num, ch / 키워드 : int, double, char
		
		//10
		/*
		 1. byte b = 256; // byte (-128~127) . 의 범위 를 넘는 값으로 초기화 할 수 없음
		 2. char c = '';      // char는 반드시 한 개의 문자를 지정해야함
         3.char answer = 'no';  // char . 에 두 개의 문자를 저장할 수 없음
		 */
		
		//11
		/*
			byte b = 10; 
			char ch = 'A';
			int i = 100; 
			long l = 1000L;
		 */
		//정답 : 4 => i = (int)ch;  (2byte => 4byte 이므로 가능)
		System.out.println("연습문제 02");
	}
}
