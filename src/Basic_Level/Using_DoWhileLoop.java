package Basic_Level;

public class Using_DoWhileLoop {

	
	static void loop() {
		int num=1;
		System.out.println("Print 1 To 10 Using Do-While loop,");
		do {
			System.out.println(num);
			num++;
		}while(num<=10);
	}
	
	public static void main(String[] args) {
		loop();
	}

}
