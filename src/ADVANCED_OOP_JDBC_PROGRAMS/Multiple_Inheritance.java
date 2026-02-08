package ADVANCED_OOP_JDBC_PROGRAMS;

public class Multiple_Inheritance implements A,B {
	
	@Override
	public void Sound() {
		System.out.println("This Class A Method .....");
	}
	
	@Override
	public void Hello() {
		System.out.println("This Class B Method .....");
	}

	public static void main(String[] args) {
		Multiple_Inheritance mi = new Multiple_Inheritance();
		mi.Sound();
		mi.Hello();
	}
}
