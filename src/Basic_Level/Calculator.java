package Basic_Level;

import java.util.Scanner;

public class Calculator {

	static void addition() {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.print("Enter First Number =");
		num1=sc.nextInt();
		System.out.print("Enter Second Number =");
		num2=sc.nextInt();
		int add = num1+num2;
		System.out.println(num1+" + "+num2+" = "+add);
	}

	static void subs() {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.print("Enter First Number =");
		num1=sc.nextInt();
		System.out.print("Enter Second Number =");
		num2=sc.nextInt();
		int sub = num1-num2;
		System.out.println(num1+" - "+num2+" = "+sub);
	}

	static void mul() {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.print("Enter First Number =");
		num1=sc.nextInt();
		System.out.print("Enter Second Number =");
		num2=sc.nextInt();
		int mul = num1*num2;
		System.out.println(num1+" * "+num2+" = "+mul);
	}

	static void Division() {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.print("Enter First Number =");
		num1=sc.nextInt();
		System.out.print("Enter Second Number =");
		num2=sc.nextInt();
		int div = num1/num2;
		System.out.println(num1+" / "+num2+" = "+div);
	}

	static void modulus() {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.print("Enter First Number =");
		num1=sc.nextInt();
		System.out.print("Enter Second Number =");
		num2=sc.nextInt();
		int mod = num1%num2;
		System.out.println(num1+" % "+num2+" = "+mod);
	}

	public static void main(String[] args) {
		System.out.println("Wel-Come To Calculator Application");
		while (true) {
			System.out.println("\n\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Exit");
			System.out.print("Enter Your Choice = ");
			int ch;
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				addition();
				break;

			case 2:
				subs();
				break;

			case 3:
				mul();
				break;

			case 4:
				Division();
				break;

			case 5:
				modulus();
				break;

			case 6:
				System.out.println("Exit...");
				return;

			default:
				System.out.println("Invalid Choice...Try Again");
				break;
			}
		}
	}
}
