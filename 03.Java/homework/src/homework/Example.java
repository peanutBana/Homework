package homework;

public class Example {
	//20번
	public static boolean isNumber(String str) {
		
		if(str == null || str.equals("")) {
			return false;
		}
		for (int i=0 ; i<str.length() ; i++) {
			char ch = str.charAt(i);
			if(ch < 48 || ch > 57) {
				return false;
			}
		}
		return true; 
	}
	
	//21번
	public static int max(int [] arr) {
		if(arr == null || arr.length == 0) {
			return -999999;
		}
		
		int max = arr[0];
		for(int i : arr) {
			if(i > max) {
				max = i;
			}
		}
		return max;
	}
	
	
	
	public static void main(String[] args) {
		//20
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		//21번
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열
//
	}

}
