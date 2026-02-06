package String_Program;

import java.util.Arrays;

public class Split_Trim_Method {
public static void main(String[] args) {
	String str="  Prathmesh";
	
	//Using a Split Method It's Use To stored All Character Inside Array Format
	String stored[]=str.split("");
	System.out.println("Using A Split Function :"+Arrays.toString(stored));
	
	//Using Trim To Remove White Spaces In String
	System.out.println("\nShow Actual String  :"+str);
	System.out.println("Using Trim Function :"+str.trim());
}
}
