package Recursion;

public class Print_PrimeNumber_1to100 {
	
	public static void show(int num) {
		int N=2;
		if(num<=100) {
			if(num%N==1) {
				System.out.print(num+" ");
				N++;
			}
		}
		show(num+1);
	}
	
	public static void main(String[] args) {
		show(1);
	}
}
