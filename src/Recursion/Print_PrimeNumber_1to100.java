package Recursion;

public class Print_PrimeNumber_1to100 {
	
	public static void show(int num,int N) {
		if(num<=100) {
			if(num%N!=0) {
				System.out.print(num+" ");
			}
			show(num+1,N++);
		}
	}
	
	public static void main(String[] args) {
		show(1,2);
	}
}
