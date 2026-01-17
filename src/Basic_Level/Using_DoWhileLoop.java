package Basic_Level;

public class Using_DoWhileLoop {

	//Do-While Loop it's First up All Executed The Execution & Then After Checking Condition
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
