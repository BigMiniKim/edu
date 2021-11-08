package java_List;

import java.util.ArrayList;
import java.util.Scanner;



class Circle {
	private double r;

	public Circle(double r) {
		this.r = r;
	}

	public double getArea() {
		return r * r * Math.PI;
	}
	
	public double getR() {
		return this.r;
	}
}

/*
5명의 별명을 입력 받아 ArrayList에 저장하고 이들 중 별명의 길이가
제일 긴 별명을 출력하시오. (단, 각 별명의 길이는 모두 다르게 입력한다.)
*/

class NickNameGame{
	public static final int COUNT = 5;
	ArrayList<String> nickName; 
	
	public NickNameGame() {
		nickName = new ArrayList<>();
	}
	
	public int getMaxName() {
		int index = 0;
		int max =0;
		
		String name = null;
		
		for ( String str : nickName) {
			
			if( max <= str.length()) {
				max = str.length();
				name = str;				
			}			
		}
		
		System.out.println("가장긴별명:" + name);
		
		
		return index;
		
	}
	
	public ArrayList<String> getNickName() {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1 ; i<= COUNT; i++) {
			System.out.println(i + "번째 사람의 별명을 입력하시오.");
			String name = sc.next();
			
			if(i>1) {
				for( int j = 0 ;j <i-1; j++) {
					if(nickName.get(j).length() ==name.length()) {
						System.out.println("별명의 길이는 같을 수 없습니다. 다시 입력하세요.");
						i--;
						continue;
					}
				}
			}				
			
			nickName.add(name);
		}
		
		
		return nickName;		
	}
	
	
	
	
}
public class CircleArrayListTest {
	public static void main(String[] args) {
		NickNameGame game = new NickNameGame();
		game.getNickName();
		game.getMaxName();
		

	}

}
