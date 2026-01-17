package Basic_Level;

public class Overloading {
	
	/*Performed Overloading Operation , Same Function Name But Different Type Of Parameter*/
	static void Student(int no,String name) {
		System.out.println("Roll No :"+no+"\tName :"+name);
	}
	
	static void Student(String address , double mark) {
		System.out.println("Address :"+address+"\tMarks :"+mark);
	}
	
	static void Student(long mobno,String grade) {
		System.out.println("Mobile No :"+mobno+"\tGrade :"+grade);
	}
	
	static void Student(String sub,String std) {
		System.out.println("Subject :"+sub+"\tStandard :"+std);
	}
	
	public static void main(String[] args) {
		System.out.println("Print Of Details Using A Method Overloading......");
		Student(101,"Prathamesh Raut");
		Student("Jamner",78.9);
		Student(8010807120l,"A+");
		Student("Java","14th");
	}
}
