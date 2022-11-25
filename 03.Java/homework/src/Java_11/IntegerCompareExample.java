package Java_11;

public class IntegerCompareExample {

	public static void main(String[] args) {
		Integer obj1 =100;
		Integer obj2 =100;
		Integer obj3 =300;
		Integer obj4 =300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
		
	//이유 Integer 클래스의 범위 -128 ~ 127을 벗어났기 때문에
		System.out.println(obj3.equals(obj4));
	}

}
