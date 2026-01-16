package Basic_Level;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {
	
	/*Print Date & Time Using Package*/
	static void print() {
		LocalDateTime lc = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println("Current Date & Time ="+lc.format(format));
	}
	
	
	/*Print Date & Time Directly*/
	static void simple() {
		System.out.println("Current Date And Time ="+LocalDateTime.now());
	}
public static void main(String[] args) {
	print();
	simple();
}
}
