package Recursion;

public class Find_FactorialNumber {
	static int fact=1;
	static void Show(int num) {
		if(num==0 || num==1) {
			System.out.println(fact);
			return;
		}
		fact=fact*num;
		Show(num-1);
	}
	
	public static void main(String[] args) {
		Show(5);
	}
}
