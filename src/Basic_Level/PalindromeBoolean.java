package Basic_Level;

import java.util.Scanner;

public class PalindromeBoolean {
	
	/*Using Hard Coded Data & Print Boolean Value = true OR false*/
	static void print() {
		int num=151;
		int sum=num,add,res=0;
		
		while(num>0) {
			add=num%10;
			res=res*10+add;
			num=num/10;
		}
		if(sum==res)
			System.out.println(true);
		else
			System.out.println(false);
	}
	
	/*Use_input Method*/
	static void user(int num) {
		int sum=num,add,res=0;

		while(num>0) {
			add=num%10;
			res=res*10+add;
			num=num/10;
		}
		if(sum==res)
			System.out.println(true);
		else
			System.out.println(false);
	}
public static void main(String[] args) {
	print();
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter A Number =");
	int num;
	num=sc.nextInt();
	user(num);
}
}
