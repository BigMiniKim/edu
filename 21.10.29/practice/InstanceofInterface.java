interface Printable {
	void printLine(String str);
}

class SimplePrinter implements Printable {
	public void printLine(String str) {
		System.out.println(str);
	}
}

class MultiPrinter extends SimplePrinter {
	public void printLine(String str) {
		super.printLine("start of multi...");
		super.printLine(str);
		super.printLine("end of multi");
	}
}

interface Sea {
}

interface Ground {
}

interface Locable {
	void printLive();
}

class Fish implements Locable, Sea {

	@Override
	public void printLive() {
		System.out.println("�ٴٿ� ��ϴ�.");
	}
}

class Tiger implements Locable, Ground {

	@Override
	public void printLive() {
		System.out.println("������ ��ϴ�.");
	}
}

class InstanceofInterface {


	public static void checkLocation(Locable loc) {
		
		if (loc instanceof Sea) {
			System.out.println("�ٴٿ� ��ϴ�.");
		} else if (loc instanceof Ground) {
			System.out.println("������ ��ϴ�.");
		} else {
			System.out.println("�ϴÿ� �����");
		}
	
	}
	
	public static void main(String[] args) {
		Fish fish = new Fish();
		Tiger tiger = new Tiger();

		checkLocation(fish);
		checkLocation(tiger);

	}
}