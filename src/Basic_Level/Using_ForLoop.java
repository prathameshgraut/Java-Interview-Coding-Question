package Basic_Level;

public class Using_ForLoop {

	// For Loop Used For Known As Starting And Ending Position.....

	static void loop() {
		System.out.println("Using For Loop And Print-Out 0 To 20 Number,");
		for (int i = 0; i <= 20; i++)
			System.out.println(i);
	}

	
	// This Loop Calling 1st Loop first Time Then inner loop Calling Completely 5 Time This Process Repeat Based on Outer Loop 
	//Looping Process
	static void repeat() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		loop();
		repeat();
	}

}
