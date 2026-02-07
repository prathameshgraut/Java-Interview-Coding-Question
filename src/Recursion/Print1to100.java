package Recursion;

public class Print1to100 {
	
	static void show(int num) {
		
		/*Print 1 to 100 Without Using Any Loop */
		if(num>=1 && num<=100) {
			System.out.print(num+" ");
		}
		show(num+1);
	}
	
	public static void main(String[] args) {
		int num=1;
		show(num);
	}
}
