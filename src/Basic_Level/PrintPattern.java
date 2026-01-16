package Basic_Level;

public class PrintPattern {

	static void simplePattern() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		simplePattern();
	}

}
