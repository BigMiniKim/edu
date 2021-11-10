import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Student{
	private String name;
	private String dept;
	private String number;
	private double grade;
	
	public Student(String name, String dept, String number, double grade) {
		this.name = name;
		this.dept = dept;
		this.number = number;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public void findStudent(String name) {
	 if(this.name.equals(name)) {
		  System.out.println(this.name+", "+this.dept+", "+this.number+", "+this.grade);
	 }	
		
	}	
		
}


public class StudentTest {

	public static void main(String[] args) {
		final int STU_NUM = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		
		ArrayList<Student> arrList = new ArrayList<>();
		
		for(int i=0; i<STU_NUM;i++) {
			System.out.print(">> ");
			String text = sc.nextLine();
			
			StringTokenizer st = new StringTokenizer(text,",");
	        String name = st.nextToken().trim();
	        String dept = st.nextToken().trim();
	        String number = st.nextToken().trim();
	        double grade = Double.valueOf(st.nextToken().trim());
			
	        arrList.add(new Student(name,dept,number,grade));
		}
		
		for(int i=0; i < arrList.size();i++) {
			System.out.print("-----------------------");
			Student student = arrList.get(i);
			
	        System.out.println("이름: "+student.getName());
	        System.out.println("학과: "+student.getDept());
	        System.out.println("학번: "+student.getNumber());
	        System.out.println("학점평균: "+student.getGrade());			
		}
		
		System.out.println("----------------------------------");
		
	    while(true) {
	        System.out.print("학생 이름 >> ");
	        String name = sc.next();

	        if(name.equals("그만"))
	            break;

	        for(int i=0; i< arrList.size(); i++) {
	            Student s = arrList.get(i);
	            s.findStudent(name);
	        }
	    }

	    System.out.println("종료");

	}
		
}


