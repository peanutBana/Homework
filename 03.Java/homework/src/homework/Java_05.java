package homework;

public class Java_05 {

	public static void main(String[] args) {
		//07
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		System.out.println(sum);
			
		//08
		int[] array = { 1, 5, 3, 8, 2 };
	 	 int bigInt = 0;
		for(int i : array){
			if( i > bigInt){
				bigInt = i;
			}
		}
		System.out.println(bigInt);
		
		//09
//		int[][] array9 = {
//			      {95, 86},
//			      {83, 92, 96},
//			      {78, 83, 93, 87, 88}
//			};
//			int sum9 = 0;
//			int cnt = 0;
//					
//			for(int i=0 ; i<array.length ; i++) {
//				for(int j=0 ; j<array9[i].length ; j++) {
//					sum9+=array9[i][j];
//					cnt+=1;
//				}				
//			}		
//			System.out.println("전체 합은 : "+sum9);
//			System.out.println("평균은 : "+(float)sum9/cnt);


		

		

	}

}
