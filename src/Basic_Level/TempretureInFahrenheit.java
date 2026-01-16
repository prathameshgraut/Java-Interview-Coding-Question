package Basic_Level;

import java.util.Scanner;

public class TempretureInFahrenheit {

	static void print() {
		Scanner sc = new Scanner(System.in);
		int temp;
		System.out.print("Enter A Tempreture =");
		temp=sc.nextInt();
		
		double f = (temp*9/5)+32;
		System.out.println("Tempreture In Fahrenheit : "+f);
	}
	
	public static void main(String[] args) {
		print();
	}

}
