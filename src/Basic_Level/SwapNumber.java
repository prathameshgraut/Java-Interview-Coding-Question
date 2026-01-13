package Basic_Level;

public class SwapNumber {

	static void print() {
		int A=60;
		int B=30;
		
		/*Swapping Number Without using Another Data-Type*/
		A=A+B;
		B=A-B;
		A=A-B;
		
		System.out.println("A="+A+"\n"+"B="+B);
	}
	
	public static void main(String[] args) {
		print();
	}

}
