/* 선언 : 정수를 10개 저장하는 배열을 만들고
 *  1에서 10까지 범위의 정수를
랜덤하게 생성하여 배열에 저장하라. 
그리고 배열에 든 숫자들과 평균을 출력하라.

랜덤한 정수들 : 3 6 3 6 1 3 8 9 6 9
평균은 5.4
*/
class ArrAvg{
	private int[] arr = new int[10];
	private int num;
	
	public int[] getArr() {
		return arr;
	}
	
	public int getNum() {
		return num;
	}

	public ArrAvg() {
		
		for(int i =0; i < arr.length;i++) {
			arr[i] = (int)(Math.random()*10 +1); 
		}
		
	}
	
	public void resultPrint() {
		double avg = 0;
		double sum = 0;
		
		for (int i : arr) {
			//랜덤한 정수들 : 3 6 3 6 1 3 8 9 6 9
			sum = sum + i;
			System.out.println(i);			
		}
		
		avg = sum / arr.length;		
		System.out.println("평균은" + avg);
	}
	
	public static int getArrSum(int[] arr) {
    	int sum = 0;
		
    	for (int i : arr) {
			//랜덤한 정수들 : 3 6 3 6 1 3 8 9 6 9
			sum = sum + i;
			System.out.println(i);			
		}
    	return sum;  	
    	
    }
}

class Rectangle5{
	
	private int width;
	private int height;
	
	public Rectangle5(int width,int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width * height;
	}
	
	public static int getArrRec(Rectangle5[] rec) {
		 int sum =0;
		 for ( Rectangle5 rectangle : rec) {
			sum += rectangle.getArea();
		}
		 return sum;
	}
	
}
  
class ClassVar {
	
	public static int getArrSum(int[] arr) {
    	int sum = 0;
		
    	for (int i : arr) {
			//랜덤한 정수들 : 3 6 3 6 1 3 8 9 6 9
			sum = sum + i;
			System.out.println(i);			
		}
    	return sum;  	
    	
    }
	public static int getArrRec(Rectangle5[] rec) {
		 int sum =0;
		 for ( Rectangle5 rectangle : rec) {
			sum += rectangle.getArea();
		}
		 return sum;
	}
    public static void main(String[] args) {
    	
    	Rectangle5[] rec = new Rectangle5[2];
    	
    	rec[0] = new Rectangle5(100, 200);
    	rec[1] = new Rectangle5(10, 20);
    	
    	int area = getArrRec(rec);
    	System.out.println("합계 넓이는 "+area);
    	System.out.println("합계 넓이는 "+Rectangle5.getArrRec(rec));
    	
    	//ArrAvg arrAvg = new ArrAvg();
    	//arrAvg.resultPrint();
    	
    	//private int[] arr = new int[10];
    	//System.out.println("합계는"+ getArrSum(arrAvg.getArr()));
    	
    	//System.out.println("합계는"+ ArrAvg.getArrSum(arrAvg.getArr()));
    	
    }
}