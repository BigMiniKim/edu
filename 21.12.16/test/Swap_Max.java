public class Intab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int temp;
		System.out.println(a + ":" + b);
		temp = a;//temp = 10 스왑
		a = b; //a = 20
		b = temp; // b=10
		System.out.println(a + ":" + b);
		
		
		int [] arr = {10, 9 , 5, 23 ,3, 200 ,80};
		
		//int max = Integer.MIN_VALUE;
		
		int max = arr[0];
		
		for(int i : arr ) {
			if( max < i) {
				max = i;
			}
		}

		System.out.println(max);
	}
	
}
