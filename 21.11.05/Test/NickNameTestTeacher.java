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
5���� ������ �Է� �޾� ArrayList�� �����ϰ� �̵� �� ������ ���̰�
���� �� ������ ����Ͻÿ�. (��, �� ������ ���̴� ��� �ٸ��� �Է��Ѵ�.)
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
		
		System.out.println("����亰��:" + name);
		
		
		return index;
		
	}
	
	public ArrayList<String> getNickName() {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1 ; i<= COUNT; i++) {
			System.out.println(i + "��° ����� ������ �Է��Ͻÿ�.");
			String name = sc.next();
			
			if(i>1) {
				for( int j = 0 ;j <i-1; j++) {
					if(nickName.get(j).length() ==name.length()) {
						System.out.println("������ ���̴� ���� �� �����ϴ�. �ٽ� �Է��ϼ���.");
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
