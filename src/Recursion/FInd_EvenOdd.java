package Recursion;

public class FInd_EvenOdd {
	
	static void Show(int num) {
		if(num>=1 && num<=100) {
			if(num%2==0) {
				System.out.println("Even :"+num);
			}else {
				System.out.println("Odd  :"+num);
			}
		}
		Show(num+1);
	}
	
	public static void main(String[] args) {
		Show(1);
	}
}
