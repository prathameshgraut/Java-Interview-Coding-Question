package Basic_Level;

public class Fibonacci_Series {
	static void print(int f1,int f2) {
		System.out.print(f1+" "+f2+" ");
		for(int i=0;i<=10;i++) {
			int f3=f1+f2;
			System.out.print(f3+" ");
			
			f1=f2;
			f2=f3;
		}
	}
	public static void main(String[] args) {
		System.out.println("Print Fibonnaci Series ,");
		print(0,1);
	}
}
