package Recursion;

public class Fibonacci_Series {
	static void Show(int f1,int f2,int num) {
		if(num==0) {
			return;
		}
		int f3=f1+f2;
		System.out.print(f3+" ");
		Show(f2,f3,num-1);
	}
	
	public static void main(String[] args) {
		int f1=0,f2=1;
		System.out.print(f1+" "+f2+" ");
		Show(f1,f2,10);
	}
}
