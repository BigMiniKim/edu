
/*
Fruit fAry[] = {new Grape(), new Apple(), new Pear()};
for(Fruit f : fAry)
f.print();

- ���
���� �����̴�.
���� ����̴�.
���� ���̴�.
*/
/*
interface Fruit{
	public abstract void print();
}
*/

abstract class Fruit{
	public abstract void print();
	
	public void print2() {
		System.out.println("�Ϲ� �Լ��� ���� �޷�~~");
	} 
	
}

class Grape extends Fruit{

	@Override
	public void print() {
		System.out.println("���� �����̴�.");		
	}
	
}

class Apple extends Fruit{

	@Override
	public void print() {
		System.out.println("���� ����̴�.");		
	}
	
}

class Pear extends Fruit{

	@Override
	public void print() {
		System.out.println("���� ���̴�.");		
	}
	
}

public class Hello {

	public static void main(String[] args) {
		Fruit[] fAry = {new Grape(), new Apple(), new Pear()};
		
		for(Fruit f : fAry)
			f.print();


	}

}
