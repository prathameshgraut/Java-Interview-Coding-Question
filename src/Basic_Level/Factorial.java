package Basic_Level;

import java.util.Scanner;

public class Factorial {

	/*This is Print Factorial Using Hard Coded Data*/
	static void print(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(num+" Is Factorial = "+fact);
	}
	
	
	/*This Is Instance Method & Using User-Input*/
	public void show() {
		Scanner sc = new Scanner(System.in);
		int num,fact=1;
		System.out.print("Enter A Number = ");
		num=sc.nextInt();

		for(int i=1;i<=num;i++) {
			fact = fact * i;
		}
		System.out.println(num+" Is Factorial = "+fact);
			
	}
	public static void main(String[] args) {
		print(5);
		
		Factorial f1= new Factorial();
		f1.show();                      //Calling instance Method
	}

}
