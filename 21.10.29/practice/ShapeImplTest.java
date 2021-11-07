package edu.kosmo.ex.main;

interface Shape {
	final double PI = 3.14; // ���
	abstract void draw(); // ������ �׸��� �߻� �޼ҵ�
	abstract double getArea(); // ������ ������ �����ϴ� �߻� �޼ҵ�

	default public void redraw() { // ����Ʈ �޼ҵ�
		System.out.print("--- �ٽ� �׸��ϴ�.");
		draw();
	}
}

class Circle implements Shape {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("�������� " + radius + "�� ���Դϴ�.");
	}
	@Override
	public double getArea() {
		return PI * radius * radius;
	}
}

class Oval implements Shape {
	private int a, b;

	public Oval(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void draw() {
		System.out.println(a + "x" + b + "�� �����ϴ� Ÿ���Դϴ�.");
	}

	public double getArea() {
		return PI * a * b;
	}
}

class Rect implements Shape {
	private int a, b;

	public Rect(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void draw() {
		System.out.println(a + "x" + b + "ũ���� �簢�� �Դϴ�.");
	}

	public double getArea() {
		return a * b;
	}
}

public class ShapeImplTest {

	public static void main(String[] args) {
		Shape[] list = new Shape[3]; // Shape�� ��ӹ��� Ŭ���� ��ü�� ���۷��� �迭
		
		list[0] = new Circle(10); // �������� 10�� �� ��ü
		list[1] = new Oval(20, 30); // 20x30 �簢���� �����ϴ� Ÿ��
		list[2] = new Rect(10, 40); // 10x40 ũ���� �簢��
		
		for (int i = 0; i < list.length; i++)
			list[i].redraw();
		
		for (int i = 0; i < list.length; i++)
			System.out.println("������ " + list[i].getArea());
	}

}
