package Basic_Level;

public class SwapNumber {

	static void print() {
		int A=60;
		int B=30;
		System.out.println("Before Swapping Number,\n"+"A="+A+"\nB="+B);
		/*Swapping Number Without using Another Data-Type*/
		A=A+B;
		B=A-B;
		A=A-B;
		
		System.out.println("\nAfter Swapping Number,\n"+"A="+A+"\nB="+B);
	}
	
	public static void main(String[] args) {
		print();
	}

}
