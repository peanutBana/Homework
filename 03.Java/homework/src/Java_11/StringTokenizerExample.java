package Java_11;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		String[] arr = str.split(",");
		for(String item : arr) {
			System.out.println(item);
		}
		System.out.println(Math.round(5.7));
	}

}
