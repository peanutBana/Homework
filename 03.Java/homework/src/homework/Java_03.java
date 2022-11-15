package homework;

public class Java_03 {

	public static void main(String[] args) {
		
		/*
		 01. 다음 코드를 실행했을 때 출력 결과를 예상하고 작성해보시오. 
		 	int x = 10; 
			int y = 20; 
			int z = (++x) + (y--); 
			System.out.println(z);
			 => 31
		 */
		
		/*
		 02. 다음 코드를 실행했을 때 출력 결과를 예상하고 작성해보시오.
		 	int score = 85; 
			String result = (!(score>90))? "가":"나"; 
			System.out.println(result);
 			=> 가 
		 */
		
		
		 //03. 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때 1인당 몇 개를 가질 수 있고, 마지막에 몇 개가 남는지를 구하는 코드입니다. ( )에 들어갈 알맞은 코드를 차례대로 작성해보세요.
		
		int pencils = 534; 
		int students = 30; //학생 한 명이 가지는 연필 수 
		int pencilsPerStudent = ( pencils / students ); 
		System.out.println(pencilsPerStudent); //남은 연필 수
		int pencilsLeft = ( pencils % students ); 
		System.out.println(pencilsLeft);
		
		//04. 다음은 십의 자리 이하를 버리는 코드입니다. 변수 value의 값이 356이라면 300이 나올 수 있도록 ( )에 알맞은 코드를 작성하세요(산술 연산자만 사용).
		
		int value = 356; 
		System.out.println( value - (value%100) );
		
		/*
		 05. 다음 코드는 사다리꼴의 넓이를 구하는 코드입니다. 정확히 소수 자릿수가 나올 수 있도록 ( )에 들어갈 수 있는 코드를 모두 선택하세요.  
		 	➊ (lengthTop+lengthBottom) * height / 2.0 
			➋ (lengthTop+lengthBottom) * height * 1.0 / 2 
			➌ (double)(lengthTop+lengthBottom) * height / 2 
			➍ (double)( (lengthTop+lengthBottom) * height / 2)
			
			정답 : 1,2,3
		 */
		
		/*
		 06. 다음 코드는 비교 연산자와 논리 연산자의 복합 연산식입니다. 연산식의 출력 결과를 작성해보세요.
			int x = 10; 
			int y = 5; 
			System.out.println( (x>7) && (y<= 5) ); 
			System.out.println( (x%3 = = 2) || (y%2 != 1) );
			
			==> true / false
		 */
		
		
		//07. 다음은 % 연산을 수행한 결과값에 10을 더하는 코드입니다. NaN 값을 검사해서 올바른 결과가 출력될 수 있도록 ( )에 들어갈 코드를 작성해보세요.
		double x = 5.0;
		double y = 0.0;
		double z = 5 % y;
		
		if ( Double.isNaN(z) ) {
		    System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
		    double result = z + 10;
		    System.out.println("결과: " + result);
		}

		
		/*
		 08. 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 만일
			 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니
			 가 필요할 것이다. ( )에 알맞은 코드를 넣으시오.
		 */
		 int numOfApples = 123; // 사과의 개수
	     int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
	     int numOfBucket = (    ( numOfApples % sizeOfBucket == 0) ?  numOfApples / sizeOfBucket : ( numOfApples / sizeOfBucket) +1);
	     System.out.println("필요한 바구니의 수 :"+numOfBucket);
	     
	     
	     //09. 아래는 변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다. 삼항 연산자를 이용해서  알맞은 코드를 작성하시오
	     //정답 : (num > 0) ? “양수” : (num == 0) ? 0 : “음수”
	     
	     //10. 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의
		 //값이 333이라면 331이 되고, 777이라면 771이 된다. ( )에 알맞은 코드를 넣으시오.
	     int num = 333;
         System.out.println( num - (num%10) + 1 );

         /*
           11.아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 변환공식이 'C =
			  5/9 ×(F - 32)'라고 할 때, ( )에 알맞은 코드를 넣으시오. 단, `
			  셋째자리에서 반올림해야한다.(Math.round()를 사용하지 않고 처리할 것)
          */
         int fahrenheit = 100;
         float celcius = (int)((5/9f * (fahrenheit- 32)) * 100 + 0.5) / 100f;;
         System.out.println("Fahrenheit:"+fahrenheit);
         System.out.println("Celcius:"+celcius);

         //12. 아래 코드의 문제점을 수정 후 실행 결과를 얻도록 하시오.
         byte a = 10;
         byte b = 20;
         //byte c = a + b;

         char ch = 'A';
         //ch = ch + 2;
         float f = 3 / 2;
         long l = 3000 * 3000 * 3000;
         float f2 = 0.1f;

         double d = 0.1;
         boolean result = d==f2;

         //System.out.println("c="+c);
         System.out.println("ch="+ch);
         System.out.println("f="+f);
         System.out.println("l="+l);
         System.out.println("result="+result);

         /*
          실행결과
          c=30
          ch=C
          f=1.5
          l=27000000000
          result=true
          */
         
         //13. 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b의 값이 true가 되도록 하는 코드이다. ( )에 알맞은 코드를 넣으시오.
         //char ch = 'z';
         //boolean b =  (ch);
         //System.out.println(b);
         
         //14. 

	}

}
