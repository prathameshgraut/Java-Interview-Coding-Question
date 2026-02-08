package Recursion;

public class Check_PrimeNumber {
	
	static void Show(int num,int i) {
		if(i==num) {
			System.out.println("Is Prime Number");
			return;
		}
		
		if(num%i==0) {
			System.out.println("Is Not Prime Number");
			return;
		}
		Show(num,i+1);
	}
	
	public static void main(String[] args) {
		Show(3,2);
	}
}
