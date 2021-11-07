
/*
Fruit fAry[] = {new Grape(), new Apple(), new Pear()};
for(Fruit f : fAry)
f.print();

- 결과
나는 포도이다.
나는 사과이다.
나는 배이다.
*/
/*
interface Fruit{
	public abstract void print();
}
*/

abstract class Fruit{
	public abstract void print();
	
	public void print2() {
		System.out.println("일반 함수도 들어간다 메롱~~");
	} 
	
}

class Grape extends Fruit{

	@Override
	public void print() {
		System.out.println("나는 포도이다.");		
	}
	
}

class Apple extends Fruit{

	@Override
	public void print() {
		System.out.println("나는 사과이다.");		
	}
	
}

class Pear extends Fruit{

	@Override
	public void print() {
		System.out.println("나는 배이다.");		
	}
	
}

public class Hello {

	public static void main(String[] args) {
		Fruit[] fAry = {new Grape(), new Apple(), new Pear()};
		
		for(Fruit f : fAry)
			f.print();


	}

}
