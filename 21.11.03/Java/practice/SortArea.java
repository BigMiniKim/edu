import java.util.Arrays;

/*
- 클래스 Person은 이름을 저장하는 필드 구성
- 클래스 Person은 상위 클래스 
-Object의 메소드 equals()를 오버라이딩하여 
-이름이 같으면 true를 반환하는 메소드 구현
- 다음과 같은 소스로 클래스 Person을 점검

Person p1 = new Person("홍길동");
System.out.println(p1.equals(new Person("홍길동")));
System.out.println(p1.equals(new Person("최명태")));

결과 
true
flase
*/
class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Person) {
			Person person = (Person) obj;

			if (this.name.equals(person.name)) {
				return true;
			}
		}

		return false;
	}

}

class Rectangle implements Comparable {
	private int width;
	private int heigth;

	public Rectangle(int width, int heigth) {
		this.width = width;
		this.heigth = heigth;
	}

	public int getArea() {
		return width * heigth;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(getArea());
	}

	@Override
	public int compareTo(Object o) {
		 return this.getArea() - ((Rectangle)o).getArea();
		//return ((Rectangle) o).getArea() - this.getArea();
	}
}

public class ObjTest {

	public static void main(String[] args) {

		Rectangle[] recArr = { new Rectangle(6, 6), new Rectangle(5, 5), new Rectangle(10, 10), new Rectangle(12, 12),
				new Rectangle(11, 11) };

		Arrays.sort(recArr);

		//System.out.println(Arrays.toString(recArr));

		for (Rectangle rec : recArr) {
			System.out.println(rec.getArea());
		}
	}

}
