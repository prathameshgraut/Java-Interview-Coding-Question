package Basic_Level;

public class Print1TO100WithoutNumber {
	
	/*Print 1 To 100 Without Using Number */
	static void Print() {
		System.out.println("Print 1 To 100 Without Using Number,");
		for(int i='A'-'@';i<'e';i++) {
			System.out.print(i+" ");
		}
	}
	
	/*Print 1 To 100 Using Number*/
	static void display() {
		System.out.println("\n\nPrint 1 To 100 Using Number,");
		for(int i=1;i<=100;i++) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		Print();
		display();
	}
}
