package edu.komo.ex.main;

import edu.komo.ex.shape.Circle;
import edu.komo.ex.shape.Rectangle;
import edu.komo.ex.shape.Shape;
import edu.komo.ex.shape.Triangle;

/*
Point(3,50)
�ٸ���
*/

class MyPoint {
	private int x, y;

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {

		return "Point(" + x + "," + y + ")";
	}

	@Override
	public boolean equals(Object obj) {
		MyPoint point = (MyPoint) obj;

		if ((this.x == point.x) && (this.y == point.y))
			return true;

		return false;
	}

}

/*
 * �� a : Circle(2,3)������5 �� b : Circle(2,3)������30 ���� ��
 *
 */
class Circle3 {
	private int x, y, r;

	public Circle3(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	@Override
	public String toString() {		
		return "Circle(" + x + "," + y +") ������"+ r +"�� ��";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		
		if( obj instanceof Circle3){
			
			Circle3 circle = (Circle3)obj;
			
			if( (this.x == circle.x)  && (this.y == circle.y)  )
				return true;
		}
		
		return false;
	}
}

public class PolyTest {

	public static void main(String[] args) {
		Circle3 a = new Circle3(2, 3, 5); // �߽� (2, 3)�� ������ 5�� ��
		Circle3 b = new Circle3(2, 3, 30); // �߽� (2, 3)�� ������ 30�� ��

		System.out.println("�� a : " + a);
		System.out.println("�� b : " + b);

		if (a.equals(b))
			System.out.println("���� ��");
		else
			System.out.println("���� �ٸ� ��");

	}

}
