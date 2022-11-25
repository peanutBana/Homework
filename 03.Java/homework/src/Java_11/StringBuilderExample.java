package Java_11;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder str= new StringBuilder();
		for(int i=1 ; i<=100; i++) {
			str.append(i);
		}
		str.toString();
		
		System.out.println(str);
	}

}
