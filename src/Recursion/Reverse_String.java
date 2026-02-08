package Recursion;

public class Reverse_String {
	
	static void Show(String str) {
		if(str.length()==0) {
			return;
		}
		Show(str.substring(1));
		System.out.print(str.charAt(0));
	}
	
	
	public static void main(String[] args) {
		Show("Prathamesh");
	}
}
