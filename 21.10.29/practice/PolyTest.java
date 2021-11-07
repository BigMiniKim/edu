package edu.komo.ex.main;

import edu.komo.ex.shape.Circle;
import edu.komo.ex.shape.Rectangle;
import edu.komo.ex.shape.Shape;
import edu.komo.ex.shape.Triangle;

/*
Point(3,50)
다른점
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
 * 원 a : Circle(2,3)반지름5 원 b : Circle(2,3)반지름30 같은 원
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
		return "Circle(" + x + "," + y +") 반지름"+ r +"인 원";
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
		Circle3 a = new Circle3(2, 3, 5); // 중심 (2, 3)에 반지름 5인 원
		Circle3 b = new Circle3(2, 3, 30); // 중심 (2, 3)에 반지름 30인 원

		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);

		if (a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("서로 다른 원");

	}

}
