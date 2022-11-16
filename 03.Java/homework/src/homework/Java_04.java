package homework;

public class Java_04 {

	public static void main(String[] args) {
		/*01
		1.if(ix >10 && x <20 )
		2.if(ch != ‘’ || ch != ‘\t’)
		3.if(ch ==’c’ || ch == ‘C’)
		4.if(‘0’< = ch && ch <= ‘9’)
		5.if((‘a’ <= ch && ch <= ‘z’) || (‘A’ <= ch && ch <= ‘Z’))
		6.if(year % 400 == 0 || year % 4 == 0 && year %100 != 0)
		7.boolean powerOn == true;
			if(!powerOn)
		8.if(str.equals(‘yes’))
		*/
		
		//02
		int sum1 = 0;
		for(int i=1 ; i<=100 ; i++ ){
			if(i % 3 == 0){
				sum1+=i;
			}
		}
		System.out.println(sum1);
		
		//03
		int sum2 = 0;
		for(int i=1 ; i<=20 ; i++ ){
			if(i % 3 != 0 && i%2 !=0){
				sum2+=i;
			}
		}
		System.out.println(sum2);

		//04
		int n1  ;
		int n2  ;
		
		while(true) {
		    n1 = (int)(Math.random()*6) + 1;	
		    n2 = (int)(Math.random()*6) + 1;
			
		    if(n1+n2 == 5) {
		    	break;
		    }
			System.out.println("두 눈은 " + '('+n1+','+n2+')');
		}
		System.out.println(n1 + "과" + n2 + "의 합은 5");
	
	
		//05
		for(int i=1 ; i<=10 ; i++) {
			for(int j=1 ; j<=10 ; j++) {
				if(i*4 + j*5 == 60) {
					System.out.println("("+i+","+j+")");
				}
			}
		}
	
	
		//06

		//07
		for(int i=1 ; i<=6 ; i++) {
			 for(int j=1 ; j<=6 ; j++) {
				 if(i+j == 6) {
					 System.out.println("(" + i + "," + j + ")");
				 }
			 }
		 }
	}
}
